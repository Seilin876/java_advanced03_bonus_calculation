package com.example.advancedhw03;
import java.util.Scanner;

public class MyClass {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("本月利潤是?");
        String s = scanner.next();
        int i = Integer.parseInt(s);
                    System.out.print(
                            (i>=1000000)?i/100:
                            (i>=600000)?i*3/200:
                            (i>=400000)?3*i/100:
                            (i>=200000)?5*i/100:
                            (i>=100000)?7.5*i/100:i/10);
            }
}
