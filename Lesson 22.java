// Student: Griffin Gowdey.
// Instructor: Daniel Goodman.
// Class Number: ITSE1479-86039.
// Class Name: Java Programming.
// Semester: Fall 2020.
// Lesson 22.

/*
Write a program in which multiple threads add 
and remove elements from a java.util.LinkedList. 
Demonstrate that the list is being corrupted.
*/

import java.util.LinkedList;
import java.util.Random;

public class Lesson22
{
   public static class LinkedListThreadDemo implements Runnable 
   {
      private static LinkedList<String> list;
      private static Random randomizer;

      public void run() 
      {
         int choice = list.size();
         if (list.size() > 0) {
            choice = randomizer.nextInt(list.size() + 1);
         }
         if (choice == list.size()) {
            String token = randomizer.nextInt(1000) + "";
            list.add(token);
            System.out.println("Added: " + token);
         } else {
            String token = list.remove(choice);
            System.out.println("Removed: " + token);
         }
         if (list.size() > 0) {
            run();
         }
      }

      public static void main(String[] args) 
      {
         randomizer = new Random();
         list = new LinkedList<>();
         Thread thread1 = new Thread(new LinkedListThreadDemo());
         thread1.start();
         Thread thread2 = new Thread(new LinkedListThreadDemo());
         thread2.start();
      }
   }
}