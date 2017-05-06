package com.eter.gtw.utils;

import java.util.HashSet;
import java.util.Set;

import org.springframework.util.StringUtils;

import com.eter.gtw.model.json.DeliveryOrder;
import com.eter.gtw.model.json.DeliveryOrderDetail;
import com.eter.gtw.model.json.ReceiveOrder;
import com.eter.gtw.model.json.ReceiveOrderDetail;
import com.eter.gtw.model.json.SalesInvoice;
import com.eter.gtw.model.json.SalesInvoiceDetail;
import com.eter.gtw.model.json.SalesInvoicePayment;
import com.ifm.domain.master.M_Article;
import com.ifm.domain.master.M_Bank;
import com.ifm.domain.master.M_CardType;
import com.ifm.domain.master.M_Coating;
import com.ifm.domain.master.M_Company;
import com.ifm.domain.master.M_Currency;
import com.ifm.domain.master.M_Customer;
import com.ifm.domain.master.M_Division;
import com.ifm.domain.master.M_Edc;
import com.ifm.domain.master.M_Employee;
import com.ifm.domain.master.M_PaymentType;
import com.ifm.domain.master.M_ResponsibilityCenter;
import com.ifm.domain.master.M_Uom;
import com.ifm.domain.master.M_Warehouse;
import com.ifm.domain.transaction.T_DeliveryOrder;
import com.ifm.domain.transaction.T_DeliveryOrderD;
import com.ifm.domain.transaction.T_ReceiveOrder;
import com.ifm.domain.transaction.T_ReceiveOrderD;
import com.ifm.domain.transaction.T_SalesInvoice;
import com.ifm.domain.transaction.T_SalesInvoiceD;
import com.ifm.domain.transaction.T_SalesInvoicePayment;
import com.ifm.domain.transaction.T_SalesOrder;

public class JSONParser {
    public static T_ReceiveOrder parseReceiveOrder(ReceiveOrder order) {
        if (order == null) {
            return null;
        }

        T_ReceiveOrder receiveOrder = new T_ReceiveOrder();
        receiveOrder.setS_receiveOrderNo(order.getS_receiveOrderNo());

        if (!StringUtils.isEmpty(order.getCompany())) {
            M_Company company = new M_Company();
            company.setS_companyCode(order.getCompany());
            receiveOrder.setCompany(company);
        }

        if (!StringUtils.isEmpty(order.getResponsibilitycenter())) {
            M_ResponsibilityCenter responsibilityCenter = new M_ResponsibilityCenter();
            responsibilityCenter.setS_responsibilityCenterCode(order.getResponsibilitycenter());
            receiveOrder.setResponsibilitycenter(responsibilityCenter);
        }

        if (!StringUtils.isEmpty(order.getCurrency())) {
            M_Currency currency = new M_Currency();
            currency.setS_currencyCode(order.getCurrency());
            receiveOrder.setCurrency(currency);
        }

        if (!StringUtils.isEmpty(order.getCustomer())) {
            M_Customer customer = new M_Customer();
            customer.setS_customerCode(order.getCustomer());
            receiveOrder.setCustomer(customer);
        }

        if (!StringUtils.isEmpty(order.getWarehouse())) {
            M_Warehouse warehouse = new M_Warehouse();
            warehouse.setS_warehouseCode(order.getWarehouse());
            receiveOrder.setWarehouse(warehouse);
        }

        receiveOrder.setS_receiveOrderRealNo(order.getS_receiveOrderRealNo());

        receiveOrder.setD_receiveOrderDate(order.getD_receiveOrderDate());

        receiveOrder.setD_receiveOrderExRate(order.getD_receiveOrderExRate());
        receiveOrder.setS_receiveOrderAddress(order.getS_receiveOrderAddress());
        receiveOrder.setS_receiveOrderSpecialInstruction(order.getS_receiveOrderSpecialInstruction());
        receiveOrder.setD_receiveOrderSubTotal(order.getD_receiveOrderSubTotal());
        receiveOrder.setD_receiveOrderDiscount(order.getD_receiveOrderDiscount());
        receiveOrder.setD_receiveOrderVoucher(order.getD_receiveOrderVoucher());
        receiveOrder.setD_receiveOrderTax(order.getD_receiveOrderTax());
        receiveOrder.setD_receiveOrderPph(order.getD_receiveOrderPph());
        receiveOrder.setD_receiveOrderServiceCharge(order.getD_receiveOrderServiceCharge());
        receiveOrder.setD_receiveOrderBonus(order.getD_receiveOrderBonus());
        receiveOrder.setD_receiveOrderGrandTotal(order.getD_receiveOrderGrandTotal());
        receiveOrder.setS_receiveOrderStatus(order.getS_receiveOrderStatus());
        receiveOrder.setI_receiveOrderPrinted(order.getI_receiveOrderPrinted());
        receiveOrder.setS_receiveOrderNote1(order.getS_receiveOrderNote1());
        receiveOrder.setS_receiveOrderNote2(order.getS_receiveOrderNote2());
        receiveOrder.setS_receiveOrderNote3(order.getS_receiveOrderNote3());
        receiveOrder.setI_receiveOrderCreateID(order.getI_receiveOrderCreateID());
        receiveOrder.setD_receiveOrderCreateDate(order.getD_receiveOrderCreateDate());
        receiveOrder.setI_receiveOrderApproveID(order.getI_receiveOrderApproveID());
        receiveOrder.setD_receiveOrderApproveDate(order.getD_receiveOrderApproveDate());
        receiveOrder.setI_receiveOrderCancelID(order.getI_receiveOrderCancelID());
        receiveOrder.setD_receiveOrderCancelDate(order.getD_receiveOrderCancelDate());
        receiveOrder.setS_receiveOrderCancelReason(order.getS_receiveOrderCancelReason());
        receiveOrder.setI_receiveOrderUpdateID(order.getI_receiveOrderUpdateID());
        receiveOrder.setD_receiveOrderUpdateDate(order.getD_receiveOrderUpdateDate());
        receiveOrder.setS_receiveOrderActive(order.getS_receiveOrderActive());

        if (order.getDetails() != null && order.getDetails().size() > 0) {
            Set<T_ReceiveOrderD> details = new HashSet<T_ReceiveOrderD>();

            for (ReceiveOrderDetail d : order.getDetails()) {
                details.add(parseReceiveOrderDetail(d));
            }

            receiveOrder.setDetails(details);
        }

        return receiveOrder;
    }

