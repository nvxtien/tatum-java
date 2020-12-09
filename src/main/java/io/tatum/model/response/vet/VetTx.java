package io.tatum.model.response.vet;

import java.math.BigDecimal;

public class VetTx {

    /**
     *
     * @type {string}
     * @memberof VetTx
     */
    private String id;

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
    private String chainTag;

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
    private String blockRef;

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
    private BigDecimal expiration;

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
    private VetTxClauses[] clauses;

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
    private BigDecimal gasPriceCoef;

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
    private BigDecimal gas;

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
    private String origin;

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
    private String nonce;

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
    private BigDecimal size;

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
    private VetTxMeta meta;

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
    private BigDecimal blockNumber;

    public BigDecimal getBlockNumber() {
        return blockNumber;
    }

    public void setBlockNumber(BigDecimal blockNumber) {
        this.blockNumber = blockNumber;
    }
}
