package io.tatum.model.response.bch;

import java.math.BigDecimal;

/**
 * @export
 * @interface BchTxVout
 */
public interface IBchTxVout {
    /**
     * @type {string}
     * @memberof BchTxVout
     */
    String getValue();

    void setValue(String value);

    /**
     * @type {number}
     * @memberof BchTxVout
     */
    BigDecimal getN();

    void setN(BigDecimal n);

    /**
     * @type {BchTxScriptPubKey}
     * @memberof BchTxVout
     */
    IBchTxScriptPubKey getScriptPubKey();

    void setScriptPubKey(IBchTxScriptPubKey scriptPubKey);
}
