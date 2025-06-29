package com.example;
public class MyService {
    private ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public String fetchData() {
        return api.getData();
    }

    public int addNumbers(int a, int b) {
        return api.add(a, b);
    }

    public void logMessage(String msg) {
        api.log(msg);
    }
}
