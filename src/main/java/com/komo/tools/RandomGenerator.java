package com.komo.tools;

import java.util.Random;

public class RandomGenerator {

    private static final String alphabet = "abcdefhijklmnopqrstuvwxyzABCDEFHIJKLMNOPQRSTUVWXYZ1234567890";

    public String generateRandomString(int numOfCharacters) {

        if(numOfCharacters < 1) {
            throw new IllegalArgumentException("invalid input");
        }

        StringBuilder randomString = new StringBuilder();
        for(int i = 0; i < numOfCharacters; i++) {
            int index = new Random().nextInt(alphabet.length());
            randomString.append(alphabet.indexOf(index));
        }

        return randomString.toString();
    }

}
