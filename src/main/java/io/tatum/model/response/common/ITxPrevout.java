package io.tatum.model.response.common;

import java.math.BigDecimal;

/**
 * @export
 * @interface ITxPrevout
 */
public interface ITxPrevout {
    /**
     * Transaction hash of the input.
     *
     * @type {string}
     * @memberof ITxPrevout
     */
    String getHash();

    void setHash(String hash);

    /**
     * Transaction index of the input.
     *
     * @type {number}
     * @memberof ITxPrevout
     */
    BigDecimal getIndex();

    void setIndex(BigDecimal index);
}
