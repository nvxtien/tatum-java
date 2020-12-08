package io.tatum.model.response.ltc;

import java.math.BigDecimal;

public class LtcBlock implements ILtcBlock {

    private String hash;
    private BigDecimal height;
    private BigDecimal version;
    private String prevBlock;
    private String merkleRoot;
    private BigDecimal ts;
    private BigDecimal bits;
    private BigDecimal nonce;
    private ILtcTx[] txs;

    @Override
    public String getHash() {
        return hash;
    }

    @Override
    public void setHash(String hash) {
        this.hash = hash;
    }

    public BigDecimal getHeight() {
        return height;
    }

    @Override
    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    @Override
    public BigDecimal getVersion() {
        return version;
    }

    @Override
    public void setVersion(BigDecimal version) {
        this.version = version;
    }

    @Override
    public String getPrevBlock() {
        return prevBlock;
    }

    @Override
    public void setPrevBlock(String prevBlock) {
        this.prevBlock = prevBlock;
    }

    @Override
    public String getMerkleRoot() {
        return merkleRoot;
    }

    @Override
    public void setMerkleRoot(String merkleRoot) {
        this.merkleRoot = merkleRoot;
    }

    @Override
    public BigDecimal getTs() {
        return ts;
    }

    @Override
    public void setTs(BigDecimal ts) {
        this.ts = ts;
    }

    @Override
    public BigDecimal getBits() {
        return bits;
    }

    @Override
    public void setBits(BigDecimal bits) {
        this.bits = bits;
    }

    @Override
    public BigDecimal getNonce() {
        return nonce;
    }

    @Override
    public void setNonce(BigDecimal nonce) {
        this.nonce = nonce;
    }

    @Override
    public ILtcTx[] getTxs() {
        return txs;
    }

    @Override
    public void setTxs(ILtcTx[] txs) {
        this.txs = txs;
    }
}
