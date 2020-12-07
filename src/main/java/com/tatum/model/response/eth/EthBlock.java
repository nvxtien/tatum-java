package com.tatum.model.response.eth;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Strings;
import com.tatum.model.response.common.TransactionHash;
import com.tatum.utils.Env;

import java.io.IOException;
import java.math.BigDecimal;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;

import static com.tatum.constants.Constant.TATUM_API_URL;

public class EthBlock {

    /**
     * For more details, see <a href="https://tatum.io/apidoc#operation/EthBroadcast" target="_blank">Tatum API documentation</a>
     */
    public TransactionHash ethBroadcast(String txData, String signatureId) throws IOException, ExecutionException, InterruptedException {
        String uri = Strings.isNullOrEmpty(Env.getTatumApiKey()) ? TATUM_API_URL + "/v3/ethereum/broadcast" : Env.getTatumApiKey();

        var values = new HashMap<String, String>() {{
            put("txData", txData);
            put("signatureId", signatureId);
        }};

        var objectMapper = new ObjectMapper();
        String requestBody = objectMapper.writeValueAsString(values);

        String txId = postAsync(uri, Env.getTatumApiKey(), requestBody);
        return new TransactionHash(txId);
    }

    /**
     * For more details, see <a href="https://tatum.io/apidoc#operation/EthGetTransactionCount" target="_blank">Tatum API documentation</a>
     */
    public BigDecimal ethGetTransactionsCount(String address) throws IOException, ExecutionException, InterruptedException {
        String uri = Strings.isNullOrEmpty(Env.getTatumApiUrl()) ? TATUM_API_URL + "/v3/ethereum/transaction/count/" + address : Env.getTatumApiUrl();
        String count = getAsync(uri, Env.getTatumApiKey());
        // TO-DO
        return new BigDecimal(count);
    }

    /**
     * For more details, see <a href="https://tatum.io/apidoc#operation/EthGetCurrentBlock" target="_blank">Tatum API documentation</a>
     */
    public EthBlock ethGetCurrentBlock() throws IOException, ExecutionException, InterruptedException {
        String uri = Strings.isNullOrEmpty(Env.getTatumApiUrl()) ? TATUM_API_URL + "/v3/ethereum/block/current" : Env.getTatumApiUrl();
        String block = getAsync(uri, Env.getTatumApiKey());
        // TO-DO
        return new EthBlock();
    }

    /**
     * For more details, see <a href="https://tatum.io/apidoc#operation/EthGetBlock" target="_blank">Tatum API documentation</a>
     */
    public EthBlock ethGetBlock(String hash) throws IOException, ExecutionException, InterruptedException {
        String uri = Strings.isNullOrEmpty(Env.getTatumApiUrl()) ? TATUM_API_URL + "/v3/ethereum/block/" + hash : Env.getTatumApiUrl();
        String block = getAsync(uri, Env.getTatumApiKey());
        // TO-DO
        return new EthBlock();
    }

    /**
     * For more details, see <a href="https://tatum.io/apidoc#operation/EthGetBalance" target="_blank">Tatum API documentation</a>
     */
    public BigDecimal ethGetAccountBalance(String address) throws IOException, ExecutionException, InterruptedException {
        String uri = Strings.isNullOrEmpty(Env.getTatumApiUrl()) ? TATUM_API_URL + "/v3/ethereum/account/balance" + address : Env.getTatumApiUrl();
        String balance = getAsync(uri, Env.getTatumApiKey());
        // TO-DO
        return new BigDecimal(balance);
    }

    /**
     * For more details, see <a href="https://tatum.io/apidoc#operation/EthErc20GetBalance" target="_blank">Tatum API documentation</a>
     */
    public BigDecimal ethGetAccountErc20Address(String address, String contractAddress) throws IOException, ExecutionException, InterruptedException {
        String uri = Strings.isNullOrEmpty(Env.getTatumApiUrl()) ? TATUM_API_URL + "/v3/ethereum/account/balance/erc20/" + address + "?contractAddress=" + contractAddress : Env.getTatumApiUrl();
        String transaction = getAsync(uri, Env.getTatumApiKey());
        // TO-DO
        return new BigDecimal(transaction);
    }

    /**
     * For more details, see <a href="https://tatum.io/apidoc#operation/EthGetTransaction" target="_blank">Tatum API documentation</a>
     */
    public EthTx ethGetTransaction(String hash) throws IOException, ExecutionException, InterruptedException {
        String uri = Strings.isNullOrEmpty(Env.getTatumApiUrl()) ? TATUM_API_URL + "/v3/ethereum/transaction/" + hash : Env.getTatumApiUrl();
        String transactions = getAsync(uri, Env.getTatumApiKey());
        return new EthTx();
    }

    /**
     * For more details, see <a href="https://tatum.io/apidoc#operation/EthGetTransactionByAddress" target="_blank">Tatum API documentation</a>
     */
    public EthTx[] ethGetAccountTransactions(String address, Integer pageSize, Integer offset) throws IOException, ExecutionException, InterruptedException {
        String uri = Strings.isNullOrEmpty(Env.getTatumApiUrl()) ? TATUM_API_URL + "/v3/ethereum/transaction/" + address + "?pageSize=" + pageSize + "&offset=" + offset : Env.getTatumApiUrl();
        String balance = getAsync(uri, Env.getTatumApiKey());
        //TO-DO
        return new EthTx[50];
    }

    private String postAsync(String uri, String apiKey, String requestBody) throws ExecutionException, InterruptedException {
        var request = HttpRequest.newBuilder()
                .uri(URI.create(uri))
                .timeout(Duration.ofMinutes(1))
                .header("Content-Type", "application/json")
                .headers("x-api-key", apiKey)
                .POST(HttpRequest.BodyPublishers.ofString(requestBody))
                .build();

        var client = HttpClient.newHttpClient();
        return client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(response -> {
                    System.out.println(response.statusCode());
                    return response;
                })
                .thenApply(HttpResponse::body).get();
    }

    private String getAsync(String uri, String apiKey) throws ExecutionException, InterruptedException {
        var request = HttpRequest.newBuilder()
                .uri(URI.create(uri))
                .timeout(Duration.ofMinutes(1))
                .header("Content-Type", "application/json")
                .headers("x-api-key", apiKey)
                .POST(HttpRequest.BodyPublishers.ofString("{}"))
                .build();

        var client = HttpClient.newHttpClient();
        return client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(response -> {
                    System.out.println(response.statusCode());
                    return response;
                })
                .thenApply(HttpResponse::body).get();
    }
}
