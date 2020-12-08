package io.tatum.model.response.common;

/**
 * @export
 * @interface TransactionHash
 */
public interface ITransactionHash {

    /**
     * TX hash of successful transaction.
     *
     * @type {string}
     * @memberof TransactionHash
     */
    String getTxId();

    void setTxId(String txId);
}
