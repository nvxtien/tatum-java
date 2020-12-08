package io.tatum.model.response.bch;

public class BchTx {

    /**
     *
     * @type {string}
     * @memberof BchTx
     */
    txid: string;
    /**
     *
     * @type {number}
     * @memberof BchTx
     */
    version: number;
    /**
     *
     * @type {number}
     * @memberof BchTx
     */
    locktime: number;
    /**
     *
     * @type {Array<BchTxVin>}
     * @memberof BchTx
     */
    vin: BchTxVin[];
    /**
     *
     * @type {Array<BchTxVout>}
     * @memberof BchTx
     */
    vout: BchTxVout[];
}