    public static T_ReceiveOrderD parseReceiveOrderDetail(ReceiveOrderDetail detail) {
        if (detail == null) {
            return null;
        }

        T_ReceiveOrderD d = new T_ReceiveOrderD();
        d.setS_receiveOrderDNo(detail.getS_receiveOrderDNo());

        if (!StringUtils.isEmpty(detail.getUom())) {
            M_Uom uom = new M_Uom();
            uom.setS_uomCode(detail.getUom());
            d.setUom(uom);
        }

        d.setI_receiveOrderDSequence(detail.getI_receiveOrderDSequence());
        d.setI_receiveOrderDItemType(detail.getI_receiveOrderDItemType());
        d.setS_receiveOrderDItemCode(detail.getS_receiveOrderDItemCode());
        d.setS_receiveOrderDItemRealCode(detail.getS_receiveOrderDItemRealCode());
        d.setS_receiveOrderDItemName(detail.getS_receiveOrderDItemName());
        d.setS_receiveOrderDSerialNo(detail.getS_receiveOrderDSerialNo());
        d.setD_receiveOrderDQtyFactor1(detail.getD_receiveOrderDQtyFactor1());
        d.setD_receiveOrderDQtyFactor2(detail.getD_receiveOrderDQtyFactor2());
        d.setD_receiveOrderDQty(detail.getD_receiveOrderDQty());
        d.setD_receiveOrderDQtyDelivered(detail.getD_receiveOrderDQtyDelivered());
        d.setD_receiveOrderDQtyPaid(detail.getD_receiveOrderDQtyPaid());
        d.setD_receiveOrderDPrice(detail.getD_receiveOrderDPrice());
        d.setD_receiveOrderDTotal(detail.getD_receiveOrderDTotal());
        d.setS_receiveOrderDComment(detail.getS_receiveOrderDComment());
        d.setB_receiveOrderDPictureFile(detail.getB_receiveOrderDPictureFile());
        d.setI_receiveOrderDUpdateID(detail.getI_receiveOrderDUpdateID());
        d.setD_receiveOrderDUpdateDate(detail.getD_receiveOrderDUpdateDate());

        return d;
    }


