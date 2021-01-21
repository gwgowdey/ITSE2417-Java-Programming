// Student: Griffin Gowdey.
// Instructor: Daniel Goodman.
// Class Number: ITSE1479-86039.
// Class Name: Java Programming.
// Semester: Fall 2020.
// Lesson 3: Part 2.

/*
Assignment:
We want to add a button to the tally counter in Section 3.1 
that allows an operator to undo an accidental button click. 
Provide a method:

   public void undo()
         
that simulates such a button. As an added precaution, make 
sure that clicking the undo button more often than the click 
button has no effect. (Hint: The call Math.max(n, 0) returns 
n if n is greater than zero, zero otherwise.)
*/

// Tester for the tally counter.
public class Lesson3Part2
{
   public static void main(String[] args)
   {
      Counter tally = new Counter();
      tally.click();
      tally.click();
      tally.click();
      System.out.println(tally.getValue());
      System.out.println("Expected: 3");
      tally.undo();
      System.out.println(tally.getValue());
      System.out.println("Expected: 2");
      tally.undo();
      tally.undo();
      tally.undo();
      System.out.println(tally.getValue());
      System.out.println("Expected: 0");
   }
}