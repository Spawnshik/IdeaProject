package com.Ekkel.Glava3;

public class Task2 {
    private float a = 5.6f;

    public void setA(float a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "Task2{" +
                "a=" + a +
                '}';
    }

    public float getA() {
        return a;
    }

    public static void main(String[] args) {
        Task2 atask = new Task2();
        Task2 btask = new Task2();
        btask.setA(4.6f);
        System.out.println("Btask"+btask);
        System.out.println("Atask"+atask);
        btask=atask;
        System.out.println("Btask"+btask);
        System.out.println("Atask"+atask);
    }
}
