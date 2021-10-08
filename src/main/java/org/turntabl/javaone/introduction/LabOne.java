package org.turntabl.javaone.introduction;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class LabOne {

    public static void main(String[] args) {

        // Using Math Random
        double rand = Math.random();
        System.out.println(""+rand);

        // Using Math Random for number from 1 to 10
        double n = (int)(Math.random()*10)+1;
        System.out.println(""+n);

        // Using Thread Local
        long count = ThreadLocalRandom.current().doubles(100).count();
        System.out.println(count);

        // Using Java Util TRandom
        Random random = new Random();
//        System.out.println(random.nextInt());

        // 2
        int i = random.nextInt(0, 101);
        System.out.println(i);

        System.out.println("==================================================");
        System.out.println("Generate a random integer in the range 0 to 100, and print a message to say whether it is odd or even");
        System.out.println("==================================================");

        //Generate a random integer in the range 0 to 100, and print a message to say whether it is odd or even.
        String output = i%2 == 0 ? "Even" : "Odd";
        System.out.println(output);

        if (i == 0) {
            System.out.println("frozen");
        }else if (i > 0 && i <= 14){
            System.out.println("cold");
        }else if(i > 14 && i <= 24 ){
            System.out.println("cool");
        }else if(i>24 && i <= 40){
            System.out.println("warm");
        }else if (i > 40 && i <= 60 ){
            System.out.println("hot");
        }else if(i > 60 && i <= 80){
            System.out.println("Very hot");
        }else if(i > 80 && i <= 99){
            System.out.println("Extremely Hot");
        }else if(i == 100) {
            System.out.println("Boiling");
        }else {
            System.out.println("Something Else to happen");
        }

        System.out.println("========================================================");
        System.out.println("Generate a random number in the range 0-9, and for each one print out its text name (e.g. one, two, etc.).");
        System.out.println("========================================================");
        //Generate a random number in the range 0-9, and for each one print out its text name (e.g. one, two, etc.).
        int someOne = random.nextInt(0,10);
        String answer = switch (someOne){
            case 1 -> "One";
            case 2 -> "Two";
            case 3 -> "Three";
            case 4 -> "Four";
            case 5 -> "Five";
            case 6 -> "Six";
            case 7 -> "Seven";
            case 8 -> "Eight";
            case 9 -> "Nine";
            case 10 -> "Ten";
            default -> "Not allowed";
        };
        System.out.println(answer);

        System.out.println("===========================================");
        System.out.println("Generate random numbers in the range -3 to +3 and stop when the value is zero. Use do/while loop");
        System.out.println("===========================================");
        // Generate random numbers in the range -3 to +3 and stop when the value is zero. Use do/while loop
        int numbersFromOneToThree;
        do{
            numbersFromOneToThree = random.nextInt(-3, 4);
            System.out.println(numbersFromOneToThree);
        }while (numbersFromOneToThree != 0);

        // Modify your program to do the same thing, but this time, use a
        //while
        // loop.
        System.out.println("===========================================");
        System.out.println("Modify your program to do the same thing, but this time, use a while loop");
        System.out.println("===========================================");
        int numbersFromOneToWork = -1;
        while (numbersFromOneToWork != 0){
            numbersFromOneToWork = random.nextInt(-3, 4);
            System.out.println(numbersFromOneToWork);
        }

        System.out.println("===========================================");
        System.out.println("Write a program that prints the multiplication tables for the numbers 1 to 10.");
        System.out.println("===========================================");


        // Write a program that prints the multiplication tables for the numbers 1 to 10.
        // The multiplication tables should consist of the results when multiplying the numbers against 1 to 12, i.e. 1*1, 1*2, ...

        for (int q = 1; q <= 10; q++) {
            System.out.println("PRINTING MULTIPLICATION TABLE FOR : " + q);
            for (int j = 1; j <= 12; j++) {
                System.out.printf("%d * %d = %d \n", q,j,q*j);
            }
            System.out.println("=========================================");
        }

        // Write a program to print out 6 numbers in the range 1 to 49. Don't worry at this stage about duplicating any of the numbers.


//        random.nextInt(1,50);
        System.out.println("ASSIGNMENT 6");
        random.ints(1,50)
                .limit(6)
                .forEach(System.out::println);

        System.out.println("USING FNX TO GENERATE ITEM");
        System.out.println(generateInts(10));

    }

    static int generateInts(int bound){
        Random random = new Random();
        return random.nextInt(1, bound + 1);
    }


}
