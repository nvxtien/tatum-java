package io.tatum.model.response.ltc;

import io.tatum.model.response.common.ITxInputs;
import io.tatum.model.response.common.ITxOutputs;

import java.math.BigDecimal;

/**
 *
 * @export
 * @interface LtcTx
 */
public interface ILtcTx {

    /**
     * Transaction hash.
     * @type {string}
     * @memberof LtcTx
     */
    String getHash();
    void setHash(String hash);

    /**
     * Witness hash in case of a SegWit transaction.
     * @type {string}
     * @memberof LtcTx
     */
    String getWitnessHash();
    void setWitnessHash(String witnessHash);

    /**
     * Fee paid for this transaction, in LTC.
     * @type {string}
     * @memberof LtcTx
     */
    String getFee();
    void setFee(String fee);

    /**
     *
     * @type {string}
     * @memberof LtcTx
     */
    String getRate();
    void setRate(String rate);

    /**
     *
     * @type {number}
     * @memberof LtcTx
     */
    BigDecimal getPs();
    void setPs(BigDecimal ps);

    /**
     * Height of the block this transaction belongs to.
     * @type {number}
     * @memberof LtcTx
     */
    BigDecimal getHeight();
    void setHeight(BigDecimal height);

    /**
     * Hash of the block this transaction belongs to.
     * @type {string}
     * @memberof LtcTx
     */
    String getBlock();
    void setBlock(String block);

    /**
     * Time of the transaction.
     * @type {number}
     * @memberof LtcTx
     */
    BigDecimal getTs();
    void setTs(BigDecimal ts);

    /**
     * Index of the transaction in the block.
     * @type {number}
     * @memberof LtcTx
     */
    BigDecimal getIndex();
    void setIndex(BigDecimal index);

    /**
     * Index of the transaction.
     * @type {number}
     * @memberof LtcTx
     */
    BigDecimal getVersion();
    void setVersion(BigDecimal version);

    /**
     *
     * @type {number}
     * @memberof LtcTx
     */
    BigDecimal getFlag();
    void setFlag(BigDecimal flag);

    /**
     *
     * @type {Array<LtcTxInputs>}
     * @memberof LtcTx
     */
    ITxInputs[] getInputs();

    void setInputs(ITxInputs[] inputs);

    /**
     *
     * @type {Array<LtcTxOutputs>}
     * @memberof LtcTx
     */
    ITxOutputs[] getOutputs();
    void setOutputs(ITxOutputs[] outputs);

    /**
     * Block this transaction was included in.
     * @type {number}
     * @memberof LtcTx
     */
    BigDecimal getLocktime();
    void setLocktime(BigDecimal locktime);
}
