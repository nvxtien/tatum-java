package io.tatum.model.response.btc;

import java.math.BigDecimal;

public class BtcTxOutputs implements IBtcTxOutputs {

    private BigDecimal value;
    private String script;
    private String address;

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
}
