package ru.mephi.module03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String string  = scanner.next();
            char[] charArray = string.toCharArray();
        System.out.println("====================================");
            mostFreqChars(charArray);

    }
    private static void mostFreqChars(char[] chars) {
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars.length; j++) {
                if (i != j) {
                    if ( (chars[i] == chars[j]) && !list.contains(chars[i])) {
                                    list.add(chars[i]);
                    }
                }
            }
        }
         if(list.isEmpty()) {
             System.out.println("This string has no repetitive items ");
         } else {
             Collections.sort(list);
             System.out.println("The most common items : " + list);
          }
    }
}
