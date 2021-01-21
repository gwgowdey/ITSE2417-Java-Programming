// Student: Griffin Gowdey.
// Instructor: Daniel Goodman.
// Class Number: ITSE1479-86039.
// Class Name: Java Programming.
// Semester: Fall 2020.
// Lesson 3: Part 1.

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

public class Lesson3Part1
{
   private int value;

   /* Gets the current value of this counter. 
   @return the current value. */

   public int getValue()
   {
      return value;
   }

   // Advances the value of this counter by 1.
   public void click()
   {
      value = value + 1;
   }

   // Resets the value of this counter to 0.
   public void reset()
   {
      value = 0;
   }

   // Undoes a click, but prevents the tally from dropping below 0.
   public void undo()
   {
      value = Math.max(value - 1, 0);
   }
}