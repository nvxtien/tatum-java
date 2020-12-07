package com.tatum.model.response.eth;

import java.math.BigDecimal;

/**
 *
 * @export
 * @interface EthTxLogs
 */
public class EthTxLogs implements IEthTxLogs {

    String address = null;
    String[] topic = new String[0];
    String data = null;
    BigDecimal logIndex = null;
    BigDecimal transactionIndex = null;
    String transactionHash = null;

    @Override
    public String getAddress() {
        return this.address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String[] getTopic() {
        return this.topic;
    }

    @Override
    public void setTopic(String[] topic) {
        this.topic = topic;
    }

    @Override
    public String getData() {
        return this.data;
    }

    @Override
    public void setData(String data) {
        this.data = data;
    }

    @Override
    public BigDecimal getLogIndex() {
        return this.logIndex;
    }

    @Override
    public void setLogIndex(BigDecimal logIndex) {
        this.logIndex = logIndex;
    }

    @Override
    public BigDecimal getTransactionIndex() {
        return this.transactionIndex;
    }

    @Override
    public void setTransactionIndex(BigDecimal transactionIndex) {
        this.transactionIndex = transactionIndex;
    }

    @Override
    public String getTransactionHash() {
        return this.transactionHash;
    }

    @Override
    public void setTransactionHash(String transactionHash) {
        this.transactionHash = transactionHash;
    }
}
