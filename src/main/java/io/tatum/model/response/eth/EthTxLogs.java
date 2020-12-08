package io.tatum.model.response.eth;

import java.math.BigDecimal;

/**
 *
 * @export
 * @interface EthTxLogs
 */
public class EthTxLogs implements IEthTxLogs {

    private String address;
    private String[] topic;
    private String data;
    private BigDecimal logIndex;
    private BigDecimal transactionIndexl;
    private String transactionHash;

    public String getAddress() {
        return null;
    }

    public void setAddress(String address) {

    }

    public String[] getTopic() {
        return new String[0];
    }

    public void setTopic(String[] topic) {

    }

    public String getData() {
        return null;
    }

    public void setData(String data) {

    }

    public BigDecimal getLogIndex() {
        return null;
    }

    public void setLogIndex(BigDecimal logIndex) {

    }

    public BigDecimal getTransactionIndex() {
        return null;
    }

    public void setTransactionIndex(BigDecimal transactionIndex) {

    }

    public String getTransactionHash() {
        return null;
    }

    public void setTransactionHash(String transactionHash) {

    }
}
