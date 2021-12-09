package com.techreturners.exercise002;

import javax.swing.*;

public class Exercise002 {

    public boolean isFromManchester(Person person) {

        if (person.city.equals("Manchester")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean canWatchFilm(Person person, int ageLimit) {
        if (person.age >= 18) {
            return true;
        } else {
            return false;
        }
    }
}
