package io.tatum.model.response.bch;

import java.math.BigDecimal;

/**
 * @export
 * @interface BchTxVin
 */
public interface IBchTxVin {

    /**
     * @type {string}
     * @memberof BchTxVin
     */
    String getTxid();

    void setTxid(String txid);

    /**
     * @type {number}
     * @memberof BchTxVin
     */
    BigDecimal getVout();

    void setVout(BigDecimal vout);

    /**
     * @type {BchTxScriptSig}
     * @memberof BchTxVin
     */
    IBchTxScriptSig getScriptSig();

    void setScriptSig(IBchTxScriptSig scriptSig);

    /**
     * @type {string}
     * @memberof BchTxVin
     */
    String getCoinbase();

    void setCoinbase(String coinbase);

    /**
     * @type {number}
     * @memberof BchTxVin
     */
    BigDecimal getSequence();

    void setSequence(BigDecimal sequence);
}
