package org.turntabl.javaone.introduction;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class OtherLab {

    static BiFunction<List<String>,List<String>, List<String>> zip = (firstList, secondList)
            ->
    {
        List<String> times = new ArrayList<>();
        times.addAll(firstList);
        times.addAll(secondList);
        return times;
    };

    public static void main(String[] args) {


        Collection apply = zip.apply(List.of("1", "2", "3"), List.of("4", "5","6"));
        System.out.println(apply);

 /*       int add = operateOnMe("add", 4, 5);
        System.out.println(add);

        int subtract = operateOnMe("sub", 20,10);
        System.out.println(subtract);
        int pow = operateOnMe("pow", 2,3);
        System.out.println(pow);*/

    }


    static int operateOnMe(String operation, int first, int second){
        if (operation.equals("add")){
            BiFunction<Integer,Integer,Integer> add = (a,b) -> a+b ;
            return add.apply(first,second);
        }else if (operation.equals("sub")){
            BiFunction<Integer,Integer,Integer> subtract = (a,b) -> a-b ;
            return subtract.apply(first,second);
        }else if(operation.equals("pow")) {
            return (int) Math.pow(first,second);
        }else{
            System.out.println("Enter either add, sub or pow");
            return 0;
        }
    }

}
