package io.tatum.model.response.vet;

import java.math.BigDecimal;

public class VetTxReceiptMeta {
    /**
     *
     * @type {string}
     * @memberof VetTxReceiptMeta
     */
    private String blockID;

    public String getBlockID() {
        return blockID;
    }

    public void setBlockID(String blockID) {
        this.blockID = blockID;
    }

    /**
     *
     * @type {number}
     * @memberof VetTxReceiptMeta
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
     * @type {number}
     * @memberof VetTxReceiptMeta
     */
    private BigDecimal blockTimestamp;

    public BigDecimal getBlockTimestamp() {
        return blockTimestamp;
    }

    public void setBlockTimestamp(BigDecimal blockTimestamp) {
        this.blockTimestamp = blockTimestamp;
    }

    /**
     *
     * @type {string}
     * @memberof VetTxReceiptMeta
     */
    private String txID;

    public String getTxID() {
        return txID;
    }

    public void setTxID(String txID) {
        this.txID = txID;
    }

    /**
     *
     * @type {string}
     * @memberof VetTxReceiptMeta
     */
    private String txOrigin;

    public String getTxOrigin() {
        return txOrigin;
    }

    public void setTxOrigin(String txOrigin) {
        this.txOrigin = txOrigin;
    }
}
