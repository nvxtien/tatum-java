package io.tatum.model.response.vet;

import java.math.BigDecimal;

public class VetBlock {

    /**
     * block number (height)
     * @type {number}
     * @memberof VetBlock
     */
    private BigDecimal number;

    public BigDecimal getNumber() {
        return number;
    }

    public void setNumber(BigDecimal number) {
        this.number = number;
    }

    /**
     * block identifier
     * @type {string}
     * @memberof VetBlock
     */
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * RLP encoded block size in bytes
     * @type {number}
     * @memberof VetBlock
     */
    private BigDecimal size;

    public BigDecimal getSize() {
        return size;
    }

    public void setSize(BigDecimal size) {
        this.size = size;
    }

    /**
     * parent block ID
     * @type {string}
     * @memberof VetBlock
     */
    private String parentID;

    public String getParentID() {
        return parentID;
    }

    public void setParentID(String parentID) {
        this.parentID = parentID;
    }

    /**
     * block unix timestamp
     * @type {number}
     * @memberof VetBlock
     */
    private BigDecimal timestamp;

    public BigDecimal getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(BigDecimal timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * block gas limit (max allowed accumulative gas usage of transactions)
     * @type {number}
     * @memberof VetBlock
     */
    private BigDecimal gasLimit;

    public BigDecimal getGasLimit() {
        return gasLimit;
    }

    public void setGasLimit(BigDecimal gasLimit) {
        this.gasLimit = gasLimit;
    }

    /**
     * Address of account to receive block reward
     * @type {string}
     * @memberof VetBlock
     */
    private String beneficiary;

    public String getBeneficiary() {
        return beneficiary;
    }

    public void setBeneficiary(String beneficiary) {
        this.beneficiary = beneficiary;
    }

    /**
     * accumulative gas usage of transactions
     * @type {number}
     * @memberof VetBlock
     */
    private BigDecimal gasUsed;

    public BigDecimal getGasUsed() {
        return gasUsed;
    }

    public void setGasUsed(BigDecimal gasUsed) {
        this.gasUsed = gasUsed;
    }

    /**
     * sum of all ancestral blocks' score
     * @type {number}
     * @memberof VetBlock
     */
    private BigDecimal totalScore;

    public BigDecimal getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(BigDecimal totalScore) {
        this.totalScore = totalScore;
    }

    /**
     * root hash of transactions in the block
     * @type {string}
     * @memberof VetBlock
     */
    private String txsRoot;

    public String getTxsRoot() {
        return txsRoot;
    }

    public void setTxsRoot(String txsRoot) {
        this.txsRoot = txsRoot;
    }

    /**
     * supported txs features bitset
     * @type {number}
     * @memberof VetBlock
     */
    private BigDecimal txsFeatures;

    public BigDecimal getTxsFeatures() {
        return txsFeatures;
    }

    public void setTxsFeatures(BigDecimal txsFeatures) {
        this.txsFeatures = txsFeatures;
    }

    /**
     * root hash of accounts state
     * @type {string}
     * @memberof VetBlock
     */
    private String stateRoot;

    public String getStateRoot() {
        return stateRoot;
    }

    public void setStateRoot(String stateRoot) {
        this.stateRoot = stateRoot;
    }

    /**
     * root hash of transaction receipts
     * @type {string}
     * @memberof VetBlock
     */
    private String receiptsRoot;

    public String getReceiptsRoot() {
        return receiptsRoot;
    }

    public void setReceiptsRoot(String receiptsRoot) {
        this.receiptsRoot = receiptsRoot;
    }

    /**
     * the one who signed this block
     * @type {string}
     * @memberof VetBlock
     */
    private String signer;

    public String getSigner() {
        return signer;
    }

    public void setSigner(String signer) {
        this.signer = signer;
    }

    /**
     * transactions IDs
     * @type {Array<string>}
     * @memberof VetBlock
     */
    private String[] transactions;

    public String[] getTransactions() {
        return transactions;
    }

    public void setTransactions(String[] transactions) {
        this.transactions = transactions;
    }
}
