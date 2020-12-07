package com.tatum.model.response.eth;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Strings;
import com.tatum.model.response.common.TransactionHash;
import com.tatum.utils.Async;
import com.tatum.utils.Env;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;

import static com.tatum.constants.Constant.TATUM_API_URL;

public class EthBlock implements IEthBlock {

    /**
     * Difficulty for this block.
     * @type {string}
     * @memberof EthBlock
     */
    String difficulty;

     /**
     * The 'extra data' field of this block.
     * @type {string}
     * @memberof EthBlock
     */
    String extraData;

    /**
     * The maximum gas allowed in this block.
     * @type {number}
     * @memberof EthBlock
     */
    BigDecimal gasLimit;

    /**
     * The total used gas by all transactions in this block.
     * @type {number}
     * @memberof EthBlock
     */
    BigDecimal gasUsed;

    /**
     * Hash of the block. 'null' when its pending block.
     * @type {string}
     * @memberof EthBlock
     */
    String hash;

    /**
     * The bloom filter for the logs of the block. 'null' when its pending block.
     * @type {string}
     * @memberof EthBlock
     */
    String logsBloom;

    /**
     * The address of the beneficiary to whom the mining rewards were given.
     * @type {string}
     * @memberof EthBlock
     */
    String miner;

    /**
     *
     * @type {string}
     * @memberof EthBlock
     */
    String mixHash;

    /**
     * Hash of the generated proof-of-work. 'null' when its pending block.
     * @type {string}
     * @memberof EthBlock
     */
    String nonce;

    /**
     * The block number. 'null' when its pending block.
     * @type {number}
     * @memberof EthBlock
     */
    BigDecimal number;

    /**
     * Hash of the parent block.
     * @type {string}
     * @memberof EthBlock
     */
    String parentHash;

    /**
     *
     * @type {string}
     * @memberof EthBlock
     */
    String receiptsRoot;

    /**
     * SHA3 of the uncles data in the block.
     * @type {string}
     * @memberof EthBlock
     */
    String sha3Uncles;

    /**
     * The size of this block in bytes.
     * @type {number}
     * @memberof EthBlock
     */
    BigDecimal size;

    /**
     * The root of the final state trie of the block.
     * @type {string}
     * @memberof EthBlock
     */
    String stateRoot;

    /**
     * The unix timestamp for when the block was collated.
     * @type {number}
     * @memberof EthBlock
     */
    BigDecimal timestamp;

     /**
     * Total difficulty of the chain until this block.
     * @type {string}
     * @memberof EthBlock
     */
    String totalDifficulty;

    /**
     * Array of transactions.
     * @type {Array<EthTx>}
     * @memberof EthBlock
     */
    IEthTx[] transactions;

    /**
     * The root of the transaction trie of the block.
     * @type {string}
     * @memberof EthBlock
     */
    String transactionsRoot;

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getExtraData() {
        return extraData;
    }

    public void setExtraData(String extraData) {
        this.extraData = extraData;
    }

    public BigDecimal getGasLimit() {
        return gasLimit;
    }

    public void setGasLimit(BigDecimal gasLimit) {
        this.gasLimit = gasLimit;
    }

    public BigDecimal getGasUsed() {
        return gasUsed;
    }

    public void setGasUsed(BigDecimal gasUsed) {
        this.gasUsed = gasUsed;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getLogsBloom() {
        return logsBloom;
    }

    public void setLogsBloom(String logsBloom) {
        this.logsBloom = logsBloom;
    }

    public String getMiner() {
        return miner;
    }

    public void setMiner(String miner) {
        this.miner = miner;
    }

    public String getMixHash() {
        return mixHash;
    }

    public void setMixHash(String mixHash) {
        this.mixHash = mixHash;
    }

    public String getNonce() {
        return nonce;
    }

    public void setNonce(String nonce) {
        this.nonce = nonce;
    }

    public BigDecimal getNumber() {
        return number;
    }

    public void setNumber(BigDecimal number) {
        this.number = number;
    }

    public String getParentHash() {
        return parentHash;
    }

    public void setParentHash(String parentHash) {
        this.parentHash = parentHash;
    }

    public String getReceiptsRoot() {
        return receiptsRoot;
    }

    public void setReceiptsRoot(String receiptsRoot) {
        this.receiptsRoot = receiptsRoot;
    }

    public String getSha3Uncles() {
        return sha3Uncles;
    }

    public void setSha3Uncles(String sha3Uncles) {
        this.sha3Uncles = sha3Uncles;
    }

    public BigDecimal getSize() {
        return size;
    }

    public void setSize(BigDecimal size) {
        this.size = size;
    }

    public String getStateRoot() {
        return stateRoot;
    }

    public void setStateRoot(String stateRoot) {
        this.stateRoot = stateRoot;
    }

    public BigDecimal getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(BigDecimal timestamp) {
        this.timestamp = timestamp;
    }

    public String getTotalDifficulty() {
        return totalDifficulty;
    }

    public void setTotalDifficulty(String totalDifficulty) {
        this.totalDifficulty = totalDifficulty;
    }

    public IEthTx[] getTransactions() {
        return transactions;
    }

    public void setTransactions(IEthTx[] transactions) {
        this.transactions = transactions;
    }

    public String getTransactionsRoot() {
        return transactionsRoot;
    }

    public void setTransactionsRoot(String transactionsRoot) {
        this.transactionsRoot = transactionsRoot;
    }
}
