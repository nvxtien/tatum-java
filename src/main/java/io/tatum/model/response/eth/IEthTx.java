package io.tatum.model.response.eth;

import java.math.BigDecimal;

/**
 * @export
 * @interface EthTx
 */
public interface IEthTx {

    /**
     * Hash of the block where this transaction was in.
     *
     * @type {string}
     * @memberof EthTx
     */
    String getBlockHash();

    void setBlockHash(String blockHash);

    /**
     * TRUE if the transaction was successful, FALSE, if the EVM reverted the transaction.
     *
     * @type {boolean}
     * @memberof EthTx
     */
    Boolean getStatus();

    void setStatus(Boolean status);

    /**
     * Block number where this transaction was in.
     *
     * @type {number}
     * @memberof EthTx
     */
    BigDecimal getBlockNumber();

    void setBlockNumber(BigDecimal blockNumber);

    /**
     * Address of the sender.
     *
     * @type {string}
     * @memberof EthTx
     */
    String getFrom();

    void setFrom(String from);

    /**
     * Gas provided by the sender.
     *
     * @type {number}
     * @memberof EthTx
     */
    BigDecimal getGas();

    void setGas(BigDecimal gas);

    /**
     * Gas price provided by the sender in wei.
     *
     * @type {string}
     * @memberof EthTx
     */
    String getGasPrice();

    void setGasPrice(String gasPrice);

    /**
     * Hash of the transaction.
     *
     * @type {string}
     * @memberof EthTx
     */
    String getTransactionHash();

    void setTransactionHash(String transactionHash);

    /**
     * The data sent along with the transaction.
     *
     * @type {string}
     * @memberof EthTx
     */
    String getInput();

    void setInput(String input);

    /**
     * The number of transactions made by the sender prior to this one.
     *
     * @type {number}
     * @memberof EthTx
     */
    BigDecimal getNonce();

    void setNonce(BigDecimal nonce);

    /**
     * Address of the receiver. 'null' when its a contract creation transaction.
     *
     * @type {string}
     * @memberof EthTx
     */
    String getTo();

    void setTo(String to);

    /**
     * Integer of the transactions index position in the block.
     *
     * @type {number}
     * @memberof EthTx
     */
    BigDecimal getTransactionIndex();

    void setTransactionIndex(BigDecimal transactionIndex);

    /**
     * Value transferred in wei.
     *
     * @type {string}
     * @memberof EthTx
     */
    String getValue();

    void setValue(String value);

    /**
     * The amount of gas used by this specific transaction alone.
     *
     * @type {number}
     * @memberof EthTx
     */
    BigDecimal getGasUsed();

    void setGasUsed(BigDecimal gasUsed);

    /**
     * The total amount of gas used when this transaction was executed in the block.
     *
     * @type {number}
     * @memberof EthTx
     */
    BigDecimal getCumulativeGasUsed();

    void setCumulativeGasUsed(BigDecimal cumulativeGasUsed);

    /**
     * The contract address created, if the transaction was a contract creation, otherwise null.
     *
     * @type {string}
     * @memberof EthTx
     */
    String getContractAddress();

    void setContractAddress(String contractAddress);

    /**
     * Log events, that happened in this transaction.
     *
     * @type {Array<EthTxLogs>}
     * @memberof EthTx
     */
    IEthTxLogs[] getLogs();

    void setLogs(IEthTxLogs[] logs);
}
