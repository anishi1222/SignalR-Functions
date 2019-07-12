package com.climateinfo.client;

import com.climateinfo.ClimateInfo;
import com.microsoft.signalr.HubConnection;
import com.microsoft.signalr.HubConnectionBuilder;

public class App {
//    static final String apiBaseUrl = "http://localhost:7071/api/";
    static final String apiBaseUrl = "<Endpoint of function app>/api/";
    static HubConnection connection;

    public static void main(String... args) {
        connection = HubConnectionBuilder.create(apiBaseUrl).build();

        connection.setServerTimeout(3600000);
        connection.start().blockingAwait();
        System.out.println("started: " + connection.getConnectionState().toString());

        connection.on("climates", (message) -> {
            System.out.println("[climates] device: " + message.getDevice() + " timestamp: " + message.getTimestamp() + " humid: " + message.getHumid() + " temp: " + message.getTemp());
        }, ClimateInfo.class);
    }
}
