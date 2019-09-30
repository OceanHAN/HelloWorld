package com.hhy.java;

public class HelloWorld {
    //psvm
    public static void main(String[] args) {
        System.out.println("hello world"); //sout
        int a = test();
        System.out.println(a);
    }

    public static int test(){
        System.out.println("被调用了");
        int a = 1;int b = 2;
        return a+b;
    }

}
