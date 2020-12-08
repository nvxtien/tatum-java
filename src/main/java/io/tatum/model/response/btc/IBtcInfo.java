package io.tatum.model.response.btc;

import java.math.BigDecimal;

/**
 *
 * @export
 * @interface BtcInfo
 */
public interface IBtcInfo {

    /**
     * Chain of the blockchain, main or test.
     * @type {string}
     * @memberof BtcInfo
     */
    String getChain();
    void setChain(String chain);

    /**
     * Last block.
     * @type {number}
     * @memberof BtcInfo
     */
    BigDecimal getBlocks();
    void setBlocks(BigDecimal blocks);

    /**
     * Last headers.
     * @type {number}
     * @memberof BtcInfo
     */
    BigDecimal getHeaders();
    void setHeaders(BigDecimal headers);

    /**
     * Hash of the last block.
     * @type {string}
     * @memberof BtcInfo
     */
    String getBestblockhash();
    void setBestblockhash(String bestblockhash);

    /**
     * Difficulty of the algorithm.
     * @type {number}
     * @memberof BtcInfo
     */
    BigDecimal getDifficulty();
    void setDifficulty(BigDecimal difficulty);
}
