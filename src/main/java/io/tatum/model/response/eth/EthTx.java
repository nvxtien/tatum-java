package io.tatum.model.response.eth;

import java.math.BigDecimal;

public class EthTx implements IEthTx {

    private String blockHash;
    private Boolean status;
    private BigDecimal blockNumber;
    private String from;
    private BigDecimal gas;
    private String gasPrice;
    private String transactionHash;
    private String input;
    private BigDecimal nonce;
    private String to;
    private BigDecimal transactionIndex;
    private String value;
    private BigDecimal gasUsed;
    private BigDecimal cumulativeGasUsed;
    private String contractAddress;
    private IEthTxLogs[] logs;

    public String getBlockHash() {
        return null;
    }

    public void setBlockHash(String blockHash) {

    }

    public Boolean getStatus() {
        return null;
    }

    public void setStatus(Boolean status) {

    }

    public BigDecimal getBlockNumber() {
        return null;
    }

    public void setBlockNumber(BigDecimal blockNumber) {

    }

    public String getFrom() {
        return null;
    }

    public void setFrom(String from) {

    }

    public BigDecimal getGas() {
        return null;
    }

    public void setGas(BigDecimal gas) {

    }

    public String getGasPrice() {
        return null;
    }

    public void setGasPrice(String gasPrice) {

    }

    public String getTransactionHash() {
        return null;
    }

    public void setTransactionHash(String transactionHash) {

    }

    public String getInput() {
        return null;
    }

    public void setInput(String input) {

    }

    public BigDecimal getNonce() {
        return null;
    }

    public void setNonce(BigDecimal nonce) {

    }

    public String getTo() {
        return null;
    }

    public void setTo(String to) {

    }

    public BigDecimal getTransactionIndex() {
        return null;
    }

    public void setTransactionIndex(BigDecimal transactionIndex) {

    }

    public String getValue() {
        return null;
    }

    public void setValue(String value) {

    }

    public BigDecimal getGasUsed() {
        return null;
    }

    public void setGasUsed(BigDecimal gasUsed) {

    }

    public BigDecimal getCumulativeGasUsed() {
        return null;
    }

    public void setCumulativeGasUsed(BigDecimal cumulativeGasUsed) {

    }

    public String getContractAddress() {
        return null;
    }

    public void setContractAddress(String contractAddress) {

    }

    public IEthTxLogs[] getLogs() {
        return new IEthTxLogs[0];
    }

    public void setLogs(IEthTxLogs[] logs) {

    }
}
