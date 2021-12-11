package com.techreturners.exercise002;

import javax.swing.*;

public class Exercise002 {

    public boolean isFromManchester(Person person) {
        return person.city.equals("Manchester");
    }

    public boolean canWatchFilm(Person person, int ageLimit) {
        return person.age >= ageLimit;
    }
}
