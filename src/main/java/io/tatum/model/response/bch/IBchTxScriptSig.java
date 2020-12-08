package io.tatum.model.response.bch;

/**
 * @export
 * @interface BchTxScriptSig
 */
public interface IBchTxScriptSig {

    /**
     * @type {string}
     * @memberof BchTxScriptSig
     */
    String getHex();

    void setHex(String hex);

    /**
     * @type {string}
     * @memberof BchTxScriptSig
     */
    String getAsm();

    void setAsm(String asm);
}
