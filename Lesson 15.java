// Student: Griffin Gowdey.
// Instructor: Daniel Goodman.
// Class Number: ITSE1479-86039.
// Class Name: Java Programming.
// Semester: Fall 2020.
// Lesson 15.

/*
Assignment:
Write a method:

   public static void downsize(LinkedList<String> employeeNames, int n)
   
that removes every nth employee from a linked list. 
*/

import java.util.LinkedList;

public class Lesson15
{
   /*
      Removes every nth element from the linked list.
      @param employeeNames the linked list to remove from.
      @param n the parameter to determine "nth".
    */
   public static void downsize(LinkedList<String> employeeNames, int n)
   {
      for (int i = employeeNames.size() - 1; i >= 0; i--)
      {
         if ((i + 1) % n == 0)
         {
            employeeNames.remove(i);
         }
      }
   }
}