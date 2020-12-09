package io.tatum.model.response.vet;

public class VetTxReceiptTransfers {

    /**
     *
     * @type {string}
     * @memberof VetTxReceiptTransfers
     */
    private String sender;

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    /**
     *
     * @type {string}
     * @memberof VetTxReceiptTransfers
     */
    private String recipient;

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    /**
     *
     * @type {string}
     * @memberof VetTxReceiptTransfers
     */
    private String amount;

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
