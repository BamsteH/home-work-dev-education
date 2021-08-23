package com.github.hw_3_JUnitTest;

import java.util.Scanner;

public class Functions {
    /**
     * Получить строковое название дня недели по номеру дня.
     */
    public static String HW141(int d) {
        String[] days = {"Saturday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Sunday"};
        if(d >7){
            System.out.println("Введите число от 1 до 7");
            return "error";
        }
        else if(d< 1){
            System.out.println("Введите число от 1 до 7");
            return "error";
        }
        else {
            System.out.println(days[d - 1]);
            String k = days[d-1];
            return k;
        }

    }
    /**
     *
     *  private Scanner scan;
     *
     *     public Functions (Scanner scan) {
     *         this.scan = scan;
     *     }
     */



    public static String strFromNum(int d) {
        String[] ede = {"ноль", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};
        String[] des = {"десять", "одинадцать", "двенадцать", "тринадцать", "четырнадцать", "пятьнадцать", "шестьнадцать", "семьнадцать", "восемнадцать", "девятнадцать"};
        String[] Des = {"двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто",};
        String[] sot = {"сто", "двести", "триста", "четыреста", "пятсот", "шестьсот", "семьсот", "восемьсот", "девятсот",};
        System.out.println("Введите число");
        String ans = "";
        if (d < 10) {
            System.out.println(ede[d]);
            ans +=ede[d];
        } else if (d < 20) {
            System.out.println(des[d % 10]);
            ans +=des[d % 10];
        } else if (d < 100) {
            System.out.println(Des[d / 10 - 2] + " " + ede[d % 10]);
            ans +=Des[d / 10 - 2] + " " + ede[d % 10];
        } else if (d < 1000) {
            System.out.print(sot[d / 100 - 1]+ " ");
            ans +=sot[d / 100 - 1]+ " ";
            if (d%100 < 10) {
                System.out.println(ede[d % 10]);
                ans +=ede[d % 10];
            } else if (d % 100 < 20) {
                System.out.println(des[d % 10]);
                ans +=des[d % 10];
            } else if ( d % 100 >= 20) {
                ans +=Des[d % 100 / 10 - 2] + " " + ede[d % 10];
                System.out.println(Des[d % 100 / 10 - 2] + " " + ede[d % 10]);
            }
        }
        System.out.println(ans);
        return ans;
    }
    /**
     *
     *
     */
    public static int fromStrToNum (String d){
        String[] ede = {"ноль", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};
        String[] des = {"десять", "одинадцать", "двенадцать", "тринадцать", "четырнадцать", "пятьнадцать", "шестьнадцать", "семьнадцать", "восемнадцать", "девятнадцать"};
        String[] Des = {"двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто",};
        String[] sot = {"сто", "двести", "триста", "четыреста", "пятсот", "шестьсот", "семьсот", "восемьсот", "девятсот",};
        System.out.println("Введите число");
        int otwet = 0;
        String[] o = d.split(" ");
        int k = 0;
        for (int i = 0; i < o.length; i++ ){
            if (k == 0)
            {
                for (int j = 0; j < sot.length; j++)
                {
                    if (o[i].equalsIgnoreCase(sot[j]))
                    {
                        otwet = otwet + (j + 1) * 100;
                        k = 1;
                    }
                }
            }
            if (k == 0)
            {
                for (int j = 0; j < Des.length; j++)
                {
                    if (o[i].equalsIgnoreCase(Des[j]))
                    {
                        otwet = otwet + (j + 2) * 10;
                        k = 1;
                    }
                }
            }
            if (k == 0)
            {
                for (int j = 0; j < des.length; j++)
                {
                    if (o[i].equalsIgnoreCase(des[j]))
                    {
                        otwet = otwet + j + 10 ;
                        k = 1;
                    }
                }
            }
            if (k == 0)
            {
                for (int j = 0; j < ede.length; j++)
                {
                    if (o[i].equalsIgnoreCase(ede[j]))
                    {
                        otwet = otwet + j ;
                        k = 1;
                    }
                }
            }
            k = 0;
        }
        System.out.println(otwet);
        return otwet;
    }

    /**
     *
     *
     */
    public static int coordinates(int x1, int y1, int x2, int y2) {
        int x = x1 - x2;
        int y = y1 - y2;
        int otvet = (int) Math.sqrt(x * x + y * y);

        System.out.println(otvet);
        return otvet;
    }


    /**
     *
     */
    public static long bigFromStrToNum(String d) {
        String[] ede = {"ноль", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};
        String[] des = {"десять", "одинадцать", "двенадцать", "тринадцать", "четырнадцать", "пятьнадцать", "шестьнадцать", "семьнадцать", "восемнадцать", "девятнадцать"};
        String[] Des = {"двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто",};
        String[] sot = {"сто", "двести", "триста", "четыреста", "пятсот", "шестьсот", "семьсот", "восемьсот", "девятсот",};
        String[] tisc = {"тысяч", "тысяча", "тысячи"};
        String[] mill = {"миллион", "миллионов", "миллиона"};
        String[] mild = {"миллиард", "миллиарда", "миллиардов"};
        System.out.println("Введите число");
        long otwet = 0;
        String[] o = d.split(" ");
        int k = 0;
        for (int i = 0; i < o.length; i++ ){
            for (int j = 0; j < sot.length; j++)
            {
                if (o[i].equalsIgnoreCase(sot[j]))
                {
                    otwet = otwet + (j + 1) * 100L;
                    k = 1;
                }
            }
            if (k == 0)
            {
                for (int j = 0; j < Des.length; j++)
                {
                    if (o[i].equalsIgnoreCase(Des[j]))
                    {
                        otwet = otwet + (j + 2) * 10L;
                        k = 1;
                    }
                }
            }
            if (k == 0)
            {
                for (int j = 0; j < des.length; j++)
                {
                    if (o[i].equalsIgnoreCase(des[j]))
                    {
                        otwet = otwet + j + 10 ;
                        k = 1;
                    }
                }
            }
            if (k == 0)
            {
                for (int j = 0; j < ede.length; j++)
                {
                    if (o[i].equalsIgnoreCase(ede[j]))
                    {
                        otwet = otwet + j ;
                        k = 1;
                    }
                }
            }
            if (k == 0)
            {
                for (int j = 0; j < tisc.length; j++)
                {
                    if (o[i].equalsIgnoreCase(tisc[j]))
                    {
                        otwet = otwet * 1000 ;
                        k = 1;
                    }
                }
            }
            if (k == 0)
            {
                for (int j = 0; j < mill.length; j++)
                {
                    if (o[i].equalsIgnoreCase(mill[j]))
                    {
                        otwet = otwet * 1000000 ;
                        k = 1;
                    }
                }
            }
            if (k == 0)
            {
                for (int j = 0; j < mild.length; j++)
                {
                    if (o[i].equalsIgnoreCase(mild[j]))
                    {
                        otwet = otwet * 1000000000 ;
                        k = 1;
                    }
                }
            }
            k = 0;
        }
        System.out.println(otwet);
        return otwet;
    }
}
