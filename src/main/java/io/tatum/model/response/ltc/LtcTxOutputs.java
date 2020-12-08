package io.tatum.model.response.ltc;

import io.tatum.model.response.common.ITxOutputs;

import java.math.BigDecimal;

public class LtcTxOutputs implements ITxOutputs {

    private BigDecimal value;
    private String script;
    private String address;

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
}
