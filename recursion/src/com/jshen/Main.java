package com.jshen;

public class Main {

    public static void main(String[] args) {
//        foo(5);
//        System.out.println(factorial(5));
        System.out.println(fibonacci(4));
    }

    public static void foo(int n){
        if(n > 1){
            foo(n - 1);
            int newN = n - 1;
            System.out.println("going with " + newN);
        } else {
            System.out.println("recursion ended");
        }
    }
    //Java is using Stack memory to handle this
    //so the system knows where the program is ended


    public static int factorial(int n){
        if(n > 1){
            return (factorial(n - 1) * n);
        } else {
            return 1;
        }
    }

    // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89.......
    //input position and return the number at that position
    public static int fibonacci(int n){
       if(n < 3){
           return n - 1;
       } else {
           return fibonacci(n - 1) + fibonacci(n - 2);
           //think about this if n = 3, so we need to return the sum
           //of the num at position 1 and 2;
       }
    }
}
