package com.jshen;

public class Main {

    public static void main(String[] args) {
//        foo(5);
        System.out.println(factorial(5));
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
}