    public static T_SalesInvoice parseSalesInvoice(SalesInvoice invoice) {
        if (invoice == null) {
            return null;
        }

        T_SalesInvoice salesInvoice = new T_SalesInvoice();
        salesInvoice.setS_salesInvoiceNo(invoice.getS_salesInvoiceNo());

        if (!StringUtils.isEmpty(invoice.getCompany())) {
            M_Company company = new M_Company();
            company.setS_companyCode(invoice.getCompany());
            salesInvoice.setCompany(company);
        }

        if (!StringUtils.isEmpty(invoice.getResponsibilitycenter())) {
            M_ResponsibilityCenter responsibilityCenter = new M_ResponsibilityCenter();
            responsibilityCenter.setS_responsibilityCenterCode(invoice.getResponsibilitycenter());
            salesInvoice.setResponsibilitycenter(responsibilityCenter);
        }

        if (!StringUtils.isEmpty(invoice.getCurrency())) {
            M_Currency currency = new M_Currency();
            currency.setS_currencyCode(invoice.getCurrency());
            salesInvoice.setCurrency(currency);
        }

        if (!StringUtils.isEmpty(invoice.getCustomer())) {
            M_Customer customer = new M_Customer();
            customer.setS_customerCode(invoice.getCustomer());
            salesInvoice.setCustomer(customer);
        }

        if (!StringUtils.isEmpty(invoice.getReceiveorder())) {
            T_ReceiveOrder receiveOrder = new T_ReceiveOrder();
            receiveOrder.setS_receiveOrderNo(invoice.getReceiveorder());
            salesInvoice.setReceiveorder(receiveOrder);
        }

        if (!StringUtils.isEmpty(invoice.getDeliveryorder())) {
            T_DeliveryOrder deliveryOrder = new T_DeliveryOrder();
            deliveryOrder.setS_deliveryOrderNo(invoice.getDeliveryorder());
            salesInvoice.setDeliveryorder(deliveryOrder);
        }

        if (!StringUtils.isEmpty(invoice.getSalesorder())) {
            T_SalesOrder salesOrder = new T_SalesOrder();
            salesOrder.setS_salesOrderNo(invoice.getSalesorder());
            salesInvoice.setSalesorder(salesOrder);
        }

        if (!StringUtils.isEmpty(invoice.getSalesorder())) {
            M_Division division = new M_Division();
            division.setS_divisionCode(invoice.getDivision());
            salesInvoice.setDivision(division);
        }

        salesInvoice.setS_salesInvoiceRealNo(invoice.getS_salesInvoiceRealNo());
        salesInvoice.setS_salesInvoiceTaxNo(invoice.getS_salesInvoiceTaxNo());
        salesInvoice.setD_salesInvoiceDate(invoice.getD_salesInvoiceDate());
        salesInvoice.setD_salesInvoiceExRate(invoice.getD_salesInvoiceExRate());
        salesInvoice.setS_salesInvoiceAddress(invoice.getS_salesInvoiceAddress());
        salesInvoice.setD_salesInvoiceSubTotal(invoice.getD_salesInvoiceSubTotal());
        salesInvoice.setD_salesInvoiceDiscount(invoice.getD_salesInvoiceDiscount());
        salesInvoice.setD_salesInvoiceVoucher(invoice.getD_salesInvoiceVoucher());
        salesInvoice.setD_salesInvoiceTax(invoice.getD_salesInvoiceTax());
        salesInvoice.setD_salesInvoicePph(invoice.getD_salesInvoicePph());
        salesInvoice.setD_salesInvoiceServiceCharge(invoice.getD_salesInvoiceServiceCharge());
        salesInvoice.setD_salesInvoiceBonus(invoice.getD_salesInvoiceBonus());
        salesInvoice.setD_salesInvoiceAdditionalCharge1(invoice.getD_salesInvoiceAdditionalCharge1());
        salesInvoice.setD_salesInvoiceAdditionalCharge2(invoice.getD_salesInvoiceAdditionalCharge2());
        salesInvoice.setD_salesInvoiceGrandTotal(invoice.getD_salesInvoiceGrandTotal());
        salesInvoice.setS_salesInvoiceStatus(invoice.getS_salesInvoiceStatus());
        salesInvoice.setI_salesInvoicePrinted(invoice.getI_salesInvoicePrinted());
        salesInvoice.setS_salesInvoiceNote1(invoice.getS_salesInvoiceNote1());
        salesInvoice.setS_salesInvoiceNote2(invoice.getS_salesInvoiceNote2());
        salesInvoice.setS_salesInvoiceNote3(invoice.getS_salesInvoiceNote3());
        salesInvoice.setI_salesInvoiceCreateID(invoice.getI_salesInvoiceCreateID());
        salesInvoice.setD_salesInvoiceCreateDate(invoice.getD_salesInvoiceCreateDate());
        salesInvoice.setI_salesInvoiceApproveID(invoice.getI_salesInvoiceApproveID());
        salesInvoice.setD_salesInvoiceApproveDate(invoice.getD_salesInvoiceApproveDate());
        salesInvoice.setI_salesInvoiceCancelID(invoice.getI_salesInvoiceCancelID());
        salesInvoice.setD_salesInvoiceCancelDate(invoice.getD_salesInvoiceCancelDate());
        salesInvoice.setS_salesInvoiceCancelReason(invoice.getS_salesInvoiceCancelReason());
        salesInvoice.setI_salesInvoiceUpdateID(invoice.getI_salesInvoiceUpdateID());
        salesInvoice.setD_salesInvoiceUpdateDate(invoice.getD_salesInvoiceUpdateDate());
        salesInvoice.setS_salesInvoiceActive(invoice.getS_salesInvoiceActive());

        if (invoice.getDetails() != null && invoice.getDetails().size() > 0) {
            Set<T_SalesInvoiceD> details = new HashSet<T_SalesInvoiceD>();

            for (SalesInvoiceDetail d : invoice.getDetails()) {
                details.add(parseSalesInvoiceDetail(d));
            }

            salesInvoice.setDetails(details);
        }

        if (invoice.getPayments() != null && invoice.getPayments().size() > 0) {
            Set<T_SalesInvoicePayment> payments = new HashSet<T_SalesInvoicePayment>();

            for (SalesInvoicePayment p : invoice.getPayments()) {
                payments.add(parseSalesInvoicePayment(p));
            }

            salesInvoice.setPayments(payments);
        }

        return salesInvoice;
    }

