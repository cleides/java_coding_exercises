package com.techreturners.exercise003;

public class Exercise003 {

    String[] iceCreams = {"Pistachio", "Raspberry Ripple", "Vanilla", "Mint Chocolate Chip", "Chocolate", "Mango Sorbet"};

    int getIceCreamCode(String iceCreamFlavour) {

        for (int i = 0; i < iceCreams.length; i++) {
            if (iceCreamFlavour.equals(iceCreams[i])) {
                return i;
            }
        }
        return -1;
    }

    String[] iceCreamFlavours() {
        return iceCreams;
    }

}

