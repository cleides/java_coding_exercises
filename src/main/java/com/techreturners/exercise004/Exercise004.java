package com.techreturners.exercise004;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Exercise004 {
    LocalDateTime t;

    public Exercise004(LocalDate date) {
        t = LocalDateTime.of(date, LocalTime.MIDNIGHT);
        t = t.plusSeconds(1_000_000_000L);
    }

    public Exercise004(LocalDateTime dateTime) {
      //dateTime =
    }

    public LocalDateTime getDateTime() {
        return t;
    }
}
