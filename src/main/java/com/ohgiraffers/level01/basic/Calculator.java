package com.ohgiraffers.level01.basic;

public class Calculator {
    public void checkMethod(){
        System.out.println("메소드 호출 확인");
    }

    public int sum1to10(){
        int sum = 0;

        for(int i = 1; i <= 10; i++){
            sum += i;
        }
        return sum;
    }

}