    public static T_SalesInvoiceD parseSalesInvoiceDetail(SalesInvoiceDetail detail) {
        if (detail == null) {
            return null;
        }

        T_SalesInvoiceD d = new T_SalesInvoiceD();
        d.setS_salesInvoiceDNo(detail.getS_salesInvoiceDNo());

        if (!StringUtils.isEmpty(detail.getArticle())) {
            M_Article article = new M_Article();
            article.setS_articleCode(detail.getArticle());
            d.setArticle(article);
        }

        if (!StringUtils.isEmpty(detail.getUom())) {
            M_Uom uom = new M_Uom();
            uom.setS_uomCode(detail.getUom());
            d.setUom(uom);
        }

        d.setI_salesInvoiceDSequence(detail.getI_salesInvoiceDSequence());
        d.setI_salesInvoiceDRefSequence(detail.getI_salesInvoiceDRefSequence());
        d.setS_salesinvoiceDSerialNo(detail.getS_salesinvoiceDSerialNo());
        d.setD_salesInvoiceDQty(detail.getD_salesInvoiceDQty());
        d.setD_salesInvoiceDQtyRetur(detail.getD_salesInvoiceDQtyRetur());
        d.setD_salesInvoiceDQtyTax(detail.getD_salesInvoiceDQtyTax());
        d.setD_salesInvoiceDSubTotal(detail.getD_salesInvoiceDSubTotal());
        d.setD_salesInvoiceDDiscount(detail.getD_salesInvoiceDDiscount());
        d.setD_salesInvoiceDVoucher(detail.getD_salesInvoiceDVoucher());
        d.setD_salesInvoiceDTax(detail.getD_salesInvoiceDTax());
        d.setD_salesInvoiceDPph(detail.getD_salesInvoiceDPph());
        d.setD_salesInvoiceDServiceCharge(detail.getD_salesInvoiceDServiceCharge());
        d.setD_salesInvoiceDBonus(detail.getD_salesInvoiceDBonus());
        d.setD_salesInvoiceDGrandTotal(detail.getD_salesInvoiceDGrandTotal());
        d.setD_salesInvoiceDLengthDefault(detail.getD_salesInvoiceDLengthDefault());
        d.setS_salesinvoiceDTaxNo(detail.getS_salesinvoiceDTaxNo());
        d.setI_salesInvoiceDUpdateID(detail.getI_salesInvoiceDUpdateID());
        d.setD_salesInvoiceDUpdateDate(detail.getD_salesInvoiceDUpdateDate());

        return d;
    }

