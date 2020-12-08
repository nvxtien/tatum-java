package io.tatum.model.response.ltc;


import io.tatum.model.response.common.ITxPrevout;

import java.math.BigDecimal;

public class LtcTxPrevout implements ITxPrevout {

    private String hash;
    private BigDecimal index;

    @Override
    public String getHash() {
        return this.hash;
    }

    @Override
    public void setHash(String hash) {
        this.hash = hash;
    }

    @Override
    public BigDecimal getIndex() {
        return this.index;
    }

    @Override
    public void setIndex(BigDecimal index) {
        this.index = index;
    }
}
