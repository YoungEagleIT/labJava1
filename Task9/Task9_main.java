package Laba_1.Task9;

import Laba_1.Task8.CustomDouble;
import java.util.Scanner;

public class Task9_main {
    public static void main(final String[] args) {
        final CustomDouble a = new CustomDouble(5,0.5);
        final CustomDouble b= new CustomDouble(5,0);
        System.out.println(a.toDouble());
        System.out.println(b.toDouble());
        System.out.println("arithmetic operation('+','-','*','/') :");
        System.out.println(a.toDouble()+" [+] "+b.toDouble()+" = "+Calculator.plus(a,b));
        System.out.println( a.toDouble()+" [-] "+b.toDouble()+" = "+Calculator.minus(a,b));
        System.out.println( a.toDouble()+" [*] "+b.toDouble()+" = "+Calculator.multiply(a,b));
        System.out.println( a.toDouble()+" [/] "+b.toDouble()+" = "+Calculator.divide(a,b));
}}