    public static T_SalesInvoicePayment parseSalesInvoicePayment(SalesInvoicePayment payment) {
        if (payment == null) {
            return null;
        }

        T_SalesInvoicePayment p = new T_SalesInvoicePayment();
        p.setS_salesInvoicePaymentNo(payment.getS_salesInvoicePaymentNo());

        if (!StringUtils.isEmpty(payment.getPaymenttype())) {
            M_PaymentType paymentType = new M_PaymentType();
            paymentType.setS_paymentTypeCode(payment.getPaymenttype());
            p.setPaymenttype(paymentType);
        }

        if (!StringUtils.isEmpty(payment.getCardtype())) {
            M_CardType cardType = new M_CardType();
            cardType.setS_cardTypeCode(payment.getCardtype());
            p.setCardtype(cardType);
        }

        if (!StringUtils.isEmpty(payment.getBank())) {
            M_Bank bank = new M_Bank();
            bank.setS_bankCode(payment.getBank());
            p.setBank(bank);
        }

        if (!StringUtils.isEmpty(payment.getEdc())) {
            M_Edc edc = new M_Edc();
            edc.setS_edcCode(payment.getEdc());
            p.setEdc(edc);
        }

        p.setD_salesInvoicePaymentDate(payment.getD_salesInvoicePaymentDate());
        p.setS_salesInvoicePaymentCardNo(payment.getS_salesInvoicePaymentCardNo());
        p.setD_salesInvoicePaymentAmount(payment.getD_salesInvoicePaymentAmount());
        p.setD_salesInvoicePaymentCharge(payment.getD_salesInvoicePaymentCharge());
        p.setD_salesInvoicePaymentPay(payment.getD_salesInvoicePaymentPay());
        p.setD_salesInvoicePaymentChange(payment.getD_salesInvoicePaymentChange());
        p.setI_salesInvoicePaymentUpdateID(payment.getI_salesInvoicePaymentUpdateID());
        p.setD_salesInvoicePaymentUpdateDate(payment.getD_salesInvoicePaymentUpdateDate());

        return p;
    }

