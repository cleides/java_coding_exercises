package com.techreturners.exercise001;

import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {
        String result = word.substring(0, 1).toUpperCase() + word.substring(1);
        return result;
    }

    public String generateInitials(String firstName, String lastName) {
        String firstNameInit = firstName.substring(0, 1);
        String lastNameInit = lastName.substring(0, 1);
        return firstNameInit + "." + lastNameInit;
    }

    public double addVat(double originalPrice, double vatRate) {
        double result = (originalPrice + (originalPrice * vatRate / 100.0d));
        //round to 2 decimal places
        result = (double) Math.round(result * 100.0d) / 100.0d;
        return result;
    }

    public String reverse(String sentence) {
        String sentenceReversed = new StringBuilder(sentence).reverse().toString();
        return sentenceReversed;
    }

    public int countLinuxUsers(List<User> users) {
        int count = 0;
        //I had used the for loop but IntelliJ suggested this improvement.
        for (User u : users) {
            String osType = u.getType();
            if (osType.equals("Linux")) {
                count++;
            }
        }
        return count;
    }
}
