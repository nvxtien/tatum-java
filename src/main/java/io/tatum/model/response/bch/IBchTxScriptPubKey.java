package io.tatum.model.response.bch;

public interface IBchTxScriptPubKey {

    /**
     * @type {string}
     * @memberof BchTxScriptPubKey
     */
    String getHex();

    void setHex(String hex);

    /**
     * @type {string}
     * @memberof BchTxScriptPubKey
     */
    String getAsm();

    void setAsm(String asm);

    /**
     * @type {Array<string>}
     * @memberof BchTxScriptPubKey
     */
    String[] getAddresses();

    void setAddresses(String[] addresses);

    /**
     * @type {string}
     * @memberof BchTxScriptPubKey
     */
    String getType();

    void setType(String type);
}
