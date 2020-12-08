package io.tatum.model.response.bch;

import java.math.BigDecimal;

/**
 * @export
 * @interface BchBlock
 */
public interface IBchBlock {

    /**
     * Hash of block.
     *
     * @type {string}
     * @memberof BchBlock
     */
    String getHash();

    void setHash(String hash);

    /**
     * Block size.
     *
     * @type {number}
     * @memberof BchBlock
     */
    BigDecimal getSize();

    void setSize(BigDecimal size);

    /**
     * The number of blocks preceding a particular block on a block chain.
     *
     * @type {number}
     * @memberof BchBlock
     */
    BigDecimal getHeight();

    void setHeight(BigDecimal height);

    /**
     * Block version.
     *
     * @type {number}
     * @memberof BchBlock
     */
    BigDecimal getVersion();

    void setVersion(BigDecimal version);

    /**
     * The root node of a merkle tree, a descendant of all the hashed pairs in the tree.
     *
     * @type {string}
     * @memberof BchBlock
     */
    String getMerkleroot();

    void setMerkleroot(String merkleroot);

    /**
     * List of transactions present in the block.
     *
     * @type {Array<BchTx>}
     * @memberof BchBlock
     */
    IBchTx[] getTx();

    void setTx(IBchTx[] tx);

    /**
     * Time of the block.
     *
     * @type {number}
     * @memberof BchBlock
     */
    BigDecimal getTime();

    void setTime(BigDecimal time);

    /**
     * Arbitrary number that is used in Bitcoin's proof of work consensus algorithm.
     *
     * @type {number}
     * @memberof BchBlock
     */
    BigDecimal getNonce();

    void setNonce(BigDecimal nonce);

    /**
     * @type {number}
     * @memberof BchBlock
     */
    BigDecimal getDifficulty();

    void setDifficulty(BigDecimal difficulty);

    /**
     * Number of blocks mined after this block.
     *
     * @type {number}
     * @memberof BchBlock
     */
    BigDecimal getConfirmations();

    void setConfirmations(BigDecimal confirmations);

    /**
     * Hash of the previous block.
     *
     * @type {string}
     * @memberof BchBlock
     */
    String getPreviousblockhash();

    void setPreviousblockhash(String previousblockhash);

    /**
     * Hash of the next block.
     *
     * @type {string}
     * @memberof BchBlock
     */
    String getNextblockhash();

    void setNextblockhash(String nextblockhash);

}
