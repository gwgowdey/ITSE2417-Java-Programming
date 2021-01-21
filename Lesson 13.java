// Student: Griffin Gowdey.
// Instructor: Daniel Goodman.
// Class Number: ITSE1479-86039.
// Class Name: Java Programming.
// Semester: Fall 2020.
// Lesson 13.

/*
Assignment:
Given a class Rectangle with instance variables width 
and height, provide a recursive getArea method. Construct 
a rectangle whose width is one less than the original and 
call its getArea method.
*/

public class Lesson13
{
   public class Rectangle
   {
      private int width;
      private int height;

      /* 
      Constructs a new rectangle with integer dimensions.
      @param w width.
      @param h height.
      */
      public Rectangle(int w, int h)
      {
         width = w;
         height = h;
      }

      /* Computes the area of the rectangle.
      @return the area */
      public int getArea()
      {
         if (width <= 0)
         {
            return 0;
         }
         if (width == 1)
         {
            return 1 * height;
         }
         Rectangle smallerRectangle = new Rectangle(width - 1, height - 1);
         int smallerArea = smallerRectangle.getArea();
         return smallerArea + width + height - 1;
      }
   }
}