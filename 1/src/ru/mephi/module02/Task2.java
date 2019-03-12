package ru.mephi.module02;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {


        System.out.println("Enter the octal number for conversion to binary number : ");
    Scanner scanner = new Scanner(System.in);
    int octalNumber = scanner.useRadix(8).nextInt();// At the entrance comes an octal number.
    convertToBinary(octalNumber);


}

    private static void convertToBinary (int octalNumber){
        String result = Integer.toString(octalNumber,2);
        System.out.println("Binary number : " + result);
    }

}
