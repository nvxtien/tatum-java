package com.tatum.model.response.btc;

import java.math.BigDecimal;

public class BtcBlock implements IBtcBlock {

    private String hash;
    private BigDecimal height;
    private BigDecimal depth;
    private BigDecimal version;
    private String prevBlock;
    private String merkleRoot;
    private BigDecimal time;
    private BigDecimal bits;
    private BigDecimal nonce;
    private IBtcTx[] txs;

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public BigDecimal getHeight() {
        return height;
    }

    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    public BigDecimal getDepth() {
        return depth;
    }

    public void setDepth(BigDecimal depth) {
        this.depth = depth;
    }

    public BigDecimal getVersion() {
        return version;
    }

    public void setVersion(BigDecimal version) {
        this.version = version;
    }

    public String getPrevBlock() {
        return prevBlock;
    }

    public void setPrevBlock(String prevBlock) {
        this.prevBlock = prevBlock;
    }

    public String getMerkleRoot() {
        return merkleRoot;
    }

    public void setMerkleRoot(String merkleRoot) {
        this.merkleRoot = merkleRoot;
    }

    public BigDecimal getTime() {
        return time;
    }

    public void setTime(BigDecimal time) {
        this.time = time;
    }

    public BigDecimal getBits() {
        return bits;
    }

    public void setBits(BigDecimal bits) {
        this.bits = bits;
    }

    public BigDecimal getNonce() {
        return nonce;
    }

    public void setNonce(BigDecimal nonce) {
        this.nonce = nonce;
    }

    public IBtcTx[] getTxs() {
        return txs;
    }

    public void setTxs(IBtcTx[] txs) {
        this.txs = txs;
    }
}
