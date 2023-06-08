package com.ohgiraffers.calctestmvc.calcModel;

public class CalcDivide {
    public int divideTwoNumber(int num1, int num2){
        CheckZero(num2); //0 체크

        return num1/num2; //연산
    }

    private static void CheckZero(int num2){//0 체크
        if (num2 == 0) {
            throw new IllegalArgumentException("0으로 나눌수 없습니다.");
        }
    }
}

