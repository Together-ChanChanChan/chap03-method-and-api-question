package com.ohgiraffers.level02.normal;

public class Application {
    public static void main(String[] args) {
        RandomMaker rm = new RandomMaker();

        System.out.println(rm.randomNumber(4,100));
        System.out.println(rm.randomUpperAlpabet(5));
        System.out.println(rm.rockPaperScissors());
        System.out.println(rm.tossCoin());
    }
}
