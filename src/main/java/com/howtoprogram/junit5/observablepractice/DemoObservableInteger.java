package com.howtoprogram.junit5.observablepractice;

import io.reactivex.Flowable;
import io.reactivex.functions.Consumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DemoObservableInteger {

    public static Integer[] GreatherTanTen(Integer[] arrNumbers) {
        List <Integer> integerList = new ArrayList<>();
         Flowable.fromArray(arrNumbers)
                 .filter(x -> x > 10).toList()
                 .subscribe((Consumer<List<Integer>>) integerList::addAll);
    return integerList.toArray(new Integer[0]);
    }

    public static Integer[] DuplicateNumbers(Integer[] arrNumbers) {
        List<Integer> resultList = new ArrayList<>();
        Flowable.fromArray(arrNumbers)
                .map(x -> x * 2)
                .toList()
                .subscribe((Consumer<List<Integer>>) resultList::addAll);
        return resultList.stream().toArray(Integer[]::new);
    }


}
