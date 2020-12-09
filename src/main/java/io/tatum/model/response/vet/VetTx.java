package io.tatum.model.response.vet;

import java.math.BigDecimal;

public class VetTx {

    /**
     *
     * @type {string}
     * @memberof VetTx
     */
    String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     *
     * @type {string}
     * @memberof VetTx
     */
    String chainTag;

    public String getChainTag() {
        return chainTag;
    }

    public void setChainTag(String chainTag) {
        this.chainTag = chainTag;
    }

    /**
     *
     * @type {string}
     * @memberof VetTx
     */
    String blockRef;

    public String getBlockRef() {
        return blockRef;
    }

    public void setBlockRef(String blockRef) {
        this.blockRef = blockRef;
    }

    /**
     *
     * @type {number}
     * @memberof VetTx
     */
    BigDecimal expiration;

    public BigDecimal getExpiration() {
        return expiration;
    }

    public void setExpiration(BigDecimal expiration) {
        this.expiration = expiration;
    }

    /**
     *
     * @type {Array<VetTxClauses>}
     * @memberof VetTx
     */
    VetTxClauses[] clauses;

    public VetTxClauses[] getClauses() {
        return clauses;
    }

    public void setClauses(VetTxClauses[] clauses) {
        this.clauses = clauses;
    }

    /**
     *
     * @type {number}
     * @memberof VetTx
     */
    BigDecimal gasPriceCoef;

    public BigDecimal getGasPriceCoef() {
        return gasPriceCoef;
    }

    public void setGasPriceCoef(BigDecimal gasPriceCoef) {
        this.gasPriceCoef = gasPriceCoef;
    }

    /**
     *
     * @type {number}
     * @memberof VetTx
     */
    BigDecimal gas;

    public BigDecimal getGas() {
        return gas;
    }

    public void setGas(BigDecimal gas) {
        this.gas = gas;
    }

    /**
     *
     * @type {string}
     * @memberof VetTx
     */
    String origin;

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    /**
     *
     * @type {string}
     * @memberof VetTx
     */
    String nonce;

    public String getNonce() {
        return nonce;
    }

    public void setNonce(String nonce) {
        this.nonce = nonce;
    }

    /**
     *
     * @type {number}
     * @memberof VetTx
     */
    BigDecimal size;

    public BigDecimal getSize() {
        return size;
    }

    public void setSize(BigDecimal size) {
        this.size = size;
    }

    /**
     *
     * @type {VetTxMeta}
     * @memberof VetTx
     */
    VetTxMeta meta;

    public VetTxMeta getMeta() {
        return meta;
    }

    public void setMeta(VetTxMeta meta) {
        this.meta = meta;
    }

    /**
     *
     * @type {number}
     * @memberof VetTx
     */
    BigDecimal blockNumber;

    public BigDecimal getBlockNumber() {
        return blockNumber;
    }

    public void setBlockNumber(BigDecimal blockNumber) {
        this.blockNumber = blockNumber;
    }
}
