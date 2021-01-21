// Student: Griffin Gowdey.
// Instructor: Daniel Goodman.
// Class Number: ITSE1479-86039.
// Class Name: Java Programming.
// Semester: Fall 2020.
// Lesson 4.

/*
Assignment:
Write a program that displays the properties of a letter-size 
(8.5 × 11 inches) sheet of paper in millimeters. There are 25.4 
millimeters per inch. The program should print:

• The width and height
• The perimeter
• The length of the diagonal
        
Use constants and comments in your program.
*/

public class Lesson4
{
    // @param args the command line arguments.
    public static void main(String[] args)
    {
        System.out.println ("This program prints the characteristics of an 8-1/2 x 11 in paper in mm\n");
        final double INCH_TO_MM = 25.4;
        double length = 11 * INCH_TO_MM;   // Length of paper in mm.
        double width = 8.5 * INCH_TO_MM;  // Width of paper in mm.
        double perimeter = 2 * (length + width); // Distance in mm around paper.
        // Use Pythagorean theorem to compute the diagonal in mm.
        double diagonal = Math.sqrt(width * width + length * length);
        System.out.println("Characteristics of an 8.5 x 11 in sheet in mm:");
        System.out.printf("Width:              %5.2f mm\n", width);
        System.out.printf("Length:             %5.2f mm\n", length);
        System.out.printf("Perimeter:          %5.2f mm\n", perimeter);
        System.out.printf("Length of diagonal: %5.2f mm\n", diagonal);
    }
}