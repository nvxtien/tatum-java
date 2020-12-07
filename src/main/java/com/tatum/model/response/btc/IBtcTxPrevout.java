package com.tatum.model.response.btc;

import java.math.BigDecimal;

/**
 *
 * @export
 * @interface BtcTxPrevout
 */
public interface IBtcTxPrevout {
    /**
     * Transaction hash of the input.
     * @type {string}
     * @memberof BtcTxPrevout
     */
    String getHash();
    void setHash(String hash);

    /**
     * Transaction index of the input.
     * @type {number}
     * @memberof BtcTxPrevout
     */
    BigDecimal getIndex();
    void setIndex(BigDecimal index);
}
