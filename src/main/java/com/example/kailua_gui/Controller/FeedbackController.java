package com.example.kailua_gui.Controller;

import com.example.kailua_gui.Model.Feedback;
import com.example.kailua_gui.Service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class FeedbackController {

    @Autowired
    FeedbackService service;

    @GetMapping("/feedback")
    public String getFeedback() {
        return "feedback";
    }

    @PostMapping("/feedback/create")
    public ResponseEntity<Feedback> createFeedback(@RequestBody String message) {
        Feedback feedback = new Feedback(message);
        service.createFeedback(feedback);

        return new ResponseEntity<>(feedback, HttpStatus.CREATED);
    }
}
