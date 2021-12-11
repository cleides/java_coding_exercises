package com.techreturners.exercise003;

public class Exercise003 {

    int getIceCreamCode(String iceCreamFlavour) {
        String[] icecreams = {"Pistachio", "Raspberry Ripple", "Vanilla", "Mint Chocolate Chip", "Chocolate", "Mango Sorbet" };
        for (int i = 0; i < icecreams.length; i++) {
            if(iceCreamFlavour.equals(icecreams[i])) {
                return i;
            }
        }
        return -1;
    }

    String[] iceCreamFlavours() {
        throw new UnsupportedOperationException(("You can delete this statement and add your code here."));
    }

}

