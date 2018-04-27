package com.howtoprogram.junit5;

import com.howtoprogram.junit5.observablepractice.FizzBuzz;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {

    @Test
    void FizzBuzzTest(){
        ArrayList<String> lista = new ArrayList<>(Arrays.asList("1","2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"));
        FizzBuzz  buzzTest = new FizzBuzz();
        assertEquals(buzzTest.fizzBuyzz(1,15).toString(),lista.toString());
    }
    @Test
    void NumeroMayor(){
        FizzBuzz  bizz = new FizzBuzz();
        ArrayList<String> expect= new ArrayList<>(Arrays.asList("error"));
        assertEquals(expect.toString() , bizz.fizzBuyzz(15,4).toString());
    }
}
