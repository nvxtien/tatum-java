package io.tatum.model.response.ltc;

import io.tatum.model.response.common.ITxCoin;
import io.tatum.model.response.common.ITxInputs;
import io.tatum.model.response.common.ITxPrevout;

import java.math.BigDecimal;

public class LtcTxInputs implements ITxInputs {

    private ITxPrevout prevout;
    private String script;
    private String witness;
    private BigDecimal sequence;
    private ITxCoin coin;

    @Override
    public ITxPrevout getPrevout() {
        return prevout;
    }

    @Override
    public void setPrevout(ITxPrevout prevout) {
        this.prevout = prevout;
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
    public String getWitness() {
        return witness;
    }

    @Override
    public void setWitness(String witness) {
        this.witness = witness;
    }

    @Override
    public BigDecimal getSequence() {
        return sequence;
    }

    @Override
    public void setSequence(BigDecimal sequence) {
        this.sequence = sequence;
    }

    @Override
    public ITxCoin getCoin() {
        return coin;
    }

    @Override
    public void setCoin(ITxCoin coin) {
        this.coin = coin;
    }
}
