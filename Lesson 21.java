// Student: Griffin Gowdey.
// Instructor: Daniel Goodman.
// Class Number: ITSE1479-86039.
// Class Name: Java Programming.
// Semester: Fall 2020.
// Lesson 21.

/*
Assignment:
Write a program that opens a binary file and prints all 
ASCII characters from that file, that is, all bytes with 
values between 32 and 126. Print a new line after every 64 
characters. What happens when you use your program with word 
processor documents? With Java class files?
*/

/*
   This program prints all ASCII characters in a file.

   When this program is used with a word processor file, the
   words become visible, but they are not necessarily in order. 
   There are also random-looking characters that occur when the
   binary formatting instructions happen to have bytes that are
   in the visible ASCII range.

   When printing an image file, there may be a few legible text
   items since some image files contain comments. Most of the output
   will consist of seemingly random character caused by bytes 
   in the binary image data that happen to be in the visible ASCII
   range.
*/

import java.io.InputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Lesson21
{  
   public static void main(String[] args)
   {  
      Scanner in = new Scanner(System.in);
      System.out.println("Filename: ");
      String filename = in.next();
      
      try(InputStream inStream = new FileInputStream(filename))
      {         
         boolean done = false;
         int counter = 0;
         final int LINE_LENGTH = 64;
         while (!done)
         {  
            int next = inStream.read();
            if (next == -1) 
               done = true;
            else if (32 <= next && next <= 126)
            {
               System.out.print((char) next);
               counter++;
               if (counter == LINE_LENGTH)
               {
                  System.out.println();
                  counter = 0;
               }
            }
         }
         if (counter > 0)
            System.out.println();
         inStream.close();
      }
      catch(IOException e)
      {
         e.printStackTrace();
      }
   }
}