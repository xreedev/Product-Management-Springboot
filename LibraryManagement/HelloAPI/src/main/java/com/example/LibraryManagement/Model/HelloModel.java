package com.example.LibraryManagement.Model;

public class HelloModel {
    private String status;
    private String data;
    private String message;

    public String getStatus() {
        return status;
    }

    public HelloModel(String status, String data, String message) {
        this.status = status;
        this.data = data;
        this.message = message;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
