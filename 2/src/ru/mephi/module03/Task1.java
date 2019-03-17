package ru.mephi.module03;


import java.util.*;

public class Task1 {
   public static void main(String[] args) {

      int[] massNumbers = {39,1,55,3,200,2,4,80,5};
      Set<Integer> items = parseToItems(massNumbers);
      System.out.println("=========================");
      System.out.println("The length of the longest sequence of integer items in this array : "
                                                             +checkMostLongSequence(items));

   }

   private static Set<Integer> parseToItems(int[] mass) {
      Set<Integer> items = new HashSet<>(); // We use the Set collection to remove repeating elements
      // from the collection without additional methods, for simplicity +
      // + all elements  will be sorted without method sort from Collections or Arrays

      for (int i = 0; i < mass.length; i++) {
         while (mass[i] != 0) {
            items.add(mass[i] % 10);
            mass[i] /= 10;
         }
      }
      return items;
   }

   private static int checkMostLongSequence(Set<Integer> sequence) {

      List<Integer> list = new ArrayList<>();//Use a List  to get the elements of the collection
      // without using an Iterator (for Set this using is necessary )
      list.addAll(sequence);
      int counter = 1;
      int memoryCounter = 1; // for to remember the value counter

      for (int i = 0; i < list.size() - 1; i++) {

           if (list.get(i) + 1 == list.get(i + 1)) {

              counter++;

                   if(counter > memoryCounter)
               memoryCounter = counter;
         } else {
              counter = 1; //
         }
      }

      if (memoryCounter == 1) {
         System.out.println("Not even 2 consecutive integer items...");
         return 0;
      }
          else
             return memoryCounter ;
   }
}