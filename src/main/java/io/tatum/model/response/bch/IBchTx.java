package io.tatum.model.response.bch;

import java.math.BigDecimal;

/**
 * @export
 * @interface BchTx
 */
public interface IBchTx {

    /**
     * @type {string}
     * @memberof BchTx
     */
    String getTxid();

    void setTxid(String txid);

    /**
     * @type {number}
     * @memberof BchTx
     */
    BigDecimal getVersion();

    void setVersion(BigDecimal version);

    /**
     * @type {number}
     * @memberof BchTx
     */
    BigDecimal getLocktime();

    void setLocktime(BigDecimal locktime);

    /**
     * @type {Array<BchTxVin>}
     * @memberof BchTx
     */
    IBchTxVin[] getVin();

    void setVin(IBchTxVin[] vin);

    /**
     * @type {Array<BchTxVout>}
     * @memberof BchTx
     */
    IBchTxVout[] getVout();

    void setVout(IBchTxVout[] vout);
}
