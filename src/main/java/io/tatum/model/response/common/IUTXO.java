package io.tatum.model.response.common;

import java.math.BigDecimal;

/**
 * @export
 * @interface BtcUTXO
 */
public interface IUTXO {

    /**
     * Version of the UTXO.
     *
     * @type {number}
     * @memberof BtcUTXO
     */
    BigDecimal getVersion();

    void setVersion(BigDecimal version);

    /**
     * @type {number}
     * @memberof BtcUTXO
     */
    BigDecimal getHeight();

    void setHeight(BigDecimal height);

    /**
     * Amount of UTXO in satoshis.
     *
     * @type {number}
     * @memberof BtcUTXO
     */
    BigDecimal getValue();

    void setValue(BigDecimal value);

    /**
     * Data generated by a spender which is almost always used as variables to satisfy a pubkey script.
     *
     * @type {string}
     * @memberof BtcUTXO
     */
    BigDecimal getScript();

    void setScript(BigDecimal script);

    /**
     * Address of the owner of the UTXO.
     *
     * @type {string}
     * @memberof BtcUTXO
     */
    String getAddress();

    void setAddress(String address);

    /**
     * Coinbase transaction - miner fee.
     *
     * @type {boolean}
     * @memberof BtcUTXO
     */
    Boolean getCoinbase();

    void setCoinbase(Boolean coinbase);

    /**
     * Transaction hash.
     *
     * @type {string}
     * @memberof BtcUTXO
     */
    String getHash();

    void setHash(String hash);

    /**
     * Transaction index of the output.
     *
     * @type {number}
     * @memberof BtcUTXO
     */
    BigDecimal getIndex();

    void setIndex(BigDecimal index);
}
