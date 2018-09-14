package com.company;
import java.util.*;

public class Main {
public static boolean evenOrOdd(int number){
    if (number % 2 == 0){
        return true;
    }else {
        return false;
    }
}
    public static void main(String[] args) {
Scanner kbScanner = new Scanner(System.in);
        System.out.println("Type in an integer:");
        int num = kbScanner.nextInt();

        if (evenOrOdd(num)){
            System.out.println("The number " + num + " is even.");
        }else {
            System.out.println("The number " + num + " is odd.");
        }
    }
}
