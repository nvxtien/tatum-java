package io.tatum.model.response.common;

public class TransactionHash implements ITransactionHash {

    private String txId;

    public TransactionHash(String txId) {
        this.txId = txId;
    }

    @Override
    public String getTxId() {
        return txId;
    }

    @Override
    public void setTxId(String txId) {
        this.txId = txId;
    }
}
