package com.tatum.model.response.btc;

import java.math.BigDecimal;

public class BtcTx implements IBtcTx {

    private String hash;
    private String witnessHash;
    private BigDecimal fee;
    private BigDecimal rate;
    private BigDecimal mtime;
    private BigDecimal height;
    private String block;
    private BigDecimal time;
    private BigDecimal index;
    private BigDecimal version;
    private IBtcTxInputs[] inputs;
    private IBtcTxOutputs[] outputs;
    private BigDecimal locktime;

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getWitnessHash() {
        return witnessHash;
    }

    public void setWitnessHash(String witnessHash) {
        this.witnessHash = witnessHash;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public BigDecimal getMtime() {
        return mtime;
    }

    public void setMtime(BigDecimal mtime) {
        this.mtime = mtime;
    }

    public BigDecimal getHeight() {
        return height;
    }

    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public BigDecimal getTime() {
        return time;
    }

    public void setTime(BigDecimal time) {
        this.time = time;
    }

    public BigDecimal getIndex() {
        return index;
    }

    public void setIndex(BigDecimal index) {
        this.index = index;
    }

    public BigDecimal getVersion() {
        return version;
    }

    public void setVersion(BigDecimal version) {
        this.version = version;
    }

    public IBtcTxInputs[] getInputs() {
        return inputs;
    }

    public void setInputs(IBtcTxInputs[] inputs) {
        this.inputs = inputs;
    }

    public IBtcTxOutputs[] getOutputs() {
        return outputs;
    }

    public void setOutputs(IBtcTxOutputs[] outputs) {
        this.outputs = outputs;
    }

    public BigDecimal getLocktime() {
        return locktime;
    }

    public void setLocktime(BigDecimal locktime) {
        this.locktime = locktime;
    }
}
