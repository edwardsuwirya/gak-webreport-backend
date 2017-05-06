package com.eter.gtw.model.json;

public class BucketTransaction {
    private ReceiveOrder receiveOrder;
    private SalesInvoice salesInvoice;
    private DeliveryOrder deliveryOrder;

    public ReceiveOrder getReceiveOrder() {
        return receiveOrder;
    }

    public void setReceiveOrder(ReceiveOrder receiveOrder) {
        this.receiveOrder = receiveOrder;
    }

    public SalesInvoice getSalesInvoice() {
        return salesInvoice;
    }

    public void setSalesInvoice(SalesInvoice salesInvoice) {
        this.salesInvoice = salesInvoice;
    }

    public DeliveryOrder getDeliveryOrder() {
        return deliveryOrder;
    }

    public void setDeliveryOrder(DeliveryOrder deliveryOrder) {
        this.deliveryOrder = deliveryOrder;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("receiveOrder : " + (receiveOrder == null ? "" : receiveOrder.toString()));
        sb.append("salesInvoice : " + (salesInvoice == null ? "" : salesInvoice.toString()));
        sb.append("deliveryOrder : " + (deliveryOrder == null ? "" : deliveryOrder.toString()));

        return sb.toString();
    }
}
