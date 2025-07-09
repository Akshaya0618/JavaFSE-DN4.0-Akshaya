package com.example;

public class MyService {
    private ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public void fetchData() {
        api.getData();  // This interaction will be verified in the test
    }
}
