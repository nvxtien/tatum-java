package io.tatum.blockchain;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Strings;
import io.tatum.model.request.EstimateGasVet;
import io.tatum.model.response.common.TransactionHash;
import io.tatum.model.response.vet.VetEstimateGas;
import io.tatum.utils.Async;
import io.tatum.utils.Env;

import java.io.IOException;
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
        // await validateOrReject(body);
        String uri = Strings.isNullOrEmpty(Env.getTatumApiKey()) ? TATUM_API_URL + "/v3/vet/broadcast/transaction/gas" : Env.getTatumApiKey();
        var objectMapper = new ObjectMapper();
        String requestBody = objectMapper.writeValueAsString(body);
        String estimatedGas = Async.post(uri, Env.getTatumApiKey(), requestBody);
        // TO-DO
        return new VetEstimateGas();
    }

    ;
    /*
     *//**
     * For more details, see <a href="https://tatum.io/apidoc#operation/VetGetCurrentBlock" target="_blank">Tatum API documentation</a>
     *//*
    export const vetGetCurrentBlock = async (): Promise<number> => {
        return (await axios.get(`${process.env.TATUM_API_URL || TATUM_API_URL}/v3/vet/current`, {headers: {'x-api-key': process.env.TATUM_API_KEY}})).data;
    };

*//**
     * For more details, see <a href="https://tatum.io/apidoc#operation/VetGetBlock" target="_blank">Tatum API documentation</a>
     *//*
    export const vetGetBlock = async (hash: string): Promise<VetBlock> => {
        return (await axios.get(`${process.env.TATUM_API_URL || TATUM_API_URL}/v3/vet/block/${hash}`, {headers: {'x-api-key': process.env.TATUM_API_KEY}})).data;
    };

*//**
     * For more details, see <a href="https://tatum.io/apidoc#operation/VetGetBalance" target="_blank">Tatum API documentation</a>
     *//*
    export const vetGetAccountBalance = async (address: string): Promise<number> => {
        return (await axios.get(`${process.env.TATUM_API_URL || TATUM_API_URL}/v3/vet/account/balance/${address}`, {headers: {'x-api-key': process.env.TATUM_API_KEY}})).data;
    };

*//**
     * For more details, see <a href="https://tatum.io/apidoc#operation/VetGetEnergy" target="_blank">Tatum API documentation</a>
     *//*
    export const vetGetAccountEnergy = async (address: string): Promise<number> => {
        return (await axios.get(`${process.env.TATUM_API_URL || TATUM_API_URL}/v3/vet/account/energy/${address}`, {headers: {'x-api-key': process.env.TATUM_API_KEY}})).data;
    };

*//**
     * For more details, see <a href="https://tatum.io/apidoc#operation/VetGetTransaction" target="_blank">Tatum API documentation</a>
     *//*
    export const vetGetTransaction = async (hash: string): Promise<VetTx> => {
        return (await axios.get(`${process.env.TATUM_API_URL || TATUM_API_URL}/v3/vet/transaction/${hash}`, {headers: {'x-api-key': process.env.TATUM_API_KEY}})).data;
    };

*//**
     * For more details, see <a href="https://tatum.io/apidoc#operation/VetGetTransactionReceipt" target="_blank">Tatum API documentation</a>
     *//*
    export const vetGetTransactionReceipt = async (hash: string): Promise<VetTxReceipt> => {
        return (await axios.get(`${process.env.TATUM_API_URL || TATUM_API_URL}/v3/vet/transaction/${hash}/receipt`, {headers: {'x-api-key': process.env.TATUM_API_KEY}})).data;
    };*/
}
