package com.Ekkel.Glava4;

public class Task23 {
    static void Fibonachi(int howmany){
        int numbersFibonachi[]= new int[howmany];
        numbersFibonachi[0]=1;
        numbersFibonachi[1]=1;
        for (int i =2;i<numbersFibonachi.length;i++){
            numbersFibonachi[i]=numbersFibonachi[i-1]+numbersFibonachi[i-2];
        }
        for (int y:numbersFibonachi
             ) {
            System.out.print(" "+y);
        }
    }

    public static void main(String[] args) {
        Fibonachi(48);
    }
}
