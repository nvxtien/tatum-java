package io.tatum.model.response.bch;

import java.math.BigDecimal;

public class BchTxVin implements IBchTxVin {

    private String txid;
    private BigDecimal vout;
    private IBchTxScriptSig scriptSig;
    private String coinbase;
    private BigDecimal sequence;

    @Override
    public String getTxid() {
        return txid;
    }

    @Override
    public void setTxid(String txid) {
        this.txid = txid;
    }

    @Override
    public BigDecimal getVout() {
        return vout;
    }

    @Override
    public void setVout(BigDecimal vout) {
        this.vout = vout;
    }

    @Override
    public IBchTxScriptSig getScriptSig() {
        return scriptSig;
    }

    @Override
    public void setScriptSig(IBchTxScriptSig scriptSig) {
        this.scriptSig = scriptSig;
    }

    @Override
    public String getCoinbase() {
        return coinbase;
    }

    @Override
    public void setCoinbase(String coinbase) {
        this.coinbase = coinbase;
    }

    @Override
    public BigDecimal getSequence() {
        return sequence;
    }

    @Override
    public void setSequence(BigDecimal sequence) {
        this.sequence = sequence;
    }
}
