package io.tatum.model.response.bch;

import java.math.BigDecimal;

public class BchInfo implements IBchInfo {

    private String chain;
    private BigDecimal blocks;
    private String bestblockhash;
    private BigDecimal difficulty;

    public String getChain() {
        return chain;
    }

    public void setChain(String chain) {
        this.chain = chain;
    }

    public BigDecimal getBlocks() {
        return blocks;
    }

    public void setBlocks(BigDecimal blocks) {
        this.blocks = blocks;
    }

    public String getBestblockhash() {
        return bestblockhash;
    }

    public void setBestblockhash(String bestblockhash) {
        this.bestblockhash = bestblockhash;
    }

    public BigDecimal getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(BigDecimal difficulty) {
        this.difficulty = difficulty;
    }
}
