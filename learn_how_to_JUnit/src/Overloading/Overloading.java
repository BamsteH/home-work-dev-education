package Overloading;

public class Overloading {
    void test(int a) {
        System.out.println("a: " + a);
    }
    void test(int b, int a) {
        System.out.println("a и b: " + b);
    }
    public static void main(String[] args) {
        Overloading o = new Overloading();
        o.test(10);
        o.test(10,98);
    }
}