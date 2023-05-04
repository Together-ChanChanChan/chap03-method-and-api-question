package com.ohgiraffers.level02.normal;

public class RandomMaker {
    public int randomNumber(int min, int max){
        return (int)(Math.random() * (max-min) + 1) + min;
    }

    public String randomUpperAlpabet(int length){
        String result = "";

        length = 10;

        for(int i = 0; i < length; i++) {
            int c = (int)(Math.random() * 26) + 65;
            result += (char)c;
        }
        return result;
    }
}
