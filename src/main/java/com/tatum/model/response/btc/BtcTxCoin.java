package com.tatum.model.response.btc;

import java.math.BigDecimal;

public class BtcTxCoin implements IBtcTxCoin {

    private BigDecimal version;
    private BigDecimal height;
    private BigDecimal value;
    private String script;
    private String address;
    private Boolean coinbase;

    public BigDecimal getVersion() {
        return version;
    }

    public void setVersion(BigDecimal version) {
        this.version = version;
    }

    public BigDecimal getHeight() {
        return height;
    }

    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public String getScript() {
        return script;
    }

    public void setScript(String script) {
        this.script = script;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Boolean getCoinbase() {
        return coinbase;
    }

    public void setCoinbase(Boolean coinbase) {
        this.coinbase = coinbase;
    }
}
