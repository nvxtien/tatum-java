package io.tatum.model.response.ltc;

import io.tatum.model.response.common.ITxCoin;

import java.math.BigDecimal;

public class LtcTxCoin implements ITxCoin {

    private BigDecimal version;
    private BigDecimal height;
    private BigDecimal value;
    private String script;
    private String address;
    private Boolean coinbase;

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
    public BigDecimal getValue() {
        return value;
    }

    @Override
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    @Override
    public String getScript() {
        return script;
    }

    @Override
    public void setScript(String script) {
        this.script = script;
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
}
