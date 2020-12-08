package io.tatum.blockchain;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Strings;
import io.tatum.model.response.common.TransactionHash;
import io.tatum.model.response.eth.EthBlock;
import io.tatum.model.response.eth.EthTx;
import io.tatum.model.response.eth.IEthBlock;
import io.tatum.utils.Async;
import io.tatum.utils.Env;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;

import static io.tatum.constants.Constant.TATUM_API_URL;

public final class Ethereum {

    /**
     * For more details, see <a href="https://tatum.io/apidoc#operation/EthBroadcast" target="_blank">Tatum API documentation</a>
     */
    public TransactionHash ethBroadcast(final String txData, final String signatureId) throws IOException, ExecutionException, InterruptedException {
        String uri = Strings.isNullOrEmpty(Env.getTatumApiKey()) ? TATUM_API_URL + "/v3/ethereum/broadcast" : Env.getTatumApiKey();

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
     * For more details, see <a href="https://tatum.io/apidoc#operation/EthGetTransactionCount" target="_blank">Tatum API documentation</a>
     */
    public BigDecimal ethGetTransactionsCount(String address) throws IOException, ExecutionException, InterruptedException {
        String uri = Strings.isNullOrEmpty(Env.getTatumApiUrl()) ? TATUM_API_URL + "/v3/ethereum/transaction/count/" + address : Env.getTatumApiUrl();
        String count = Async.get(uri, Env.getTatumApiKey());
        // TO-DO
        return new BigDecimal(count);
    }

    /**
     * For more details, see <a href="https://tatum.io/apidoc#operation/EthGetCurrentBlock" target="_blank">Tatum API documentation</a>
     */
    public BigDecimal ethGetCurrentBlock() throws IOException, ExecutionException, InterruptedException {
        String uri = Strings.isNullOrEmpty(Env.getTatumApiUrl()) ? TATUM_API_URL + "/v3/ethereum/block/current" : Env.getTatumApiUrl();
        String block = Async.get(uri, Env.getTatumApiKey());
        // TO-DO
        return new BigDecimal(block);
    }

    /**
     * For more details, see <a href="https://tatum.io/apidoc#operation/EthGetBlock" target="_blank">Tatum API documentation</a>
     */
    public IEthBlock ethGetBlock(String hash) throws IOException, ExecutionException, InterruptedException {
        String uri = Strings.isNullOrEmpty(Env.getTatumApiUrl()) ? TATUM_API_URL + "/v3/ethereum/block/" + hash : Env.getTatumApiUrl();
        String block = Async.get(uri, Env.getTatumApiKey());
        // TO-DO
        return new EthBlock();
    }

    /**
     * For more details, see <a href="https://tatum.io/apidoc#operation/EthGetBalance" target="_blank">Tatum API documentation</a>
     */
    public BigDecimal ethGetAccountBalance(String address) throws IOException, ExecutionException, InterruptedException {
        String uri = Strings.isNullOrEmpty(Env.getTatumApiUrl()) ? TATUM_API_URL + "/v3/ethereum/account/balance" + address : Env.getTatumApiUrl();
        String balance = Async.get(uri, Env.getTatumApiKey());
        // TO-DO
        return new BigDecimal(balance);
    }

    /**
     * For more details, see <a href="https://tatum.io/apidoc#operation/EthErc20GetBalance" target="_blank">Tatum API documentation</a>
     */
    public BigDecimal ethGetAccountErc20Address(String address, String contractAddress) throws IOException, ExecutionException, InterruptedException {
        String uri = Strings.isNullOrEmpty(Env.getTatumApiUrl()) ? TATUM_API_URL + "/v3/ethereum/account/balance/erc20/" + address + "?contractAddress=" + contractAddress : Env.getTatumApiUrl();
        String transaction = Async.get(uri, Env.getTatumApiKey());
        // TO-DO
        return new BigDecimal(transaction);
    }

    /**
     * For more details, see <a href="https://tatum.io/apidoc#operation/EthGetTransaction" target="_blank">Tatum API documentation</a>
     */
    public EthTx ethGetTransaction(String hash) throws IOException, ExecutionException, InterruptedException {
        String uri = Strings.isNullOrEmpty(Env.getTatumApiUrl()) ? TATUM_API_URL + "/v3/ethereum/transaction/" + hash : Env.getTatumApiUrl();
        String transactions = Async.get(uri, Env.getTatumApiKey());
        return new EthTx();
    }

    /**
     * For more details, see <a href="https://tatum.io/apidoc#operation/EthGetTransactionByAddress" target="_blank">Tatum API documentation</a>
     */
    public EthTx[] ethGetAccountTransactions(String address, Integer pageSize, Integer offset) throws IOException, ExecutionException, InterruptedException {
        String uri = Strings.isNullOrEmpty(Env.getTatumApiUrl()) ? TATUM_API_URL + "/v3/ethereum/transaction/" + address + "?pageSize=" + pageSize + "&offset=" + offset : Env.getTatumApiUrl();
        String balance = Async.get(uri, Env.getTatumApiKey());
        //TO-DO
        return new EthTx[50];
    }
}
