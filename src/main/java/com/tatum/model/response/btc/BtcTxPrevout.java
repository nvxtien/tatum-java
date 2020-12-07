package com.tatum.model.response.btc;

import java.math.BigDecimal;

public class BtcTxPrevout implements IBtcTxPrevout {
    private String hash;
    private BigDecimal index;

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
