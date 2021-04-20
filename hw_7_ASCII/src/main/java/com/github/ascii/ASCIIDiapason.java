package com.github.ascii;

public class ASCIIDiapason {
    public static void print(){
        for (int i = 32; i <= 127; i++) {
            System.out.print((char) i + " ");
        }
    }
}
