package com.howtoprogram.junit5;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicDemoTest {
  private BasicDemo basicDemo;

  @BeforeAll
  static void setUpAll(){
    System.out.println("BeforeAll");
  }

  @BeforeEach
  void setUp(){
    System.out.println("BeforeEach");
    }
  @AfterEach
  void tearDown(){
    System.out.println("AfterEach");
  }
  @AfterAll
  static void tearDownAll(){
    System.out.println("AfterAll");
  }

  @Test
  @DisplayName("Test demo")
  void testBasicSalaryWithValidSalary() {
    System.out.println("prueba demo");
    basicDemo = new BasicDemo();
    String expectedDemo = "Prueba";
    basicDemo.setDemoString(expectedDemo);
    assertEquals(expectedDemo, basicDemo.getDemoString());

    }
@Test
  void simpleTest(){
  System.out.println("simpleTest");
  assertEquals(true,true);

}
}
