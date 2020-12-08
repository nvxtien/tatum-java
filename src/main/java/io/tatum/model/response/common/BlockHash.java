package io.tatum.model.response.common;

public class BlockHash implements IBlockHash {

    private String hash;

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }
}
