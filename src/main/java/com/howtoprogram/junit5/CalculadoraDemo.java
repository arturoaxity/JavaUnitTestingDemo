package com.howtoprogram.junit5;

public class CalculadoraDemo {

    public int suma(int num1,int num2){
        return (num1 + num2);
    }
    public int resta(int num1,int num2){
        return (num1 - num2);
    }
    public int multiplicacion(int num1,int num2){
        return (num1 * num2);
    }
    public int divicion(int num1,int num2){

        return num2 != 0 ? (num1/num2): 0;

    }
}
