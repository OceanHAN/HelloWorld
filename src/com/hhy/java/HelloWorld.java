package com.hhy.java;

public class HelloWorld {
    //psvm
    public static void main(String[] args) {
        System.out.println("hello world"); //sout
        int a = test();
        System.out.println(a);
        System.out.println("测试");
        System.out.println("1111111111111");
        System.out.println("2222");
    }

    public static int test(){
        System.out.println("被调用了");
        int a = 1;int b = 2;
        return a+b;

    }


}
