package com.ohgiraffers.calctestmvc.calcModel;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalcMinusTest {

    private CalcMinus calcMinus;

    @BeforeEach
    public void setUp() {this.calcMinus = new CalcMinus();}

    @DisplayName("30과 20을 넣었을 때 10이라는 결과가 나오는 지 확인")
    @Test
    public void testMinusTwoNumbers() {
        int num1 = 30;
        int num2 = 20;

        int result = calcMinus.minusTwoNumbers(num1, num2);

        Assertions.assertEquals(10, result);
    }

    @DisplayName("50과 -30을 넣었을 때 80이라는 결과가 나오는 지 확인")
    @Test
    public void testMinusTwoNumbers2() {
        int num1 = 50;
        int num2 = -30;

        int result2 = calcMinus.minusTwoNumbers(num1, num2);

        Assertions.assertEquals(80, result2);
    }
}
