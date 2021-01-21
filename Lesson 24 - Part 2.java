// Student: Griffin Gowdey.
// Instructor: Daniel Goodman.
// Class Number: ITSE1479-86039.
// Class Name: Java Programming.
// Semester: Fall 2020.
// Lesson 24: Part 2.

/*
Assignment:
Write a Java program that creates a Coin table with coin names and 
values; inserts coin types penny, nickel, dime, quarter, half dollar, 
and dollar; and prints out the sum of the coin values. Use SQL 
commands CREATE TABLE, INSERT, and SELECT SUM.
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/* A simple data source for getting database connections.
See part 1 for reference. */
public class Lesson24Part2
{
   public static class SimpleDataSource 
   {
      private static String url;
      private static String username;
      private static String password;

      /* 
      Initializes the data source.
      @param fileName the name of the property file that contains the database
      driver, URL, username, and password.
      */
      public static void init(String fileName) throws IOException, ClassNotFoundException 
      {
         Properties props = new Properties();
         FileInputStream in = new FileInputStream(fileName);
         props.load(in);

         String driver = props.getProperty("jdbc.driver");
         url = props.getProperty("jdbc.url");
         username = props.getProperty("jdbc.username");
         if (username == null)
            username = "";
         password = props.getProperty("jdbc.password");
         if (password == null)
            password = "";
         if (driver != null)
            Class.forName(driver);
      }

      /* Gets a connection to the database.
      @return the database connection. */
      public static Connection getConnection() throws SQLException 
      {
         return DriverManager.getConnection(url, username, password);
      }
   }
}