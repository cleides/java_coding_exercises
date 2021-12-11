package com.techreturners.exercise004;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Exercise004 {
    private LocalDateTime dateTimePlusABillionSeconds;
    private final long GIGA_SECONDS = 1_000_000_000L;
    public Exercise004(LocalDate date) {
        dateTimePlusABillionSeconds = LocalDateTime.of(date, LocalTime.MIDNIGHT);
        dateTimePlusABillionSeconds = dateTimePlusABillionSeconds.plusSeconds(GIGA_SECONDS);
    }

    public Exercise004(LocalDateTime dateTime) {
        dateTimePlusABillionSeconds = dateTime.plusSeconds(GIGA_SECONDS);
    }

    public LocalDateTime getDateTime() {
        return dateTimePlusABillionSeconds;
    }
}
