package io.tatum.model.response.vet;

import java.math.BigDecimal;

public class VetEstimateGas {

    /**
     * Sender
     * @type {string}
     * @memberof VetEstimateGas
     */
    String from;

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * Recipient
     * @type {string}
     * @memberof VetEstimateGas
     */
    String to;

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    /**
     * Amount to send
     * @type {string}
     * @memberof VetEstimateGas
     */
    String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Data to send to Smart Contract
     * @type {string}
     * @memberof VetEstimateGas
     */
    String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    /**
     * Nonce
     * @type {number}
     * @memberof VetEstimateGas
     */
    BigDecimal nonce;

    public BigDecimal getNonce() {
        return nonce;
    }

    public void setNonce(BigDecimal nonce) {
        this.nonce = nonce;
    }
}
