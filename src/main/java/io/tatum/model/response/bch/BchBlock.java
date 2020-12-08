package io.tatum.model.response.bch;

import java.math.BigDecimal;

public class BchBlock implements IBchBlock {

    private String hash;
    private BigDecimal size;
    private BigDecimal height;
    private BigDecimal version;
    private String merkleroot;
    private IBchTx[] tx;
    private BigDecimal time;
    private BigDecimal nonce;
    private BigDecimal difficulty;
    private BigDecimal confirmations;
    private String previousblockhash;
    private String nextblockhash;

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public BigDecimal getSize() {
        return size;
    }

    public void setSize(BigDecimal size) {
        this.size = size;
    }

    public BigDecimal getHeight() {
        return height;
    }

    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    public BigDecimal getVersion() {
        return version;
    }

    public void setVersion(BigDecimal version) {
        this.version = version;
    }

    public String getMerkleroot() {
        return merkleroot;
    }

    public void setMerkleroot(String merkleroot) {
        this.merkleroot = merkleroot;
    }

    public IBchTx[] getTx() {
        return tx;
    }

    public void setTx(IBchTx[] tx) {
        this.tx = tx;
    }

    public BigDecimal getTime() {
        return time;
    }

    public void setTime(BigDecimal time) {
        this.time = time;
    }

    public BigDecimal getNonce() {
        return nonce;
    }

    public void setNonce(BigDecimal nonce) {
        this.nonce = nonce;
    }

    public BigDecimal getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(BigDecimal difficulty) {
        this.difficulty = difficulty;
    }

    public BigDecimal getConfirmations() {
        return confirmations;
    }

    public void setConfirmations(BigDecimal confirmations) {
        this.confirmations = confirmations;
    }

    public String getPreviousblockhash() {
        return previousblockhash;
    }

    public void setPreviousblockhash(String previousblockhash) {
        this.previousblockhash = previousblockhash;
    }

    public String getNextblockhash() {
        return nextblockhash;
    }

    public void setNextblockhash(String nextblockhash) {
        this.nextblockhash = nextblockhash;
    }
}
