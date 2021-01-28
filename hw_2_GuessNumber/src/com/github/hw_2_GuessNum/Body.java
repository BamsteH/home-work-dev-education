package com.github.hw_2_GuessNum;

import java.util.Scanner;
import java.util.Random;

public class Body {
    static final Scanner scan = new Scanner(System.in);
    static final Random generate = new Random();

//    private static int minToMax() {
//        int min = 1;
//        int max = 200;
//        return min;
//        return max;
//    }                                      Хз как исправить.
    static int min = 1;
    static int max = 200;
    static int attempts = 5;

    public static void welcome() {
        System.out.println("Hi, let's play with me one very interesting game. " +
                "Try to guess the number that I made a wish for. Don't worry, I'll help you.");
        System.out.println("Ok, you have 5 try to guess the number. I wish number from"+ min + "to" + max);
    }

    public static int generatedNumber() {
        int rN = generate.nextInt(max - min);
        rN = rN + min + 1;
        return rN;
    }

    public static void method () {
        int wishedNum = generatedNumber();
        int attemptNum = scan.nextInt();
        int attempt = 1;
        if (attempt == attempts){
            if (attemptNum != wishedNum){
                System.out.println("Sorry, you lose.");
            }
            else{
                System.out.println("NICE");
            }
        }
        if (attemptNum != wishedNum){
            System.out.println("Oh. First fail. Ok, Try again. I believe in you. ");
            attempt += 1;
            int previousAttemptNum = attemptNum;
            attemptNum = scan.nextInt();
            while(attempt <= attempts){
                attempt += 1;
                if (attemptNum != wishedNum){
                    if (Math.abs(wishedNum - attemptNum) < Math.abs(wishedNum - previousAttemptNum) ){
                        System.out.println("Fail, but it warmer");
                    }
                    else if (Math.abs(wishedNum - attemptNum) == Math.abs(wishedNum - previousAttemptNum) ){
                        System.out.println("Not warmer and is not cold. Same");
                    }
                    else {
                        System.out.println("Fail. Colder.");
                    }
                    previousAttemptNum = attemptNum;
                    attemptNum = scan.nextInt();
                    attempt +=1;
                }
                else{
                    System.out.println("Yeah boiiii. You win");
                    break;
                }
            }
        }
        else{
            System.out.println("Wow. today luck on your side. Let's go to the Vegas!");
        }
    }
}
//Консольное приложение, при запуске которого пользователю предлагается угадать число от 1 до 100 за 5 попыток.
// Конструктор класса запуска аппликации должен предусматривать варианты настроек диапазона чисел
// (валидация: не отрицательные, без плавающей точки, минимум = 1, максимум = 200) и количества попыток (валидация: не отрицательные,
// без плавающей точки, минимум = 1, максимум = 15).
//Игра начинается с того, что пользователь видит сообщение:
// “Привет, я загадал число от min до max вашего диапазона. Попробуй угадать его за x попыток!”
// И пользователю предлагается использовать свою первую попытку путём ввода первого числа в консоль и нажать Enter.
//Примечание: в любой момент времени, пользователь может прекратить игру и ввести сообщение “exit”, после чего игра моментально остановится.
// Все остальные команды никак не валидируются, на вход принимаются только числа.
//	Со второй попытки для пользователя вводятся подсказки, типа:
//	“Не угадал, но теплее!!! Осталось n попыток” либо “Не угадал, холоднее… Осталось n попыток”.
//	Если пользователь угадал число - выводится сообщение “Поздравляю! Ты угадал задуманное число за n попыток”.
//	Остальные мелкие доработки - на усмотрение разработчика.