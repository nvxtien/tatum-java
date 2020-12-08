package io.tatum.model.response.eth;

import java.math.BigDecimal;

public interface IEthBlock {

    /**
     * Difficulty for this block.
     *
     * @type {string}
     * @memberof EthBlock
     */
    String getDifficulty();

    void setDifficulty(String difficulty);

    /**
     * The 'extra data' field of this block.
     *
     * @type {string}
     * @memberof EthBlock
     */
    String getExtraData();

    void setExtraData(String extraData);

    /**
     * The maximum gas allowed in this block.
     *
     * @type {number}
     * @memberof EthBlock
     */
    BigDecimal getGasLimit();

    void setGasLimit(BigDecimal gasLimit);

    /**
     * The total used gas by all transactions in this block.
     *
     * @type {number}
     * @memberof EthBlock
     */
    BigDecimal getGasUsed();

    void setGasUsed(BigDecimal gasUsed);

    /**
     * Hash of the block. 'null' when its pending block.
     *
     * @type {string}
     * @memberof EthBlock
     */
    String getHash();

    void setHash(String hash);

    /**
     * The bloom filter for the logs of the block. 'null' when its pending block.
     *
     * @type {string}
     * @memberof EthBlock
     */
    String getLogsBloom();

    void setLogsBloom(String logsBloom);

    /**
     * The address of the beneficiary to whom the mining rewards were given.
     *
     * @type {string}
     * @memberof EthBlock
     */
    String getMiner();

    void setMiner(String miner);

    /**
     * @type {string}
     * @memberof EthBlock
     */
    String getMixHash();

    void setMixHash(String mixHash);

    /**
     * Hash of the generated proof-of-work. 'null' when its pending block.
     *
     * @type {string}
     * @memberof EthBlock
     */
    String getNonce();

    void setNonce(String nonce);

    /**
     * The block number. 'null' when its pending block.
     *
     * @type {number}
     * @memberof EthBlock
     */
    BigDecimal getNumber();

    void setNumber(BigDecimal number);

    /**
     * Hash of the parent block.
     *
     * @type {string}
     * @memberof EthBlock
     */
    String getParentHash();

    void setParentHash(String parentHash);

    /**
     * @type {string}
     * @memberof EthBlock
     */
    String getReceiptsRoot();

    void setReceiptsRoot(String receiptsRoot);

    /**
     * SHA3 of the uncles data in the block.
     *
     * @type {string}
     * @memberof EthBlock
     */
    String getSha3Uncles();

    void setSha3Uncles(String sha3Uncles);

    /**
     * The size of this block in bytes.
     *
     * @type {number}
     * @memberof EthBlock
     */
    BigDecimal getSize();

    void setSize(BigDecimal size);

    /**
     * The root of the final state trie of the block.
     *
     * @type {string}
     * @memberof EthBlock
     */
    String getStateRoot();

    void setStateRoot(String stateRoot);

    /**
     * The unix timestamp for when the block was collated.
     *
     * @type {number}
     * @memberof EthBlock
     */
    BigDecimal getTimestamp();

    void setTimestamp(BigDecimal timestamp);

    /**
     * Total difficulty of the chain until this block.
     *
     * @type {string}
     * @memberof EthBlock
     */
    String getTotalDifficulty();

    void setTotalDifficulty(String totalDifficulty);

    /**
     * Array of transactions.
     *
     * @type {Array<EthTx>}
     * @memberof EthBlock
     */
    IEthTx[] getTransactions();

    void setTransactions(IEthTx[] transactions);

    /**
     * The root of the transaction trie of the block.
     *
     * @type {string}
     * @memberof EthBlock
     */
    String getTransactionsRoot();

    void setTransactionsRoot(String transactionsRoot);
}
