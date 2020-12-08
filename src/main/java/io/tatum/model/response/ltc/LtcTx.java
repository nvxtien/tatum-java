package io.tatum.model.response.ltc;

import io.tatum.model.response.common.ITxInputs;
import io.tatum.model.response.common.ITxOutputs;

import java.math.BigDecimal;

public class LtcTx implements ILtcTx {

    private String hash;
    private String witnessHash;
    private String fee;
    private String rate;
    private BigDecimal ps;
    private BigDecimal height;
    private String block;
    private BigDecimal ts;
    private BigDecimal index;
    private ITxOutputs[] outputs;
    private BigDecimal flag;
    private ITxInputs[] inputs;
    private BigDecimal version;
    private BigDecimal locktime;

    @Override
    public String getHash() {
        return hash;
    }

    @Override
    public void setHash(String hash) {
        this.hash = hash;
    }

    @Override
    public String getWitnessHash() {
        return witnessHash;
    }

    @Override
    public void setWitnessHash(String witnessHash) {
        this.witnessHash = witnessHash;
    }

    @Override
    public String getFee() {
        return fee;
    }

    @Override
    public void setFee(String fee) {
        this.fee = fee;
    }

    @Override
    public String getRate() {
        return rate;
    }

    @Override
    public void setRate(String rate) {
        this.rate = rate;
    }

    @Override
    public BigDecimal getPs() {
        return ps;
    }

    @Override
    public void setPs(BigDecimal ps) {
        this.ps = ps;
    }

    @Override
    public BigDecimal getHeight() {
        return height;
    }

    @Override
    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    @Override
    public String getBlock() {
        return block;
    }

    @Override
    public void setBlock(String block) {
        this.block = block;
    }

    @Override
    public BigDecimal getTs() {
        return ts;
    }

    @Override
    public void setTs(BigDecimal ts) {
        this.ts = ts;
    }

    @Override
    public BigDecimal getIndex() {
        return index;
    }

    @Override
    public void setIndex(BigDecimal index) {
        this.index = index;
    }

    @Override
    public BigDecimal getVersion() {
        return version;
    }

    @Override
    public void setVersion(BigDecimal version) {
        this.version = version;
    }

    @Override
    public BigDecimal getFlag() {
        return flag;
    }

    @Override
    public void setFlag(BigDecimal flag) {
        this.flag = flag;
    }

    @Override
    public ITxInputs[] getInputs() {
        return inputs;
    }

    @Override
    public void setInputs(ITxInputs[] inputs) {
        this.inputs = inputs;
    }

    @Override
    public ITxOutputs[] getOutputs() {
        return outputs;
    }

    @Override
    public void setOutputs(ITxOutputs[] outputs) {
        this.outputs = outputs;
    }

    @Override
    public BigDecimal getLocktime() {
        return locktime;
    }

    @Override
    public void setLocktime(BigDecimal locktime) {
        this.locktime = locktime;
    }
}
