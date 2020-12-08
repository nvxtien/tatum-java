package io.tatum.model.response.ltc;

import java.math.BigDecimal;

/**
 *
 * @export
 * @interface LtcBlock
 */
public interface ILtcBlock {

    /**
     * Hash of block.
     * @type {string}
     * @memberof LtcBlock
     */
    String getHash();
    void setHash(String hash);

    /**
     * The number of blocks preceding a particular block on a block chain.
     * @type {number}
     * @memberof LtcBlock
     */
    BigDecimal getHeight();
    void setHeight(BigDecimal height);

    /**
     * Block version.
     * @type {number}
     * @memberof LtcBlock
     */
    BigDecimal getVersion();
    void setVersion(BigDecimal version);

    /**
     * Hash of the previous block.
     * @type {string}
     * @memberof LtcBlock
     */
    String getPrevBlock();
    void setPrevBlock(String prevBlock);

    /**
     * The root node of a merkle tree, a descendant of all the hashed pairs in the tree.
     * @type {string}
     * @memberof LtcBlock
     */
    String getMerkleRoot();
    void setMerkleRoot(String merkleRoot);

    /**
     * Time of the block.
     * @type {number}
     * @memberof LtcBlock
     */
    BigDecimal getTs();
    void setTs(BigDecimal ts);

    /**
     *
     * @type {number}
     * @memberof LtcBlock
     */
    BigDecimal getBits();
    void setBits(BigDecimal bits);

    /**
     * Arbitrary number that is used in Litecoin's proof of work consensus algorithm.
     * @type {number}
     * @memberof LtcBlock
     */
    BigDecimal getNonce();
    void setNonce(BigDecimal nonce);

    /**
     *
     * @type {Array<LtcTx>}
     * @memberof LtcBlock
     */
    ILtcTx[] getTxs();
    void setTxs(ILtcTx[] txs);
}
