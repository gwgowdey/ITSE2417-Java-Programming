// Student: Griffin Gowdey.
// Instructor: Daniel Goodman.
// Class Number: ITSE1479-86039.
// Class Name: Java Programming.
// Semester: Fall 2020.
// Lesson 7.

/*
Assignment:
Write a loop that reads ten numbers and a second 
loop that displays them in the opposite order from 
which they were entered.
*/

public class Lesson7
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int myArray[10];

		for (int i = 0; i < 10; i++)
		{
			System.out.println("Enter a number: ");
   			myArray[i] = in.nextInt();
		}

		for (int j = 9; j >= 0; j--)
		{
			System.out.print(myArray[j] + " ");
		}
	}
}