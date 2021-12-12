package com.techreturners.exercise005;

public class Exercise005 {
    char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    public boolean isPangram(String inputToBeChecked) {

        inputToBeChecked = inputToBeChecked.toLowerCase();

        for (int i = 0; i < inputToBeChecked.length(); i++) {
            char character = inputToBeChecked.charAt(i);
            searchLettersAndBlankLetterIfFound(character);
        }

        boolean result = areLettersAllSpaces();
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] != ' ') {
                return 0;
            }
        }


    }

    private boolean areLettersAllSpaces() {

        return true;
    }

    private void searchLettersAndBlankLetterIfFound(char character) {

        for (int i = 0; i < letters.length; i++) {
            if (character == (letters[i])) {
                letters[i] = ' ';
            }
        }
    }
}
