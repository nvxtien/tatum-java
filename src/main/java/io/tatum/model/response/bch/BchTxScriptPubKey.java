package io.tatum.model.response.bch;

public class BchTxScriptPubKey {

    /**
     *
     * @type {string}
     * @memberof BchTxScriptPubKey
     */
    String hex;

    public String getHex() {
        return hex;
    }

    public void setHex(String hex) {
        this.hex = hex;
    }

    /**
     *
     * @type {string}
     * @memberof BchTxScriptPubKey
     */
    String asm;

    public String getAsm() {
        return asm;
    }

    public void setAsm(String asm) {
        this.asm = asm;
    }

    /**
     *
     * @type {Array<string>}
     * @memberof BchTxScriptPubKey
     */
    String[] addresses;

    public String[] getAddresses() {
        return addresses;
    }

    public void setAddresses(String[] addresses) {
        this.addresses = addresses;
    }

    /**
     *
     * @type {string}
     * @memberof BchTxScriptPubKey
     */
    String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
