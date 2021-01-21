// Student: Griffin Gowdey.
// Instructor: Daniel Goodman.
// Class Number: ITSE1479-86039.
// Class Name: Java Programming.
// Semester: Fall 2020.
// Lesson 20: Part 2.

/*
Assignment:
Write an application with three buttons labeled “Red”, “Green”, 
and “Blue” that changes the background color of a panel in the 
center of the frame to red, green, or blue. 
*/

// Application viewer from part 1.
import javax.swing.JFrame;

public class Lesson20Part2
{
   public static class ThreeColorsViewer {
      public static void main(String[] args) {
         JFrame frame = new ThreeColorsFrame();
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setTitle("ThreeColorsViewer");
         frame.setVisible(true);
      }
   }
}