package io.tatum.model.response.xlm;

public class Account implements IAccount {

    private String sequence;

    @Override
    public String getSequence() {
        return sequence;
    }

    @Override
    public void setSequence(String sequence) {
        this.sequence = sequence;
    }
}
