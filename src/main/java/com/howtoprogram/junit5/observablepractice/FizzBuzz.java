package com.howtoprogram.junit5.observablepractice;

import io.reactivex.Flowable;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        System.out.println(fizzBuzz.fizzBuyzz(15,4));
    }
    public ArrayList<String> fizzBuyzz(int numInicio, int numFinal){
        ArrayList<String> listaFizzBuzz = new ArrayList<>();
         if (numInicio < numFinal) {
             Flowable.range(numInicio, numFinal).map(
                     i -> i % 3 == 0 ?
                             (i % 5 == 0 ? "FizzBuzz" : "Fizz") :
                             (i % 5 == 0 ? "Buzz" : i)).toList().subscribe(x -> {
                 listaFizzBuzz.addAll((ArrayList) x);

             });
             return listaFizzBuzz;
         }
             listaFizzBuzz.add("error");
             return listaFizzBuzz;


    }

}
