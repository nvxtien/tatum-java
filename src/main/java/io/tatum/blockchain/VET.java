package io.tatum.blockchain;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Strings;
import io.tatum.model.request.EstimateGasVet;
import io.tatum.model.response.common.TransactionHash;
import io.tatum.model.response.vet.VetBlock;
import io.tatum.model.response.vet.VetEstimateGas;
import io.tatum.model.response.vet.VetTx;
import io.tatum.model.response.vet.VetTxReceipt;
import io.tatum.utils.Async;
import io.tatum.utils.Env;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;

import static io.tatum.constants.Constant.TATUM_API_URL;

public class VET {

    /**
     * For more details, see <a href="https://tatum.io/apidoc#operation/VetBroadcast" target="_blank">Tatum API documentation</a>
     */
    public TransactionHash vetBroadcast(String txData, String signatureId) throws IOException, ExecutionException, InterruptedException {
        String uri = Strings.isNullOrEmpty(Env.getTatumApiKey()) ? TATUM_API_URL + "/v3/vet/broadcast" : Env.getTatumApiKey();

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
     * For more details, see <a href="https://tatum.io/apidoc#operation/VetEstimateGas" target="_blank">Tatum API documentation</a>
     */
    public VetEstimateGas vetEstimateGas(EstimateGasVet body) throws IOException, ExecutionException, InterruptedException {
        // TO-DO
        // await validateOrReject(body);
        String uri = Strings.isNullOrEmpty(Env.getTatumApiKey()) ? TATUM_API_URL + "/v3/vet/broadcast/transaction/gas" : Env.getTatumApiKey();
        var objectMapper = new ObjectMapper();
        String requestBody = objectMapper.writeValueAsString(body);
        String estimatedGas = Async.post(uri, Env.getTatumApiKey(), requestBody);
        // TO-DO
        return new VetEstimateGas();
    }

    /**
     * For more details, see <a href="https://tatum.io/apidoc#operation/VetGetCurrentBlock" target="_blank">Tatum API documentation</a>
     */
    public BigDecimal vetGetCurrentBlock() throws IOException, ExecutionException, InterruptedException {
        String uri = Strings.isNullOrEmpty(Env.getTatumApiUrl()) ? TATUM_API_URL + "/v3/vet/current" : Env.getTatumApiUrl();
        String block = Async.get(uri, Env.getTatumApiKey());
        // TO-DO
        return new BigDecimal(block);
    }

    /**
     * For more details, see <a href="https://tatum.io/apidoc#operation/VetGetBlock" target="_blank">Tatum API documentation</a>
     */
    public VetBlock vetGetBlock(String hash) throws IOException, ExecutionException, InterruptedException {
        String uri = Strings.isNullOrEmpty(Env.getTatumApiUrl()) ? TATUM_API_URL + "/v3/vet/block/" + hash : Env.getTatumApiUrl();
        String block = Async.get(uri, Env.getTatumApiKey());
        // TO-DO
        return new VetBlock();
    }

    /**
     * For more details, see <a href="https://tatum.io/apidoc#operation/VetGetBalance" target="_blank">Tatum API documentation</a>
     */
    public BigDecimal vetGetAccountBalance(String address) throws IOException, ExecutionException, InterruptedException {
        String uri = Strings.isNullOrEmpty(Env.getTatumApiUrl()) ? TATUM_API_URL + "/v3/vet/account/balance/" + address : Env.getTatumApiUrl();
        String balance = Async.get(uri, Env.getTatumApiKey());
        // TO-DO
        return new BigDecimal(balance);
    }

    /**
     * For more details, see <a href="https://tatum.io/apidoc#operation/VetGetEnergy" target="_blank">Tatum API documentation</a>
     */
    public BigDecimal vetGetAccountEnergy(String address) throws IOException, ExecutionException, InterruptedException {
        String uri = Strings.isNullOrEmpty(Env.getTatumApiUrl()) ? TATUM_API_URL + "/v3/vet/account/energy/" + address : Env.getTatumApiUrl();
        String energy = Async.get(uri, Env.getTatumApiKey());
        // TO-DO
        return new BigDecimal(energy);
    }

    /**
     * For more details, see <a href="https://tatum.io/apidoc#operation/VetGetTransaction" target="_blank">Tatum API documentation</a>
     */
    public VetTx vetGetTransaction(String hash) throws IOException, ExecutionException, InterruptedException {
        String uri = Strings.isNullOrEmpty(Env.getTatumApiUrl()) ? TATUM_API_URL + "/v3/vet/transaction/" + hash : Env.getTatumApiUrl();
        String tx = Async.get(uri, Env.getTatumApiKey());
        // TO-DO
        return new VetTx();
    }

    /**
     * For more details, see <a href="https://tatum.io/apidoc#operation/VetGetTransactionReceipt" target="_blank">Tatum API documentation</a>
     */
    public VetTxReceipt vetGetTransactionReceipt(String hash) throws IOException, ExecutionException, InterruptedException {
        String uri = Strings.isNullOrEmpty(Env.getTatumApiUrl()) ? TATUM_API_URL + "/v3/vet/transaction/" + hash + "/receipt" : Env.getTatumApiUrl();
        String receipt = Async.get(uri, Env.getTatumApiKey());
        // TO-DO
        return new VetTxReceipt();
    }

}
