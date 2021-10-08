package org.turntabl.javaone.introduction;

import java.util.function.*;

public class Labs1 {

    public static void main(String[] args) {
        System.out.println("===========================");
        System.out.println("From Regular Function");
        System.out.println("===========================");
        int somefunction = somefunction(15);
        System.out.println(somefunction);
        System.out.println(somefunction2(100,200));
        consumeIt("Matilda");
        consumeItDouble("Bintu", "Ransford");

        System.out.println("===========================");
        System.out.println("From Declearative Function");
        System.out.println("===========================");
        Integer someFunctionOneVar = someFunctionOne.apply(15);
        System.out.println(someFunctionOneVar);
        System.out.println(someFuntionTwo.apply(100,200));
        consumeIt2.accept("Matin");
        biConsumer2.accept("Ransford", "Osborn");
        System.out.println(supplyMe.get());
    }


    static Function<Integer,Integer> someFunctionOne = a ->  a*a ;

    static BiFunction<Integer,Integer,Integer> someFuntionTwo = (a,b) -> a*b;


    //Represents a function that accepts one argument and produces a result.

    static int somefunction(int a){
        return a*a;
    }
    static int somefunction2(int a, int b){
        return a*b;
    }

    static void consumeIt(String name){
        System.out.println("From regular " + name);
    }

    static Consumer<String> consumeIt2 = name -> System.out.println("From functional : " + name);

    static BiConsumer<String, String> biConsumer2 = (a,b) -> System.out.println("Matilda says : " + a + " " + b);

    static void consumeItDouble(String nameOne, String nameTwo){
        System.out.println("Matin Says :" + nameOne + " === " + nameTwo);
    }

    static Supplier<String> supplyMe = () -> "Hi there";

    static String supplySomething(){
        return "Hi there";
    }
}
