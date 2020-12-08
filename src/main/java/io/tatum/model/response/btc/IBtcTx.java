package io.tatum.model.response.btc;

import io.tatum.model.response.common.ITxInputs;
import io.tatum.model.response.common.ITxOutputs;

import java.math.BigDecimal;

/**
 * @export
 * @interface BtcTx
 */
public interface IBtcTx {

    String getHash();

    void setHash(String hash);

    String getWitnessHash();

    void setWitnessHash(String witnessHash);

    BigDecimal getFee();

    void setFee(BigDecimal fee);

    BigDecimal getRate();

    void setRate(BigDecimal rate);

    BigDecimal getMtime();

    void setMtime(BigDecimal mtime);

    BigDecimal getHeight();

    void setHeight(BigDecimal height);

    String getBlock();

    void setBlock(String block);

    BigDecimal getTime();

    void setTime(BigDecimal time);

    BigDecimal getIndex();

    void setIndex(BigDecimal index);

    BigDecimal getVersion();

    void setVersion(BigDecimal version);

    ITxInputs[] getInputs();

    void setInputs(ITxInputs[] inputs);

    ITxOutputs[] getOutputs();

    void setOutputs(ITxOutputs[] outputs);

    BigDecimal getLocktime();

    void setLocktime(BigDecimal locktime);
}
