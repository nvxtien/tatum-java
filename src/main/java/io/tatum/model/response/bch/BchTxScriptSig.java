package io.tatum.model.response.bch;

public class BchTxScriptSig implements IBchTxScriptSig {

    private String hex;
    private String asm;

    @Override
    public String getHex() {
        return hex;
    }

    @Override
    public void setHex(String hex) {
        this.hex = hex;
    }

    @Override
    public String getAsm() {
        return asm;
    }

    @Override
    public void setAsm(String asm) {
        this.asm = asm;
    }
}
