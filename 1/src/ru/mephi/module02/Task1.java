package ru.mephi.module02;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner scanner = new Scanner(System.in);
        double value = scanner.nextDouble();
        System.out.println("=========");
        printToTen(value);

    }

    private static void printToTen (double value) {
        for (int i = 1; i <= 10; i++) {
            double result = value * i;
            System.out.println(result);
        }
    }

   }

