package com.example.kailua_gui.Repository;

import com.example.kailua_gui.Model.Feedback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class FeedbackRepository {

    @Autowired
    JdbcTemplate template;

    public void CreateNewFeedback(Feedback feedback) {
        String sql = "INSERT INTO feedback (SubmitDate, Message) VALUES(?, ?)";
        template.update(sql, feedback.getSubmitDate(), feedback.getMessage());
    }
}
