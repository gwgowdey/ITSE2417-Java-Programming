// Student: Griffin Gowdey.
// Instructor: Daniel Goodman.
// Class Number: ITSE1479-86039.
// Class Name: Java Programming.
// Semester: Fall 2020.
// Lesson 24: Part 1.

/*
Assignment:
Write a Java program that creates a Coin table with coin names and 
values; inserts coin types penny, nickel, dime, quarter, half dollar, 
and dollar; and prints out the sum of the coin values. Use SQL 
commands CREATE TABLE, INSERT, and SELECT SUM.
*/

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.IOException;

public class Lesson24Part1
{
   public static class CoinDB 
   {
      public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException 
      {
         if (args.length == 0) 
         {
            System.out.println("Usage: java CoinDB propertiesFile");
            System.exit(0);
         }

         SimpleDataSource.init(args[0]);
         try (Connection conn = SimpleDataSource.getConnection(); Statement stat = conn.createStatement()) 
         {
            stat.execute("CREATE TABLE Coin (Name VARCHAR(20), Value DECIMAL(4,2))");
            stat.execute("INSERT INTO Coin VALUES ('penny', 0.01)");
            stat.execute("INSERT INTO Coin VALUES ('nickel', 0.05)");
            stat.execute("INSERT INTO Coin VALUES ('dime', 0.10)");
            stat.execute("INSERT INTO Coin VALUES ('quarter', 0.25)");
            stat.execute("INSERT INTO Coin VALUES ('half-dollar', 0.50)");
            stat.execute("INSERT INTO Coin VALUES ('dollar', 1.00)");

            try (ResultSet result = stat.executeQuery("SELECT SUM(Value) FROM Coin")) 
            {
               result.next();
               System.out.print("Sum of the coin values: ");
               System.out.println(result.getObject(1));
               result.close();
            }
            stat.close();
            conn.close();
         }
      }
   }
}