package org.turntabl.javaone.introduction;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SomeClass {
    int[] numbers;
    public SomeClass() {
        numbers = new Random()
                .ints(1, 50)
                .distinct()

                .toArray();
    }

    public static void main(String[] args) {
//        System.out.println(Arrays.toString(new SomeClass().numbers));
//        int[] ints = new Random()
//                .ints(1, 50)
//                .map(operand -> operand * 5)
//                .limit(10)
//                .toArray();

        List<Integer> integers = List.of(1, 2,3,4,5,6,7,8,9);
        System.out.println("========================");
        System.out.println("ORIGINAL");
        System.out.println("========================");

        System.out.println("========================");
        System.out.println("MUTATED");
        System.out.println("========================");
        integers.stream()
                .map(integer -> integer * 5)
                .filter(integer -> integer % 2 == 0)
                .map(integer -> integer * 31)
                .filter(integer -> integer % 5 == 0)
                .forEach(integer -> System.out.println(integer));



//        System.out.println(Arrays.asList(ints));

    }

}
