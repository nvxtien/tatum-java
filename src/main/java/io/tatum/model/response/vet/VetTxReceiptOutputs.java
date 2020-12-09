package io.tatum.model.response.vet;

import java.util.List;

public class VetTxReceiptOutputs {

    /**
     *
     * @type {Array<any>}
     * @memberof VetTxReceiptOutputs
     */
    private List[] events;

    public List[] getEvents() {
        return events;
    }

    public void setEvents(List[] events) {
        this.events = events;
    }

    /**
     *
     * @type {Array<VetTxReceiptTransfers>}
     * @memberof VetTxReceiptOutputs
     */
    private VetTxReceiptTransfers[] transfers;

    public VetTxReceiptTransfers[] getTransfers() {
        return transfers;
    }

    public void setTransfers(VetTxReceiptTransfers[] transfers) {
        this.transfers = transfers;
    }
}
