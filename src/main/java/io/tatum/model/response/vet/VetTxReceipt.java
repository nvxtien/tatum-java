package io.tatum.model.response.vet;

import java.math.BigDecimal;

public class VetTxReceipt {

    /**
     *
     * @type {number}
     * @memberof VetTxReceipt
     */
    private BigDecimal gasUsed;

    public BigDecimal getGasUsed() {
        return gasUsed;
    }

    public void setGasUsed(BigDecimal gasUsed) {
        this.gasUsed = gasUsed;
    }

    /**
     *
     * @type {string}
     * @memberof VetTxReceipt
     */
    private String gasPayer;

    public String getGasPayer() {
        return gasPayer;
    }

    public void setGasPayer(String gasPayer) {
        this.gasPayer = gasPayer;
    }

    /**
     *
     * @type {string}
     * @memberof VetTxReceipt
     */
    private String paid;

    public String getPaid() {
        return paid;
    }

    public void setPaid(String paid) {
        this.paid = paid;
    }

    /**
     *
     * @type {string}
     * @memberof VetTxReceipt
     */
    private String reward;

    public String getReward() {
        return reward;
    }

    public void setReward(String reward) {
        this.reward = reward;
    }

    /**
     *
     * @type {boolean}
     * @memberof VetTxReceipt
     */
    private Boolean reverted;

    public Boolean getReverted() {
        return reverted;
    }

    public void setReverted(Boolean reverted) {
        this.reverted = reverted;
    }

    /**
     *
     * @type {VetTxReceiptMeta}
     * @memberof VetTxReceipt
     */
    private VetTxReceiptMeta meta;

    public VetTxReceiptMeta getMeta() {
        return meta;
    }

    public void setMeta(VetTxReceiptMeta meta) {
        this.meta = meta;
    }

    /**
     *
     * @type {Array<VetTxReceiptOutputs>}
     * @memberof VetTxReceipt
     */
    private VetTxReceiptOutputs[] outputs;

    public VetTxReceiptOutputs[] getOutputs() {
        return outputs;
    }

    public void setOutputs(VetTxReceiptOutputs[] outputs) {
        this.outputs = outputs;
    }

    /**
     *
     * @type {number}
     * @memberof VetTxReceipt
     */
    private BigDecimal blockNumber;

    public BigDecimal getBlockNumber() {
        return blockNumber;
    }

    public void setBlockNumber(BigDecimal blockNumber) {
        this.blockNumber = blockNumber;
    }

    /**
     *
     * @type {string}
     * @memberof VetTxReceipt
     */
    private String blockHash;

    public String getBlockHash() {
        return blockHash;
    }

    public void setBlockHash(String blockHash) {
        this.blockHash = blockHash;
    }

    /**
     *
     * @type {string}
     * @memberof VetTxReceipt
     */
    private String transactionHash;

    public String getTransactionHash() {
        return transactionHash;
    }

    public void setTransactionHash(String transactionHash) {
        this.transactionHash = transactionHash;
    }

    /**
     *
     * @type {string}
     * @memberof VetTxReceipt
     */
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
