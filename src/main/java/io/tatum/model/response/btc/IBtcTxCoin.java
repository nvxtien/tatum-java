package io.tatum.model.response.btc;

import java.math.BigDecimal;

/**
 *
 * @export
 * @interface BtcTxCoin
 */
public interface IBtcTxCoin {

    /**
     *
     * @type {number}
     * @memberof BtcTxCoin
     */
    BigDecimal getVersion();
    void setVersion(BigDecimal version);

    /**
     *
     * @type {number}
     * @memberof BtcTxCoin
     */
    BigDecimal getHeight();
    void setHeight(BigDecimal height);

    /**
     *
     * @type {number}
     * @memberof BtcTxCoin
     */
    BigDecimal getValue();
    void setValue(BigDecimal value);

    /**
     *
     * @type {string}
     * @memberof BtcTxCoin
     */
    String getScript();
    void setScript(String script);

    /**
     * Sender address.
     * @type {string}
     * @memberof BtcTxCoin
     */
    String getAddress();
    void setAddress(String address);

    /**
     * Coinbase transaction - miner fee.
     * @type {boolean}
     * @memberof BtcTxCoin
     */
    Boolean getCoinbase();
    void setCoinbase(Boolean coinbase);
}
