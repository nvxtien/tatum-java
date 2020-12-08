package io.tatum.model.response.btc;

import io.tatum.model.response.common.IUTXO;

import java.math.BigDecimal;

public class BtcUTXO implements IUTXO {

    private BigDecimal version;
    private BigDecimal height;
    private BigDecimal value;
    private BigDecimal script;
    private String address;
    private Boolean coinbase;
    private String hash;
    private BigDecimal index;

    @Override
    public BigDecimal getVersion() {
        return version;
    }

    @Override
    public void setVersion(BigDecimal version) {
        this.version = version;
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
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    @Override
    public BigDecimal getScript() {
        return script;
    }

    @Override
    public void setScript(BigDecimal script) {
        this.script = script;
    }

    @Override
    public BigDecimal getValue() {
        return value;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public Boolean getCoinbase() {
        return coinbase;
    }

    @Override
    public void setCoinbase(Boolean coinbase) {
        this.coinbase = coinbase;
    }

    @Override
    public String getHash() {
        return hash;
    }

    @Override
    public void setHash(String hash) {
        this.hash = hash;
    }

    @Override
    public BigDecimal getIndex() {
        return index;
    }

    @Override
    public void setIndex(BigDecimal index) {
        this.index = index;
    }
}
