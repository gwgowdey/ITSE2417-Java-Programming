// Student: Griffin Gowdey.
// Instructor: Daniel Goodman.
// Class Number: ITSE1479-86039.
// Class Name: Java Programming.
// Semester: Fall 2020.
// Lesson 6.

/*
Assignment:
Read twelve temperature values (one for each month) and display 
the number of the month with the highest temperature. For example, 
according to http://worldclimate.com, the average maximum 
temperatures for Death Valley are (in order by month, in degrees 
Celsius):

	18.2 22.6 26.4 31.1 36.6 42.2 
	45.7 44.5 40.2 33.1 24.2 17.6
         
In this case, the month with the highest temperature (45.7 degrees 
Celsius) is July, and the program should display 7. Your program 
should read twelve temperature values and print the month with 
the highest temperature.
*/

import java.util.Scanner;

public class Lesson6
{
   public static void main(String[] args)
   {  
      Scanner in = new Scanner(System.in);
      System.out.println("Please enter twelve temperature values: ");
      double highestValue = highestValue = in.nextDouble();
      int highestMonth = 1;

      for (int currentMonth = 2; currentMonth <= 12; currentMonth++)
      {
         double nextValue = in.nextDouble();
         if (nextValue > highestValue)
         {
            highestValue = nextValue;
            highestMonth = currentMonth;
         }
      }

      System.out.println("Highest Month: " + highestMonth);
      System.out.println("Highest Value: " + highestValue);
   }
}