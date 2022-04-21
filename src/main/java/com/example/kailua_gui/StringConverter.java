package com.example.kailua_gui;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StringConverter {

    public static Date toDate(String value, String format) {

        return Date.valueOf(LocalDate.parse(value, DateTimeFormatter.ofPattern(format)));

    }

    public static Date toDateFromDMRDate(String value) {
        String datePart = value.split("T")[0];
        return toDate(datePart, "yyyy-MM-dd");
    }

    public static Timestamp dateToTimestamp(Date value) {

        return new Timestamp(value.getTime());

    }
}
