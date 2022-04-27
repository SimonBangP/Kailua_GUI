package com.example.kailua_gui.Model;

import java.sql.Timestamp;
import java.time.Instant;

public class Feedback {

    private Timestamp submitDate;
    private String message;

    public Feedback(String message) {
        this.message = message;
        submitDate = Timestamp.from(Instant.now());
    }

    public Timestamp getSubmitDate() {
        return submitDate;
    }

    public void setSubmitDate(Timestamp submitDate) {
        this.submitDate = submitDate;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
