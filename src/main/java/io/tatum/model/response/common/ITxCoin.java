package io.tatum.model.response.common;

import java.math.BigDecimal;

/**
 * @export
 * @interface ITxCoin
 */
public interface ITxCoin {

    /**
     * @type {number}
     * @memberof ITxCoin
     */
    BigDecimal getVersion();

    void setVersion(BigDecimal version);

    /**
     * @type {number}
     * @memberof ITxCoin
     */
    BigDecimal getHeight();

    void setHeight(BigDecimal height);

    /**
     * @type {number}
     * @memberof ITxCoin
     */
    BigDecimal getValue();

    void setValue(BigDecimal value);

    /**
     * @type {string}
     * @memberof ITxCoin
     */
    String getScript();

    void setScript(String script);

    /**
     * Sender address.
     *
     * @type {string}
     * @memberof ITxCoin
     */
    String getAddress();

    void setAddress(String address);

    /**
     * Coinbase transaction - miner fee.
     *
     * @type {boolean}
     * @memberof ITxCoin
     */
    Boolean getCoinbase();

    void setCoinbase(Boolean coinbase);
}
