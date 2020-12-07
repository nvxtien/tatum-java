package com.tatum.model.response.btc;

import java.math.BigDecimal;

public class BtcTxInputs implements IBtcTxInputs {

    private IBtcTxPrevout prevout;
    private String script;
    private String witness;
    private BigDecimal sequence;
    private IBtcTxCoin coin;

    public IBtcTxPrevout getPrevout() {
        return prevout;
    }

    public void setPrevout(IBtcTxPrevout prevout) {
        this.prevout = prevout;
    }

    public String getScript() {
        return script;
    }

    public void setScript(String script) {
        this.script = script;
    }

    public String getWitness() {
        return witness;
    }

    public void setWitness(String witness) {
        this.witness = witness;
    }

    public BigDecimal getSequence() {
        return sequence;
    }

    public void setSequence(BigDecimal sequence) {
        this.sequence = sequence;
    }

    public IBtcTxCoin getCoin() {
        return coin;
    }

    public void setCoin(IBtcTxCoin coin) {
        this.coin = coin;
    }
}
