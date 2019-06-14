package com.github.hcsp.datatype;

// 修复这个方法里的问题，使得它正确输出 "i=3000000000"
// Fix this method to make it output "i=3000000000"
public class IntegerOverflow {
    public static void main(String[] args) {
        long 十亿 = 10_0000_0000;
        long i = 0;

        i = i + 十亿;
        System.out.println("i=" + i);
        i = i + 十亿;
        System.out.println("i=" + i);
        i = i + 十亿;
        System.out.println("i=" + i);
    }
}
