package com.eter.gtw.rest.controller;

import javax.persistence.EntityManager;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.eter.gtw.model.json.BucketTransaction;
import com.eter.gtw.model.json.CommonResponse;
import com.eter.gtw.model.json.DeliveryOrder;
import com.eter.gtw.model.json.ReceiveOrder;
import com.eter.gtw.model.json.SalesInvoice;
import com.eter.gtw.utils.JSONParser;
import com.eter.gtw.utils.URLConstants;
import com.ifm.domain.transaction.T_DeliveryOrder;
import com.ifm.domain.transaction.T_ReceiveOrder;
import com.ifm.domain.transaction.T_SalesInvoice;

@RestController
public class TransactionController extends BaseController {
    private static final Logger LOGGER = Logger
            .getLogger(TransactionController.class);

    @RequestMapping(value = URLConstants.URL_RECEIVE_ORDER_ADD, method = RequestMethod.POST)
    public CommonResponse receiveOrder(@RequestBody ReceiveOrder order) {
        try {
            LOGGER.debug("order : " + order.toString());
            T_ReceiveOrder receiveOrder = JSONParser.parseReceiveOrder(order);

            try {
                pm.Save(receiveOrder);
            } catch (Exception e) {
                throw e;
            }

            return new CommonResponse("00", "Success");
        } catch (Exception e) {
            LOGGER.error(e.toString());
            return new CommonResponse("99", e.toString());
        }
    }

    @RequestMapping(value = URLConstants.URL_SALES_INVOICE_ADD, method = RequestMethod.POST)
    public CommonResponse salesInvoice(@RequestBody SalesInvoice invoice) {
        try {
            LOGGER.debug("invoice : " + invoice.toString());
            T_SalesInvoice salesInvoice = JSONParser.parseSalesInvoice(invoice);

            try {
                pm.Save(salesInvoice);
            } catch (Exception e) {
                throw e;
            }

            return new CommonResponse("00", "Success");
        } catch (Exception e) {
            LOGGER.error(e.toString());
            return new CommonResponse("99", e.toString());
        }
    }

    @RequestMapping(value = URLConstants.URL_DELIVERY_ORDER_ADD, method = RequestMethod.POST)
    public CommonResponse deliveryOrder(@RequestBody DeliveryOrder order) {
        try {
            LOGGER.debug("delivery : " + order.toString());
            T_DeliveryOrder deliveryOrder = JSONParser
                    .parseDeliveryOrder(order);

            try {
                pm.Save(deliveryOrder);
            } catch (Exception e) {
                throw e;
            }

            return new CommonResponse("00", "Success");
        } catch (Exception e) {
            LOGGER.error(e.toString());
            return new CommonResponse("99", e.toString());
        }
    }

    @RequestMapping(value = URLConstants.URL_BUCKET_TRANSACTION_ADD, method = RequestMethod.POST)
    public CommonResponse bucketTransaction(@RequestBody BucketTransaction trx) {
        try {
            LOGGER.debug("bucket : " + trx.toString());
            T_ReceiveOrder receiveOrder = JSONParser.parseReceiveOrder(trx
                    .getReceiveOrder());
            T_SalesInvoice salesInvoice = JSONParser.parseSalesInvoice(trx
                    .getSalesInvoice());
            T_DeliveryOrder deliveryOrder = JSONParser.parseDeliveryOrder(trx
                    .getDeliveryOrder());

            EntityManager entityManager = null;
            try {
                entityManager = pmf.getEntityManager();
                entityManager.getTransaction().begin();

                LOGGER.info("saving receive order . . .");
                pmf.Save(receiveOrder);
                LOGGER.info("receive order saved.");
                LOGGER.info("saving delivery order . . .");
                pmf.Save(deliveryOrder);
                LOGGER.info("delivery order saved.");
                LOGGER.info("saving sales invoice . . .");
                pmf.Save(salesInvoice);
                LOGGER.info("sales invoice saved.");

                entityManager.getTransaction().commit();

            } catch (Exception e) {
                LOGGER.error(e.toString());

                LOGGER.info("rolling back transactions . . .");
                if (entityManager != null
                        && entityManager.getTransaction().isActive()) {
                    entityManager.getTransaction().rollback();
                }
                LOGGER.info("transactions rolled back.");

                throw e;
            }

            return new CommonResponse("00", "Success");
        } catch (Exception e) {
            LOGGER.error(e.toString());
            return new CommonResponse("99", e.toString());
        }
    }
}
