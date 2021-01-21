// Student: Griffin Gowdey.
// Instructor: Daniel Goodman.
// Class Number: ITSE1479-86039.
// Class Name: Java Programming.
// Semester: Fall 2020.
// Lesson 5.

/*
Assignment:
The following algorithm yields the season (Spring, Summer, 
Fall, or Winter) for a given month and day:
			
	If month is 1, 2, or 3, season = “Winter” 
	Else if month is 4, 5, or 6, season = “Spring”
	Else if month is 7, 8, or 9, season = “Summer”
   Else if month is 10, 11, or 12, season = “Fall”
	If month is divisible by 3 and day >= 21
		If season is “Winter”, season = “Spring” 
		Else if season is “Spring”, season = “Summer” 
		Else if season is “Summer”, season = “Fall” 
		Else season = “Winter” 

Write a program that prompts the user for a month and day 
and then prints the season, as determined by this algorithm. 
Use a class Date with a method getSeason.
*/

public class Lesson5
{
   private int day;
   private int month;

   /*
      Constructs a Date with a month and day.
      @param month the month number with January being 1.
      @param day the day of the month.
   */
   public Date(int month, int day)
   {
      this.month = month;
      this.day = day;
   }

   // @return the season of this date.
   public String getSeason()
   {
      String season;
      if (month >= 1 && month <= 3)
      {
         season = "Winter";
      }
      else if (month >= 4 && month <= 6)
      {
         season = "Spring";
      }
      else if (month >= 7 && month <= 9)
      {
         season = "Summer";
      }
      else
      {
         season = "Fall";
      }

      if (month % 3 == 0 && day >= 21)
      {
         if (season.equals("Winter"))
         {
            season = "Spring";
         }
         else if (season.equals("Spring"))
         {
            season = "Summer";
         }
         else if (season.equals("Summer"))
         {
            season = "Fall";
         }
         else
         {
            season = "Winter";
         }
      }
      return season;
   }
}