package io.tatum.blockchain;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Strings;
import io.tatum.model.response.common.TransactionHash;
import io.tatum.model.response.xlm.Account;
import io.tatum.model.response.xlm.IAccount;
import io.tatum.utils.Async;
import io.tatum.utils.Env;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;

import static io.tatum.constants.Constant.TATUM_API_URL;

public class XLM {

    /**
     * For more details, see <a href="https://tatum.io/apidoc#operation/XlmGetAccountInfo" target="_blank">Tatum API documentation</a>
     */
    public IAccount xlmGetAccountInfo(String account) throws IOException, ExecutionException, InterruptedException {
        String uri = Strings.isNullOrEmpty(Env.getTatumApiUrl()) ? TATUM_API_URL + "/v3/xlm/account/" + account : Env.getTatumApiUrl();
        String block = Async.get(uri, Env.getTatumApiKey());
        // TO-DO
        return new Account();
    }

    /**
     * For more details, see <a href="https://tatum.io/apidoc#operation/XlmBroadcast" target="_blank">Tatum API documentation</a>
     */
    public TransactionHash xlmBroadcast(String txData, String signatureId) throws IOException, ExecutionException, InterruptedException {
        String uri = Strings.isNullOrEmpty(Env.getTatumApiKey()) ? TATUM_API_URL + "/v3/xlm/broadcast" : Env.getTatumApiKey();

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
     * For more details, see <a href="https://tatum.io/apidoc#operation/XlmGetLastClosedLedger" target="_blank">Tatum API documentation</a>
     */
    public String xlmGetCurrentLedger() throws IOException, ExecutionException, InterruptedException {
        String uri = Strings.isNullOrEmpty(Env.getTatumApiUrl()) ? TATUM_API_URL + "/v3/xlm/info" : Env.getTatumApiUrl();
        String info = Async.get(uri, Env.getTatumApiKey());
        // TO-DO
        return info;
    }

    /**
     * For more details, see <a href="https://tatum.io/apidoc#operation/XlmGetFee" target="_blank">Tatum API documentation</a>
     */
    public String xlmGetFee() throws IOException, ExecutionException, InterruptedException {
        String uri = Strings.isNullOrEmpty(Env.getTatumApiUrl()) ? TATUM_API_URL + "/v3/xlm/fee" : Env.getTatumApiUrl();
        String fee = Async.get(uri, Env.getTatumApiKey());
        // TO-DO
        return fee;
    }

    /**
     * For more details, see <a href="https://tatum.io/apidoc#operation/XlmGetLedger" target="_blank">Tatum API documentation</a>
     */
    public String xlmGetLedger(BigDecimal i) throws IOException, ExecutionException, InterruptedException {
        String uri = Strings.isNullOrEmpty(Env.getTatumApiUrl()) ? TATUM_API_URL + "/v3/xlm/ledger/" + i : Env.getTatumApiUrl();
        String ledger = Async.get(uri, Env.getTatumApiKey());
        // TO-DO
        return ledger;
    }

    /**
     * For more details, see <a href="https://tatum.io/apidoc#operation/XlmGetLedgerTx" target="_blank">Tatum API documentation</a>
     */
    public String xlmGetLedgerTx(BigDecimal i) throws IOException, ExecutionException, InterruptedException {
        String uri = Strings.isNullOrEmpty(Env.getTatumApiUrl()) ? TATUM_API_URL + "/v3/xlm/ledger/" + i + "/transaction" : Env.getTatumApiUrl();
        String tx = Async.get(uri, Env.getTatumApiKey());
        // TO-DO
        return tx;
    }

    /**
     * For more details, see <a href="https://tatum.io/apidoc#operation/XlmGetTransaction" target="_blank">Tatum API documentation</a>
     */
    public String xlmGetTransaction(String hash) throws IOException, ExecutionException, InterruptedException {
        String uri = Strings.isNullOrEmpty(Env.getTatumApiUrl()) ? TATUM_API_URL + "/v3/xlm/transaction/" + hash : Env.getTatumApiUrl();
        String tx = Async.get(uri, Env.getTatumApiKey());
        // TO-DO
        return tx;
    }

    /**
     * For more details, see <a href="https://tatum.io/apidoc#operation/XlmGetAccountTx" target="_blank">Tatum API documentation</a>
     */
    public String xlmGetAccountTransactions(String address) throws IOException, ExecutionException, InterruptedException {
        String uri = Strings.isNullOrEmpty(Env.getTatumApiUrl()) ? TATUM_API_URL + "/v3/xlm/account/tx/" + address : Env.getTatumApiUrl();
        String tx = Async.get(uri, Env.getTatumApiKey());
        // TO-DO
        return tx;
    }
}
