package com.doxpl;

import java.util.Random;

public final class Generator {
    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static Person generatePerson() {
        Person retVal = new Person();
        Random random = new Random();
        retVal.id = random.nextInt();
        retVal.name = getRandomName(20, random);
        retVal.surname = getRandomName(25, random);
        retVal.city = getRandomName(15, random);
        retVal.isMember = random.nextBoolean();
        return retVal;
    }

    public static String getRandomName(int length, Random random) {
        String retVal = "";

        for (int i = 0; i < length; i++) {
            retVal += ALPHABET.charAt(random.nextInt(ALPHABET.length()));
        }

        return retVal;
    }
}
