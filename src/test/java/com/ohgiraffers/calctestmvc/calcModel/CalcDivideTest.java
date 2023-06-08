package com.ohgiraffers.calctestmvc.calcModel;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalcDivideTest {
    private CalcDivide calcDivide;
    private Exception e;
    @BeforeEach
    public void setUp(){
        this.calcDivide=new CalcDivide();
        this.e=new Exception();
    }
    // 검증내용
    // 1. 나눌 수 가 0이 되면 IllegalArgumentException을 발생함 (0으로 나눌수 없습니다)
    // 2. 100/20 = 5
    // 3. 44/3 = 14

    @DisplayName("나눌 수 가 0이 되면 IllegalArgumentException을 발생함 (0으로 나눌수 없습니다)")
    @Test
    public void testZeroArgument(){

        //given
        int num1=10;
        int num2=0;

        //when
        e=Assertions.assertThrows(
                IllegalArgumentException.class,
                () ->calcDivide.divideTwoNumber(num1,num2)
        );
        System.out.println(e);
        //then
    }
    @DisplayName("100/20 = 5")
    @Test
    public void testDivideOneArgument(){

        //given
        int num1=100;
        int num2=20;

        //when
        int result=calcDivide.divideTwoNumber(num1,num2);
        //then
        Assertions.assertEquals(5,result);
    }
    @DisplayName("44/3 = 14")
    @Test
    public void testDivideTwoArgument(){

        //given
        int num1=44;
        int num2=3;

        //when
        int result=calcDivide.divideTwoNumber(num1,num2);
        //then
        Assertions.assertEquals(14,result);
    }
}
