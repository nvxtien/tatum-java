package io.tatum.model.response.bch;

import java.math.BigDecimal;

/**
 * @export
 * @interface BchInfo
 */
public interface IBchInfo {

    /**
     * Chain of the blockchain, main or test.
     *
     * @type {string}
     * @memberof BchInfo
     */
    String getChain();

    void setChain(String chain);

    /**
     * Last block.
     *
     * @type {number}
     * @memberof BchInfo
     */
    BigDecimal getBlocks();

    void setBlocks(BigDecimal blocks);

    /**
     * Hash of the last block.
     *
     * @type {string}
     * @memberof BchInfo
     */
    String getBestblockhash();

    void setBestblockhash(String bestblockhash);

    /**
     * Difficulty of the PoW algorithm.
     *
     * @type {number}
     * @memberof BchInfo
     */
    BigDecimal getDifficulty();

    void setDifficulty(BigDecimal difficulty);
}
