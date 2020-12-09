package io.tatum.model.response.xrp;

import java.math.BigDecimal;

public interface IAccount {

    BigDecimal getLedgerCurrentIndex();
    void setLedgerCurrentIndex(BigDecimal ledgerCurrentIndex);

    BigDecimal getSequence();
    void setSequence(BigDecimal sequence);

}
