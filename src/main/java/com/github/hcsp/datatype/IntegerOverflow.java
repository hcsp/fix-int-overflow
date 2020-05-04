package com.github.hcsp.datatype;

public class IntegerOverflow {
    // 修复这个方法里的问题，使得它正确输出 "i=3000000000"
    // Fix this method to make it output "i=3000000000"
    public static void main(String[] args) {
        long b = 10_0000_0000;
        long i = 0;

        i = i + b;
        System.out.println("i=" + i);
        i = i + b;
        System.out.println("i=" + i);
        i = i + b;
        System.out.println("i=" + i);
    }
}
