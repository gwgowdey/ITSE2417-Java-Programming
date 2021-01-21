// Student: Griffin Gowdey.
// Instructor: Daniel Goodman.
// Class Number: ITSE1479-86039.
// Class Name: Java Programming.
// Semester: Fall 2020.
// Lesson 11.

/*
Assignment:
Write a program that carries out the following tasks:

	Open a file with the name hello.txt.
	Store the message "Hello, World!" in the file.
   Close the file.
	Open the same file again.
	Read the message into a string variable and print it.
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Lesson11
{
   public static void main(String[] args)
   {
      try (Scanner in = new Scanner(new File("hello.txt")))
      {
         String message = in.nextLine();
         System.out.println(message);
      } 
      catch (FileNotFoundException e)
      {
         e.printStackTrace();
      }

      try (PrintWriter out = new PrintWriter("hello.txt"))
      {
         out.println("Hello, World!");
      }
      catch (FileNotFoundException e)
      {
         e.printStackTrace();
      }
   }
}