// Student: Griffin Gowdey.
// Instructor: Daniel Goodman.
// Class Number: ITSE1479-86039.
// Class Name: Java Programming.
// Semester: Fall 2020.
// Lesson 25.

/*
Assignment:
Write a program that can read XML files, such as:

	<bank>
		<account>
			<number>3</number>
			<balance>1295.32</balance>
		</account>
		. . .
   </bank>
      
Your program should construct a Bank object and print the 
total value of the balances in the accounts.
*/

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class Lesson25
{
   private DocumentBuilder builder;
   private XPath path;

   public BankParser() throws ParserConfigurationException
   {
      DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
      builder = factory.newDocumentBuilder();
      XPathFactory xpfactory = XPathFactory.newInstance();
      path = xpfactory.newXPath();
   }

   /*
      Parses an XML file containing a bank.
      @param fileName the name of the file.
      @return a Bank object containing all coins in the XML file.
   */
   public Bank parse(String fileName) throws SAXException, IOException, XPathExpressionException
   {
      File f = new File(fileName);
      Document doc = builder.parse(f);

      // Get the bank.
      Bank b = new Bank();
      
      // Get the accounts.
      int accountCount = Integer.parseInt(path.evaluate("count(/bank/account)", doc));
      
      for (int i = 1; i <= accountCount; i++)
      {
         int number = Integer.parseInt(path.evaluate("/bank/account[" + i + "]/number", doc));
         double balance = Double.parseDouble(path.evaluate("/bank/account[" + i + "]/balance", doc));
         BankAccount account = new BankAccount(number, balance);
         b.addAccount(account);
      }

      return b;
   }
}