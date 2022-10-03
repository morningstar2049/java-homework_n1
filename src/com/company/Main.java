package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

     static int gcd(int num1, int num2){         // უდიდესი საერთო გამყოფი
        if(num1 == 0) {
            return num2;
        }
        return gcd(num2 % num1, num1);

    }


    static int lcm(int num1, int num2){        // უმცირესი საერთო ჯერადი
         return num1 * num2 / gcd(num1,num2);
    }

    public static void main(String[] args) {
//        1

//        System.out.println("C#");
//        System.out.println("Java");
//        System.out.println("JavaScript");
//        System.out.println("Python");


//        2

//        Scanner scanner = new Scanner(System.in);
//        int x = 0;
//        int y = 0;
//        x = scanner.nextInt();
//        y = scanner.nextInt();
//        System.out.println(x/y);
//        System.out.println(y % x);


//        3

//        Scanner scanner = new Scanner(System.in);
//        int x = 0;
//        int y = 0;
//        int z = 0;
//        x = scanner.nextInt();
//        y = scanner.nextInt();
//        z = scanner.nextInt();
//        System.out.println("Jami " + (x+y+z));
//        System.out.println("Namravli " + (x*y*z));


//        4

//        Scanner scanner = new Scanner(System.in);
//        int x =0;
//        int digit = 0;
//        x =  scanner.nextInt();
//        while(x > 0){
//            digit = x%10;
//            x /= 10;
//            System.out.println(digit);
//
//        }


//        5,6

//        Scanner scanner = new Scanner(System.in);
//        int x  = 0;
//        int sum = 0;
//        x = scanner.nextInt();
//        while(x > 0){
//            sum += x %10;
//            x /= 10;
//
//        }
//        System.out.println(sum);



//        7
//

//        System.out.println(gcd(60, 36));   //უდიდესი საერთო გამყოფი
//        System.out.println(lcm(25,15));    //უმცირესი საერთო ჯერადი







//        8

//        Scanner scanner = new Scanner(System.in);
//        int m = 0;
//        int n = 0;
//        m = scanner.nextInt();
//        n = scanner.nextInt();
//        IntStream.range(m+1, n).forEach(number -> System.out.println(number));    პირველი ვარიანტი
//        while(m < n){                                                             მეორე ვარიანტი
//            m += 1;
//            if(m == n){               n რომ არ დაბეჭდოს მაგისთვისაა
//                break;
//            }
//            System.out.println(m);
//        }



//        9


//        int[] arr = {1, 3, 10, 9, 5, 6, 0, 30};
//        System.out.println(Arrays.toString(arr));
//        Arrays.sort(arr);
//        System.out.println("Min: " + arr[0]);
//        System.out.println("Max: " + arr[arr.length - 1]);



//        10

//
//        int[] arr = {150,23,50,15,60,30,2};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));





//        11

//
//        int[] arr = new int[8];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = (int) Math.round(Math.random() * 100);
//
//        }
//
//        System.out.println(Arrays.toString(arr));





//        12


//        Integer[] arr = new Integer[8];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = (int) Math.round(Math.random() * 100);
//
//        }
//        Arrays.sort(arr, Collections.reverseOrder());
//        System.out.println(Arrays.toString(arr));



    }
}
