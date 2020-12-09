package io.tatum.blockchain;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Strings;
import io.tatum.model.response.common.*;
import io.tatum.model.response.ltc.*;
import io.tatum.utils.Async;
import io.tatum.utils.Env;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;

import static io.tatum.constants.Constant.TATUM_API_URL;

public final class Litecoin {

    /**
     * For more details, see <a href="https://tatum.io/apidoc#operation/LtcBroadcast" target="_blank">Tatum API documentation</a>
     */
    public TransactionHash ltcBroadcast(String txData, String signatureId) throws IOException, ExecutionException, InterruptedException {
        String uri = Strings.isNullOrEmpty(Env.getTatumApiKey()) ? TATUM_API_URL + "/v3/litecoin/broadcast" : Env.getTatumApiKey();

        var values = new HashMap<String, String>() {{
            put("txData", txData);
            put("signatureId", signatureId);
        }};

        var objectMapper = new ObjectMapper();
        String requestBody = objectMapper.writeValueAsString(values);

        String txId = Async.post(uri, Env.getTatumApiKey(), requestBody);
        return new TransactionHash(txId);
    }

    /**
     * For more details, see <a href="https://tatum.io/apidoc#operation/LtcGetBlockChainInfo" target="_blank">Tatum API documentation</a>
     */
    public IChainInfo ltcGetCurrentBlock() throws IOException, ExecutionException, InterruptedException {
        String uri = Strings.isNullOrEmpty(Env.getTatumApiUrl()) ? TATUM_API_URL + "/v3/litecoin/info" : Env.getTatumApiUrl();
        String block = Async.get(uri, Env.getTatumApiKey());
        // TO-DO
        return new LtcInfo();
    }

    /**
     * For more details, see <a href="https://tatum.io/apidoc#operation/LtcGetBlock" target="_blank">Tatum API documentation</a>
     */
    public ILtcBlock ltcGetBlock(String hash) throws IOException, ExecutionException, InterruptedException {
        String uri = Strings.isNullOrEmpty(Env.getTatumApiUrl()) ? TATUM_API_URL + "/v3/litecoin/block/" + hash : Env.getTatumApiUrl();
        String block = Async.get(uri, Env.getTatumApiKey());
        // TO-DO
        return new LtcBlock();
    }

    /**
     * For more details, see <a href="https://tatum.io/apidoc#operation/LtcGetBlockHash" target="_blank">Tatum API documentation</a>
     */
    public IBlockHash ltcGetBlockHash(BigDecimal i) throws IOException, ExecutionException, InterruptedException {
        String uri = Strings.isNullOrEmpty(Env.getTatumApiUrl()) ? TATUM_API_URL + "/v3/litecoin/block/hash/" + i : Env.getTatumApiUrl();
        String hash = Async.get(uri, Env.getTatumApiKey());
        // TO-DO
        return new BlockHash();
    }

    /**
     * For more details, see <a href="https://tatum.io/apidoc#operation/LtcGetUTXO" target="_blank">Tatum API documentation</a>
     */
    public IUTXO ltcGetUTXO(String hash, BigDecimal i) throws IOException, ExecutionException, InterruptedException {
        String uri = Strings.isNullOrEmpty(Env.getTatumApiUrl()) ? TATUM_API_URL + "/v3/litecoin/utxo/" + hash + "/" + i : Env.getTatumApiUrl();
        String utxo = Async.get(uri, Env.getTatumApiKey());
        // TO-DO
        return new LtcUTXO();
    }

    /**
     * For more details, see <a href="https://tatum.io/apidoc#operation/LtcGetTxByAddress" target="_blank">Tatum API documentation</a>
     */
    public ILtcTx[] ltcGetTxForAccount(String address, Integer pageSize, Integer offset) throws IOException, ExecutionException, InterruptedException {
        String uri = Strings.isNullOrEmpty(Env.getTatumApiUrl()) ? TATUM_API_URL + "/v3/litecoin/transaction/address/" + address + "?pageSize=" + pageSize + "&offset=" + offset : Env.getTatumApiUrl();
        String tx = Async.get(uri, Env.getTatumApiKey());
        // TO-DO
        return new LtcTx[]{};
    }

    /**
     * For more details, see <a href="https://tatum.io/apidoc#operation/LtcGetRawTransaction" target="_blank">Tatum API documentation</a>
     */
    public ILtcTx ltcGetTransaction(String hash) throws IOException, ExecutionException, InterruptedException {
        String uri = Strings.isNullOrEmpty(Env.getTatumApiUrl()) ? TATUM_API_URL + "/v3/litecoin/transaction/" + hash : Env.getTatumApiUrl();
        String tx = Async.get(uri, Env.getTatumApiKey());
        // TO-DO
        return new LtcTx();
    }

}
