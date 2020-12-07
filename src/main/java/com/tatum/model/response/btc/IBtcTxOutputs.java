package com.tatum.model.response.btc;

import java.math.BigDecimal;

public interface IBtcTxOutputs {

    /**
     * Sent amount in satoshis.
     * @type {number}
     * @memberof BtcTxOutputs
     */
    BigDecimal getValue();
    void setValue(BigDecimal value);

    /**
     * Transaction script.
     * @type {string}
     * @memberof BtcTxOutputs
     */
    String getScript();
    void setScript(String script);

    /**
     * Recipient address.
     * @type {string}
     * @memberof BtcTxOutputs
     */
    String getAddress();
    void setAddress(String address);
}