    public static T_DeliveryOrder parseDeliveryOrder(DeliveryOrder delivery) {
        if (delivery == null) {
            return null;
        }

        T_DeliveryOrder deliveryOrder = new T_DeliveryOrder();
        deliveryOrder.setS_deliveryOrderNo(delivery.getS_deliveryOrderNo());

        if (!StringUtils.isEmpty(delivery.getCompany())) {
            M_Company company = new M_Company();
            company.setS_companyCode(delivery.getCompany());
            deliveryOrder.setCompany(company);
        }

        if (!StringUtils.isEmpty(delivery.getCustomer())) {
            M_Customer customer = new M_Customer();
            customer.setS_customerCode(delivery.getCustomer());
            deliveryOrder.setCustomer(customer);
        }

        if (!StringUtils.isEmpty(delivery.getWarehouse())) {
            M_Warehouse warehouse = new M_Warehouse();
            warehouse.setS_warehouseCode(delivery.getWarehouse());
            deliveryOrder.setWarehouse(warehouse);
        }

        if (!StringUtils.isEmpty(delivery.getReceiveorder())) {
            T_ReceiveOrder receiveOrder = new T_ReceiveOrder();
            receiveOrder.setS_receiveOrderNo(delivery.getReceiveorder());
            deliveryOrder.setReceiveorder(receiveOrder);
        }

        if (!StringUtils.isEmpty(delivery.getSalesorder())) {
            T_SalesOrder salesOrder = new T_SalesOrder();
            salesOrder.setS_salesOrderNo(delivery.getSalesorder());
            deliveryOrder.setSalesorder(salesOrder);
        }

        if (!StringUtils.isEmpty(delivery.getDriver())) {
            M_Employee driver = new M_Employee();
            driver.setS_employeeCode(delivery.getDriver());
            deliveryOrder.setDriver(driver);
        }

        deliveryOrder.setS_deliveryOrderRealNo(delivery.getS_deliveryOrderRealNo());
        deliveryOrder.setD_deliveryOrderDate(delivery.getD_deliveryOrderDate());
        deliveryOrder.setS_deliveryOrderAddress(delivery.getS_deliveryOrderAddress());
        deliveryOrder.setS_deliveryOrderSpecialInstruction(delivery.getS_deliveryOrderSpecialInstruction());
        deliveryOrder.setS_deliveryOrderReceiver(delivery.getS_deliveryOrderReceiver());
        deliveryOrder.setS_deliveryOrderStatus(delivery.getS_deliveryOrderStatus());
        deliveryOrder.setI_deliveryOrderPrinted(delivery.getI_deliveryOrderPrinted());
        deliveryOrder.setS_deliveryOrderNote1(delivery.getS_deliveryOrderNote1());
        deliveryOrder.setS_deliveryOrderNote2(delivery.getS_deliveryOrderNote2());
        deliveryOrder.setS_deliveryOrderNote3(delivery.getS_deliveryOrderNote3());
        deliveryOrder.setI_deliveryOrderCreateID(delivery.getI_deliveryOrderCreateID());
        deliveryOrder.setD_deliveryOrderCreateDate(delivery.getD_deliveryOrderCreateDate());
        deliveryOrder.setI_deliveryOrderApproveID(delivery.getI_deliveryOrderApproveID());
        deliveryOrder.setD_deliveryOrderApproveDate(delivery.getD_deliveryOrderApproveDate());
        deliveryOrder.setI_deliveryOrderCancelID(delivery.getI_deliveryOrderCancelID());
        deliveryOrder.setD_deliveryOrderCancelDate(delivery.getD_deliveryOrderCancelDate());
        deliveryOrder.setS_deliveryOrderCancelReason(delivery.getS_deliveryOrderCancelReason());
        deliveryOrder.setI_deliveryOrderUpdateID(delivery.getI_deliveryOrderUpdateID());
        deliveryOrder.setD_deliveryOrderUpdateDate(delivery.getD_deliveryOrderUpdateDate());
        deliveryOrder.setS_deliveryOrderActive(delivery.getS_deliveryOrderActive());

        if (delivery.getDetails() != null && delivery.getDetails().size() > 0) {
            Set<T_DeliveryOrderD> details = new HashSet<T_DeliveryOrderD>();

            for (DeliveryOrderDetail d : delivery.getDetails()) {
                details.add(parseDeliveryOrderDetail(d));
            }

            deliveryOrder.setDetails(details);
        }

        return deliveryOrder;
    }

    public static T_DeliveryOrderD parseDeliveryOrderDetail(DeliveryOrderDetail detail) {
        if (detail == null) {
            return null;
        }

        T_DeliveryOrderD d = new T_DeliveryOrderD();
        d.setS_deliveryOrderDNo(detail.getS_deliveryOrderDNo());

        if (!StringUtils.isEmpty(detail.getArticle())) {
            M_Article article = new M_Article();
            article.setS_articleCode(detail.getArticle());
            d.setArticle(article);
        }

        if (!StringUtils.isEmpty(detail.getUom())) {
            M_Uom uom = new M_Uom();
            uom.setS_uomCode(detail.getUom());
            d.setUom(uom);
        }

        if (!StringUtils.isEmpty(detail.getCoating())) {
            M_Coating coating = new M_Coating();
            coating.setS_coatingCode(detail.getCoating());
            d.setCoating(coating);
        }

        d.setI_deliveryorderDSequence(detail.getI_deliveryorderDSequence());
        d.setI_deliveryorderDRefSequence(detail.getI_deliveryorderDRefSequence());
        d.setS_deliveryorderDSerialNo(detail.getS_deliveryorderDSerialNo());
        d.setD_deliveryorderDQty(detail.getD_deliveryorderDQty());
        d.setD_deliveryorderDQtyRetur(detail.getD_deliveryorderDQtyRetur());
        d.setD_deliveryorderDLengthDefault(detail.getD_deliveryorderDLengthDefault());
        d.setS_deliveryOrderDDescription1(detail.getS_deliveryOrderDDescription1());
        d.setS_deliveryOrderDDescription2(detail.getS_deliveryOrderDDescription2());
        d.setI_deliveryorderDUpdateID(detail.getI_deliveryorderDUpdateID());
        d.setD_deliveryorderDUpdateDate(detail.getD_deliveryorderDUpdateDate());

        return d;
    }
}
