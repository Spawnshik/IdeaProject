package com.Ekkel.Glava4;

public class Task20 {
    static int test(int testval, int begin, int end) {
        if ((testval >= begin) && (testval <= end)) {
            return +1;
        }else
            return -1;
    }

    public static void main(String[] args) {
        System.out.println(test(10,1,9));
        System.out.println(test(0,0,2));
    }
}
