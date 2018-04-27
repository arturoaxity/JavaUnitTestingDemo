package com.howtoprogram.junit5.observablepractice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class DemoObservablesTest {
    int[] arrNumbers = {1, 5, 10, 20};
    int[] arrDuplicateEmpyTest = {};
    @Test
    @DisplayName("Numeros mayores de 10")
    void shouldGreatherTanTen() {
        int[] listExpect = {20};
        int[] result = DemoObservables.GreatherTanTen(arrNumbers);
        assertArrayEquals(listExpect, result);
    }

    @Test
    @DisplayName("Numeros Duplicados")
    void shouldDuplicate() {
        int[] arrDuplicate = {2, 10, 20, 40};
        int[] result = DemoObservables.DuplicateNumbers(arrNumbers);
        assertArrayEquals(arrDuplicate, result);
    }
    @Test
    @DisplayName("array vacion numeros")
    void shouldValidateEmpyArrayDuplicate() {
        int[] arrDuplicateEmpy = {};
        int[] result = DemoObservables.DuplicateNumbers(arrDuplicateEmpy);
        assertArrayEquals(arrDuplicateEmpyTest, result);
    }


    @Test
    @DisplayName("array vacio numero mayor")
    void shouldValidateEmpyArrayGreatherTanTen() {
        int[] arrDuplicateEmpy = {};
        int [] result = DemoObservables.GreatherTanTen(arrDuplicateEmpyTest);
        assertArrayEquals(arrDuplicateEmpy, result);
    }
}
