package io.tatum.model.response.bch;

import java.math.BigDecimal;

public class BchTx implements IBchTx {

    private String txid;
    private BigDecimal version;
    private BigDecimal locktime;
    private IBchTxVin[] vin;
    private IBchTxVout[] vout;

    @Override
    public String getTxid() {
        return txid;
    }

    @Override
    public void setTxid(String txid) {
        this.txid = txid;
    }

    @Override
    public BigDecimal getVersion() {
        return version;
    }

    @Override
    public void setVersion(BigDecimal version) {
        this.version = version;
    }

    @Override
    public BigDecimal getLocktime() {
        return locktime;
    }

    @Override
    public void setLocktime(BigDecimal locktime) {
        this.locktime = locktime;
    }

    @Override
    public IBchTxVin[] getVin() {
        return vin;
    }

    @Override
    public void setVin(IBchTxVin[] vin) {
        this.vin = vin;
    }

    @Override
    public IBchTxVout[] getVout() {
        return vout;
    }

    @Override
    public void setVout(IBchTxVout[] vout) {
        this.vout = vout;
    }
}
