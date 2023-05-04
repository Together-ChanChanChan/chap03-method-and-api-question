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

    public String rockPaperScissors() {
        String[] arr = {"가위", "바위", "보"};
        return arr[(int) (Math.random() * 3)];
    }

    public String tossCoin() {
        String[] arr = {"앞면", "뒷면"};
        return arr[(int)(Math.random() * 2)];
    }
}
