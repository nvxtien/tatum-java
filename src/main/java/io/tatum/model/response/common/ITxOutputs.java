package io.tatum.model.response.common;

import java.math.BigDecimal;

public interface ITxOutputs {

    /**
     * Sent amount in satoshis.
     *
     * @type {number}
     * @memberof ITxOutputs
     */
    BigDecimal getValue();

    void setValue(BigDecimal value);

    /**
     * Transaction script.
     *
     * @type {string}
     * @memberof ITxOutputs
     */
    String getScript();

    void setScript(String script);

    /**
     * Recipient address.
     *
     * @type {string}
     * @memberof ITxOutputs
     */
    String getAddress();

    void setAddress(String address);
}
