package com.ohgiraffers.calctestmvc.calcModel;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class CalModuloTest {
    private CalModulo calModulo;

    // 검증 내용
    // 1. 10에서 0을 나누면 IllegalArgumentException 이 발생하는지 확인
    // 2. 37에서 4를 나누면 나머지가 1이 나오는지 확인
    // 3. 2039283223에서 33을 나누면 10이 나오는지 확인

    @BeforeEach
    public void setUp() {
        System.out.println("Modulo Test SetUp");
        this.calModulo = new CalModulo();
    }

    @Test
    public void zeroArgument() {
        // given
        int num1 = 10;
        int num2 = 0;

        // when, then
        Assertions.assertThrows(IllegalArgumentException.class, () -> calModulo.calculateModulo(num1, num2));
    }

    @Test
    public void normalArgument() {
        // given
        int num1 = 37;
        int num2 = 4;

        // when
        int result = calModulo.calculateModulo(num1, num2);

        // then
        Assertions.assertEquals(1, result);
    }

    public void bigNormalArgument() {
        // given
        int num1 = 2039283223;
        int num2 = 33;

        // when
        int result = calModulo.calculateModulo(num1, num2);

        // then
        Assertions.assertEquals(10, result);
    }
}
