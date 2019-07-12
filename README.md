# SignalR-Functions

Sources in this repository are used for checking features of Azure SignalR Service.

## Components used in this sample

- Functions
- Cosmos DB
- SignalR Service

## Remarks

- Fornat of injected data to Cosmos DB is as follows.

  ```json
    {
      "device": "dev001",
      "humid": 33.2,
      "temp": 22.5,
      "timestamp": "2019-07-11T12:00:20+09:00"
    }
  ```

- Description is posted to https://logico-jp.io/2019/07/12/try-azure-signalr-service/ (Japanese only).
