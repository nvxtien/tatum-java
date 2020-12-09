package io.tatum.model.response.xrp;

import java.math.BigDecimal;

public class Account implements IAccount{

    private BigDecimal ledgerCurrentIndex;
    private BigDecimal sequence;

    @Override
    public BigDecimal getLedgerCurrentIndex() {
        return ledgerCurrentIndex;
    }

    @Override
    public void setLedgerCurrentIndex(BigDecimal ledgerCurrentIndex) {
        this.ledgerCurrentIndex = ledgerCurrentIndex;
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
