// Student: Griffin Gowdey.
// Instructor: Daniel Goodman.
// Class Number: ITSE1479-86039.
// Class Name: Java Programming.
// Semester: Fall 2020.
// Lesson 19.

/*
Assignment:
Write a program that reads all lines from a file and, 
using a Stream<String>, prints how many of them contain 
the word “the”.
*/

import java.util.Arrays;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Lesson19
{
public class LinesWithThe
{
   public static void main(String[] args) throws IOException
   {
      // Uses substitution to check several files.
      String filename = "test.txt";
      long count = 0;

      // Uses try-with to open the file.
      try (Stream<String> lineStream = Files.lines(Paths.get(filename)))
      {
         /* Only want to print the number of lines that contain
         the word "the". */
         count = lineStream
            .filter(line -> Arrays.asList(line.split("\\s+")).contains("the"))
            .count();
         /* 
         Cannot use contains("the") on stream, because that
         doesn't check for words but the sequence "the".
         Thus, the following does not work correctly:

         count = lineStream
            .filter(line -> line.contains("the"))
            .count();
         */
      }
      
      System.out.println(filename + " has " + count + " line(s) containing the word \"the\".");
   }
}
}