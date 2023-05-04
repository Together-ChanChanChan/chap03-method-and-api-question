package com.ohgiraffers.level01.basic;


public class Application {
    public static void main(String args[]){
        Calculator calc = new Calculator();     //클래스 가져와 객체화한다.

        calc.checkMethod();
        calc.sum1to10();
        calc.checkMaxNumber(10,20);
        calc.sumTwoNumber(10,20);
        calc.minusTwoNumber(10,5);
    }
}
