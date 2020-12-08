package io.tatum.model.response.btc;

import java.math.BigDecimal;

public class BtcUTXO implements IBtcUTXO {

    BigDecimal version;
    BigDecimal height;
    BigDecimal value;
    BigDecimal script;
    String address;
    Boolean coinbase;
    String hash;
    BigDecimal index;

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

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public BigDecimal getScript() {
        return script;
    }

    public void setScript(BigDecimal script) {
        this.script = script;
    }

    public BigDecimal getValue() {
        return value;
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

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public BigDecimal getIndex() {
        return index;
    }

    public void setIndex(BigDecimal index) {
        this.index = index;
    }
}
