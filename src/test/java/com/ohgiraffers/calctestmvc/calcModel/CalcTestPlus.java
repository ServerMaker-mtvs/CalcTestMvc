package com.ohgiraffers.calctestmvc.calcModel;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalcTestPlus {
    private CalcPlus calcPlus;
    @BeforeEach
    public void setUp() {
        this.calcPlus = new CalcPlus();
    }


    @DisplayName("두수의 합이 30이 되는지")
    @Test
    public void testSumTwoNumbers(){
        //given
        int num1=10;
        int num2=20;
        //when
        int result=calcPlus.plusTwoNum(num1,num2);
        //then
        Assertions.assertEquals(30,result);
    }

    @DisplayName("두수의 합이 -9가 되는지")
    @Test
    public void testSumMinusTwoNumbers(){
        //given
        int num1=-4;
        int num2=-5;
        //when
        int result=calcPlus.plusTwoNum(num1,num2);
        //then
        Assertions.assertEquals(-9,result);
    }

    @DisplayName("두수의 합이 -1가 되는지")
    @Test
    public void testSumAllTwoNumbers(){
        //given
        int num1=4;
        int num2=-5;
        //when
        int result=calcPlus.plusTwoNum(num1,num2);
        //then
        Assertions.assertEquals(-1,result);
    }
}
