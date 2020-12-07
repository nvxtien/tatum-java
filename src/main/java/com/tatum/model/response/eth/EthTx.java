package com.tatum.model.response.eth;

import java.math.BigDecimal;

public class EthTx implements IEthTx {

    String blockHash = null;
    Boolean status = false;
    BigDecimal blockNumber = null;
    String from = null;
    BigDecimal gas = null;
    String gasPrice = null;
    String transactionHash = null;
    String input = null;
    BigDecimal nonce = null;
    String to = null;
    BigDecimal transactionIndex = null;
    String value = null;
    BigDecimal gasUsed = null;
    BigDecimal cumulativeGasUsed = null;
    String contractAddress = null;
    IEthTxLogs[] logs;

    @Override
    public String getBlockHash() {
        return this.blockHash;
    }

    @Override
    public void setBlockHash(String blockHash) {
        this.blockHash = blockHash;
    }

    @Override
    public Boolean getStatus() {
        return this.status;
    }

    @Override
    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public BigDecimal getBlockNumber() {
        return this.blockNumber;
    }

    @Override
    public void setBlockNumber(BigDecimal blockNumber) {
        this.blockNumber = blockNumber;
    }

    @Override
    public String getFrom() {
        return this.from;
    }

    @Override
    public void setFrom(String from) {
        this.from = from;
    }

    @Override
    public BigDecimal getGas() {
        return this.gas;
    }

    @Override
    public void setGas(BigDecimal gas) {
        this.gas = gas;
    }

    @Override
    public String getGasPrice() {
        return this.gasPrice;
    }

    @Override
    public void setGasPrice(String gasPrice) {
        this.gasPrice = gasPrice;
    }

    @Override
    public String getTransactionHash() {
        return this.transactionHash;
    }

    @Override
    public void setTransactionHash(String transactionHash) {
        this.transactionHash = transactionHash;
    }

    @Override
    public String getInput() {
        return this.input;
    }

    @Override
    public void setInput(String input) {
        this.input = input;
    }

    @Override
    public BigDecimal getNonce() {
        return this.nonce;
    }

    @Override
    public void setNonce(BigDecimal nonce) {
        this.nonce = nonce;
    }

    @Override
    public String getTo() {
        return this.to;
    }

    @Override
    public void setTo(String to) {
        this.to = to;
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
    public String getValue() {
        return this.value;
    }

    @Override
    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public BigDecimal getGasUsed() {
        return this.gasUsed;
    }

    @Override
    public void setGasUsed(BigDecimal gasUsed) {
        this.gasUsed = gasUsed;
    }

    @Override
    public BigDecimal getCumulativeGasUsed() {
        return this.cumulativeGasUsed;
    }

    @Override
    public void setCumulativeGasUsed(BigDecimal cumulativeGasUsed) {
        this.cumulativeGasUsed = cumulativeGasUsed;
    }

    @Override
    public String getContractAddress() {
        return this.getContractAddress();
    }

    @Override
    public void setContractAddress(String contractAddress) {
        this.contractAddress = contractAddress;
    }

    @Override
    public IEthTxLogs[] getLogs() {
        return this.logs;
    }

    @Override
    public void setLogs(IEthTxLogs[] logs) {
        this.logs = logs;
    }
}
