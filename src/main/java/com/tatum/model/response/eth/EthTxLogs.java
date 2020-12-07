package com.tatum.model.response.eth;

import java.math.BigDecimal;

/**
 *
 * @export
 * @interface EthTxLogs
 */
public interface EthTxLogs {

    /**
     * From which this event originated from.
     * @type {string}
     * @memberof EthTxLogs
     */
    String address = null;

    /**
     * An array with max 4 32 Byte topics, topic 1-3 contains indexed parameters of the log.
     * @type {Array<string>}
     * @memberof EthTxLogs
     */
    String[] topic = new String[0];

    /**
     * The data containing non-indexed log parameter.
     * @type {string}
     * @memberof EthTxLogs
     */
    String data = null;

    /**
     * Integer of the event index position in the block.
     * @type {number}
     * @memberof EthTxLogs
     */
    BigDecimal logIndex = null;

    /**
     * Integer of the transaction’s index position, the event was created in.
     * @type {number}
     * @memberof EthTxLogs
     */
    BigDecimal transactionIndex = null;

    /**
     * Hash of the transaction this event was created in.
     * @type {string}
     * @memberof EthTxLogs
     */
    String transactionHash = null;

}
