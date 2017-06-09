package com.Ekkel.Glava4;

public class Task17 {
    public static void main(String[] args) {


        int twentyfive[] = new int[25];
        while (true) {
            for (int i = 0; i < twentyfive.length; i++) {
                twentyfive[i] = (int) (Math.random() * 25);
            }
            for (int i = 0; i < twentyfive.length - 1; i++) {
                if (twentyfive[i] < twentyfive[i + 1]) {
                    System.out.println("Число " + i + " меньше числа " + (i + 1));
                    System.out.println(twentyfive[i] + " " + twentyfive[i + 1]);
                } else if (twentyfive[i] > twentyfive[i + 1]) {
                    System.out.println("Число " + i + " больше числа " + (i + 1));
                    System.out.println(twentyfive[i] + " " + twentyfive[i + 1]);
                } else {
                    System.out.println("Число " + i + " равно числу " + (i + 1));
                    System.out.println(twentyfive[i] + " " + twentyfive[i + 1]);
                }
            }
        }
    }
}