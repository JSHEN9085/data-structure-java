package com.jshen;

public class Main {

    public static void main(String[] args) {
        foo(5);
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
}
