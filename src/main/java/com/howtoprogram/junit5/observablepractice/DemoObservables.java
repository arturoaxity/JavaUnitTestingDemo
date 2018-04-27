package com.howtoprogram.junit5.observablepractice;


import io.reactivex.Flowable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoObservables {

    public static int[] DuplicateNumbers(int[] arrDuplicateEmpy) {
        Integer[] arrIntNumbers = Arrays.stream(arrDuplicateEmpy).boxed().toArray(Integer[]::new);
        List<Integer> resultList = new ArrayList<>();
        Flowable.fromArray(arrIntNumbers)
                .map(x -> x * 2)
                .toList()
                .subscribe(x -> {
                    resultList.addAll(x);
                });
        return resultList.stream().mapToInt(x -> x).toArray();


    }

    public static int[] GreatherTanTen(int[] arrDuplicateEmpyTest) {
        Integer[] arrIntNumbers = Arrays.stream(arrDuplicateEmpyTest).boxed().toArray(Integer[]::new);
        List<Integer> resultList = new ArrayList<>();
        Flowable.fromArray(arrIntNumbers)
                .filter(x -> x > 10).toList().subscribe(x -> {
            resultList.addAll(x);
        });
        return resultList.stream().mapToInt(x -> x).toArray();
    }
}
