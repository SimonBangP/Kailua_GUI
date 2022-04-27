package com.example.kailua_gui.Service;

import com.example.kailua_gui.Model.Feedback;
import com.example.kailua_gui.Repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedbackService {

    @Autowired
    FeedbackRepository repository;

    public void createFeedback(Feedback feedback) {
        repository.CreateNewFeedback(feedback);
    }

}
