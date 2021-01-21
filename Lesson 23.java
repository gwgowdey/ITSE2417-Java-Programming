// Student: Griffin Gowdey.
// Instructor: Daniel Goodman.
// Class Number: ITSE1479-86039.
// Class Name: Java Programming.
// Semester: Fall 2020.
// Lesson 23.

/*
Assignment:
Modify the WebGet program to print only the HTTP header 
of the returned HTML page. The HTTP header is the beginning 
of the response data. It consists of several lines, such as:

	HTTP/1.1 200 OK
	Date: Tue, 14 Apr 2015 16:10:34 GMT
	Server: Apache/1.3.19 (Unix)
	Cache-Control: max-age=86400
	Expires: Wed, 15 Apr 2015 16:10:34 GMT
	Connection: close
   Content-Type: text/html
   
and followed by a blank line. 
*/

import java.io.InputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Lesson23
{
   public static class WebGet {
      public static void main(String[] args) throws IOException {
         // Get command-line arguments.
         String host;
         String resource;

         if (args.length == 2) {
            host = args[0];
            resource = args[1];
         } else {
            System.out.println("Getting / from java.sun.com");
            host = "java.sun.com";
            resource = "/";
         }

         // Open socket.
         final int HTTP_PORT = 80;
         Socket s = new Socket(host, HTTP_PORT);

         // Get streams.
         InputStream instream = s.getInputStream();
         OutputStream outstream = s.getOutputStream();

         // Turn streams into scanners and writers.
         Scanner in = new Scanner(instream);
         PrintWriter out = new PrintWriter(outstream);

         // Send command.
         String command = "GET " + resource + " HTTP/1.0\n\n";
         out.print(command);
         out.flush();

         // Read server response.
         boolean done = false;
         while (in.hasNextLine() && !done) {
            String input = in.nextLine();
            // Stop when a blank line is seen.
            if (input.trim().length() == 0)
               done = true;
            else
               System.out.println(input);
         }

         s.close();
      }
   }
}