package io.tatum.model.response.vet;

import java.math.BigDecimal;

public class VetTxMeta {

    /**
     *
     * @type {string}
     * @memberof VetTxMeta
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
     * @memberof VetTxMeta
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
     * @memberof VetTxMeta
     */
    private BigDecimal blockTimestamp;

    public BigDecimal getBlockTimestamp() {
        return blockTimestamp;
    }

    public void setBlockTimestamp(BigDecimal blockTimestamp) {
        this.blockTimestamp = blockTimestamp;
    }
}
