package io.tatum.model.response.bch;

import java.math.BigDecimal;

public class BchTxVout {

    /**
     *
     * @type {string}
     * @memberof BchTxVout
     */
    String value;

    /**
     *
     * @type {number}
     * @memberof BchTxVout
     */
    BigDecimal n;

    /**
     *
     * @type {BchTxScriptPubKey}
     * @memberof BchTxVout
     */
    scriptPubKey: BchTxScriptPubKey;

}
