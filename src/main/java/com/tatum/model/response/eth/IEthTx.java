package com.tatum.model.response.eth;

import java.math.BigDecimal;

/**
 *
 * @export
 * @interface EthTx
 */
public interface IEthTx {

    /**
     * Hash of the block where this transaction was in.
     * @type {string}
     * @memberof EthTx
     */
    String blockHash = null;

    /**
     * TRUE if the transaction was successful, FALSE, if the EVM reverted the transaction.
     * @type {boolean}
     * @memberof EthTx
     */
    Boolean status = false;

    /**
     * Block number where this transaction was in.
     * @type {number}
     * @memberof EthTx
     */
    BigDecimal blockNumber = null;

    /**
     * Address of the sender.
     * @type {string}
     * @memberof EthTx
     */
    String from = null;

    /**
     * Gas provided by the sender.
     * @type {number}
     * @memberof EthTx
     */
    BigDecimal gas = null;

    /**
     * Gas price provided by the sender in wei.
     * @type {string}
     * @memberof EthTx
     */
    String gasPrice = null;

     /**
     * Hash of the transaction.
     * @type {string}
     * @memberof EthTx
     */
    String transactionHash = null;

    /**
     * The data sent along with the transaction.
     * @type {string}
     * @memberof EthTx
     */
    String input = null;

    /**
     * The number of transactions made by the sender prior to this one.
     * @type {number}
     * @memberof EthTx
     */
    BigDecimal nonce = null;

    /**
     * Address of the receiver. 'null' when its a contract creation transaction.
     * @type {string}
     * @memberof EthTx
     */
    String to = null;

    /**
     * Integer of the transactions index position in the block.
     * @type {number}
     * @memberof EthTx
     */
    BigDecimal transactionIndex = null;

    /**
     * Value transferred in wei.
     * @type {string}
     * @memberof EthTx
     */
    String value = null;

    /**
     * The amount of gas used by this specific transaction alone.
     * @type {number}
     * @memberof EthTx
     */
    BigDecimal gasUsed = null;

    /**
     * The total amount of gas used when this transaction was executed in the block.
     * @type {number}
     * @memberof EthTx
     */
    BigDecimal cumulativeGasUsed = null;

    /**
     * The contract address created, if the transaction was a contract creation, otherwise null.
     * @type {string}
     * @memberof EthTx
     */
    String contractAddress = null;

    /**
     * Log events, that happened in this transaction.
     * @type {Array<EthTxLogs>}
     * @memberof EthTx
     */
    EthTxLogs[] logs = new EthTxLogs[0];
}
