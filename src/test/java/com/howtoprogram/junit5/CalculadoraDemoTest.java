package com.howtoprogram.junit5;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class CalculadoraDemoTest {
    private  CalculadoraDemo calculadoraDemo;
    private static CalculadoraDemo calculadoraDemo1;
    private int num1 = 0;
    private int num2 = 5;
    @BeforeAll
    static void setUpAll() {
        calculadoraDemo1 =  mock(CalculadoraDemo.class);
        when(calculadoraDemo1.divicion(10,5)).thenReturn(100);
        when(calculadoraDemo1.multiplicacion(6,10)).thenReturn(200);
        when(calculadoraDemo1.resta(10,5)).thenReturn(30);
        when(calculadoraDemo1.suma(20,20)).thenReturn(80);
        assertEquals(100,calculadoraDemo1.divicion(10,5),"Divicion Mockito");
        assertEquals(200,calculadoraDemo1.multiplicacion(6,10),"Multiplicacion Mockito");
        assertEquals(30,calculadoraDemo1.resta(10,5),"Resta Mockito");
        assertEquals(80,calculadoraDemo1.suma(20,20),"suma Mockito");
    }

    @BeforeEach
    void setUp() {
        System.out.println("BeforeEach");
    }

    @AfterEach
    void tearDown() {
        System.out.println("AfterEach");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("AfterAll");
    }

    @Test
    void sumaTest() {
        calculadoraDemo = new CalculadoraDemo();
        assertEquals(5, calculadoraDemo.suma(this.num1, this.num2));
        System.out.println("Operacion de Suma");
    }

    @Test
    void restaTest() {
        calculadoraDemo = new CalculadoraDemo();
        assertEquals(-5, calculadoraDemo.resta(this.num1, this.num2));
        System.out.println("Operacion de Resta");
    }

    @Test
    void multiplicacionTest() {
        calculadoraDemo = new CalculadoraDemo();
        assertEquals(0, calculadoraDemo.multiplicacion(this.num1, this.num2));
        System.out.println("Operacion de Multiplicacion");
    }

    @Test
    void divicionTest() {
        calculadoraDemo = new CalculadoraDemo();
        assertEquals(0, calculadoraDemo.divicion(this.num1, this.num2));
        System.out.println("Operacion de Divicion");
    }


}
