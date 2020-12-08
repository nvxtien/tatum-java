package io.tatum.model.response.common;

import java.math.BigDecimal;

/**
 *
 * @export
 * @interface IChainInfo
 */
public interface IChainInfo {

    /**
     * Chain of the blockchain, main or test.
     * @type {string}
     * @memberof IChainInfo
     */
    String getChain();
    void setChain(String chain);

    /**
     * Last block.
     * @type {number}
     * @memberof IChainInfo
     */
    BigDecimal getBlocks();
    void setBlocks(BigDecimal blocks);

    /**
     * Last headers.
     * @type {number}
     * @memberof IChainInfo
     */
    BigDecimal getHeaders();
    void setHeaders(BigDecimal headers);

    /**
     * Hash of the last block.
     * @type {string}
     * @memberof IChainInfo
     */
    String getBestblockhash();
    void setBestblockhash(String bestblockhash);

    /**
     * Difficulty of the algorithm.
     * @type {number}
     * @memberof IChainInfo
     */
    BigDecimal getDifficulty();
    void setDifficulty(BigDecimal difficulty);
}
