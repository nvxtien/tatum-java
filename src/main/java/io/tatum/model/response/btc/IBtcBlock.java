package io.tatum.model.response.btc;

import java.math.BigDecimal;

/**
 * @export
 * @interface BtcBlock
 */
public interface IBtcBlock {

    /**
     * Hash of block.
     *
     * @type {string}
     * @memberof BtcBlock
     */
    String getHash();

    void setHash(String hash);

    /**
     * The number of blocks preceding a particular block on a block chain.
     *
     * @type {number}
     * @memberof BtcBlock
     */
    BigDecimal getHeight();

    void setHeight(BigDecimal height);

    /**
     * The number of blocks following a particular block on a block chain, including current one.
     *
     * @type {number}
     * @memberof BtcBlock
     */
    BigDecimal getDepth();

    void setDepth(BigDecimal depth);

    /**
     * Block version.
     *
     * @type {number}
     * @memberof BtcBlock
     */
    BigDecimal getVersion();

    void setVersion(BigDecimal version);

    /**
     * Hash of the previous block.
     *
     * @type {string}
     * @memberof BtcBlock
     */
    String getPrevBlock();

    void setPrevBlock(String prevBlock);

    /**
     * The root node of a merkle tree, a descendant of all the hashed pairs in the tree.
     *
     * @type {string}
     * @memberof BtcBlock
     */
    String getMerkleRoot();

    void setMerkleRoot(String merkleRoot);

    /**
     * Time of the block.
     *
     * @type {number}
     * @memberof BtcBlock
     */
    BigDecimal getTime();

    void setTime(BigDecimal time);

    /**
     * @type {number}
     * @memberof BtcBlock
     */
    BigDecimal getBits();

    void setBits(BigDecimal bits);

    /**
     * Arbitrary number that is used in Bitcoin's proof of work consensus algorithm.
     *
     * @type {number}
     * @memberof BtcBlock
     */
    BigDecimal getNonce();

    void setNonce(BigDecimal nonce);

    /**
     * @type {Array<BtcTx>}
     * @memberof BtcBlock
     */
    IBtcTx[] getTxs();

    void setTxs(IBtcTx[] txs);
}
