// Student: Griffin Gowdey.
// Instructor: Daniel Goodman.
// Class Number: ITSE1479-86039.
// Class Name: Java Programming.
// Semester: Fall 2020.
// Lesson 2.

/*
Assignment:
Write a program that initializes a string with "Mississippi". 
Then replace all "i" with "ii" and print the length of the resulting 
string. In that string, replace all "ss" with "s" and print the 
length of the resulting string.
*/

public class Lesson2 
{
        public static void main(String[] args) 
        {
                String state = "Mississippi";
        
                state = state.replace("i", "ii");
                System.out.println("Length of new string: " +
                        state.length());
        
                state = state.replace("ss", "s");
                System.out.println("Length of new string: " +
                        state.length());
        }
}