package com.ohgiraffers.calctestmvc.calcModel;

public class CalModulo {
    public int calculateModulo(int num1, int num2) {
        checkZero(num2);

        return num1 % num2;
    }

    private void checkZero(int num) {
        if (num == 0) {
            throw new IllegalArgumentException("0으로 나눌 수 없습니다.");
        }
    }
}
