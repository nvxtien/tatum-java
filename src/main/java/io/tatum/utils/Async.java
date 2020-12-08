package io.tatum.utils;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.concurrent.ExecutionException;

public class Async {

    public static String post(String uri, String apiKey, String requestBody) throws ExecutionException, InterruptedException {
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

    public static String get(String uri, String apiKey) throws ExecutionException, InterruptedException {
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
