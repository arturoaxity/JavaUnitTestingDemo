package com.howtoprogram.junit5.observablepractice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class DemoObservableIntegerTest {
    Integer[] arrNumbers = {1, 5, 10, 20};
    Integer[] arrDuplicateEmpyTest = {};
    @Test
    @DisplayName("Numeros mayores de 10")
    void shouldGreatherTanTen() {
        Integer[] listExpect = {20};
        Integer[] result = DemoObservableInteger.GreatherTanTen(arrNumbers);
        assertArrayEquals(listExpect, result);
    }

    @Test
    @DisplayName("Numeros Duplicados")
    void shouldDuplicate() {
        Integer[] arrDuplicate = {2, 10, 20, 40};
        Integer[] result = DemoObservableInteger.DuplicateNumbers(arrNumbers);
        assertArrayEquals(arrDuplicate, result);
    }
    @Test
    @DisplayName("array vacion numeros")
    void shouldValidateEmpyArrayDuplicate() {
        Integer[] arrDuplicateEmpy = {};
        Integer[] result = DemoObservableInteger.DuplicateNumbers(arrDuplicateEmpy);
        assertArrayEquals(arrDuplicateEmpyTest, result);
    }


    @Test
    @DisplayName("array vacio numero mayor")
    void shouldValidateEmpyArrayGreatherTanTen() {
        Integer[] arrDuplicateEmpy = {};
        Integer [] result = DemoObservableInteger.GreatherTanTen(arrDuplicateEmpyTest);
        assertArrayEquals(arrDuplicateEmpy, result);
    }
}
