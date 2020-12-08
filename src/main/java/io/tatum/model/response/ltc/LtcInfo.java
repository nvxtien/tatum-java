package io.tatum.model.response.ltc;

import io.tatum.model.response.common.IChainInfo;

import java.math.BigDecimal;

public class LtcInfo implements IChainInfo {

    private String chain;
    private BigDecimal blocks;
    private BigDecimal headers;
    private String bestblockhash;
    private BigDecimal difficulty;

    @Override
    public String getChain() {
        return chain;
    }

    @Override
    public void setChain(String chain) {
        this.chain = chain;
    }

    @Override
    public BigDecimal getBlocks() {
        return blocks;
    }

    @Override
    public void setBlocks(BigDecimal blocks) {
        this.blocks = blocks;
    }

    @Override
    public BigDecimal getHeaders() {
        return headers;
    }

    @Override
    public void setHeaders(BigDecimal headers) {
        this.headers = headers;
    }

    @Override
    public String getBestblockhash() {
        return bestblockhash;
    }

    @Override
    public void setBestblockhash(String bestblockhash) {
        this.bestblockhash = bestblockhash;
    }

    @Override
    public BigDecimal getDifficulty() {
        return difficulty;
    }

    @Override
    public void setDifficulty(BigDecimal difficulty) {
        this.difficulty = difficulty;
    }
}
