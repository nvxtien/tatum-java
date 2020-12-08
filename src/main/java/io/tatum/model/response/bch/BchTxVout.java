package io.tatum.model.response.bch;

import java.math.BigDecimal;

public class BchTxVout implements IBchTxVout {

    private String value;
    private BigDecimal n;
    private IBchTxScriptPubKey scriptPubKey;

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public BigDecimal getN() {
        return n;
    }

    @Override
    public void setN(BigDecimal n) {
        this.n = n;
    }

    @Override
    public IBchTxScriptPubKey getScriptPubKey() {
        return scriptPubKey;
    }

    @Override
    public void setScriptPubKey(IBchTxScriptPubKey scriptPubKey) {
        this.scriptPubKey = scriptPubKey;
    }
}
