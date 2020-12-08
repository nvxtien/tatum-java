package io.tatum.model.response.eth;

import java.math.BigDecimal;

/**
 * @export
 * @interface EthTxLogs
 */
public interface IEthTxLogs {

    /**
     * From which this event originated from.
     *
     * @type {string}
     * @memberof EthTxLogs
     */
    String getAddress();

    void setAddress(String address);

    /**
     * An array with max 4 32 Byte topics, topic 1-3 contains indexed parameters of the log.
     *
     * @type {Array<string>}
     * @memberof EthTxLogs
     */
    String[] getTopic();

    void setTopic(String[] topic);

    /**
     * The data containing non-indexed log parameter.
     *
     * @type {string}
     * @memberof EthTxLogs
     */
    String getData();

    void setData(String data);

    /**
     * Integer of the event index position in the block.
     *
     * @type {number}
     * @memberof EthTxLogs
     */
    BigDecimal getLogIndex();

    void setLogIndex(BigDecimal logIndex);

    /**
     * Integer of the transaction’s index position, the event was created in.
     *
     * @type {number}
     * @memberof EthTxLogs
     */
    BigDecimal getTransactionIndex();

    void setTransactionIndex(BigDecimal transactionIndex);

    /**
     * Hash of the transaction this event was created in.
     *
     * @type {string}
     * @memberof EthTxLogs
     */
    String getTransactionHash();

    void setTransactionHash(String transactionHash);
}
