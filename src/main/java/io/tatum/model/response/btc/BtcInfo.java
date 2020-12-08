package io.tatum.model.response.btc;

import java.math.BigDecimal;

public class BtcInfo implements IBtcInfo {

    String chain;
    BigDecimal blocks;
    BigDecimal headers;
    String bestblockhash;
    BigDecimal difficulty;

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

    public BigDecimal getHeaders() {
        return headers;
    }

    public void setHeaders(BigDecimal headers) {
        this.headers = headers;
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
