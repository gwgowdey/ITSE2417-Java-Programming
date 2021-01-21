// Student: Griffin Gowdey.
// Instructor: Daniel Goodman.
// Class Number: ITSE1479-86039.
// Class Name: Java Programming.
// Semester: Fall 2020.
// Lesson 12.

/* 
Assignment:
Provide a user interface to the invoice program that 
allows a user to enter and print an arbitrary invoice. 
Do not modify any of the existing classes:

Invoice Program:

// Describes an invoice for a set of purchased products. 
public class Invoice
{  
	// Adds a charge for a product to this invoice. 
	// @param aProduct the product that the customer ordered. 
	// @param quantity the quantity of the product. 	   
    public void add(Product aProduct, int quantity)
	{}
			   
	// Formats the invoice. 
	// @return the formatted invoice. 
	public String format()
	{}
}
			   
// Describes a quantity of an article to purchase. 
public class LineItem
{ 
	// Computes the total cost of this line item. 
	// @return the total price. 
	public double getTotalPrice()
	{}
			   
	// Formats this item. 
	// @return a formatted string of this item. 
	public String format()
	{}
}
               
// Describes a product with a description and a price. 
public class Product
{ 
	// Gets the product description. 
	// @return the description. 
	public String getDescription()
	{}
			   
	// Gets the product price. 
	// @return the unit price. 
	public double getPrice()
	{}
}
			   
// Describes a mailing address. 
public class Address
{   
    // Formats the address. 
	// @return the address as a string with three lines. 
	public String format()
	{}
}
*/

import java.util.Scanner;

public class Lesson12
{
    public static class InvoicePrinter 
    {
        // Prompt and read a string.
        static String read(String prompt, Scanner in) 
        {
            String input;
            System.out.print(prompt + ": ");
            return in.nextLine();
        }

        /*
        Read an address.
        @param in the input stream from which to read the Address.
        @return the address.
         */
        static Address readAddress(Scanner in) 
        {
            System.out.println("Please enter an address (empty line to terminate)");
            String name;
            name = read("Name", in);
            if (name.equals(""))
                return null;
            String street;
            String city;
            String state;
            String zip;

            street = read("Street", in);
            city = read("City", in);
            state = read("State", in);
            zip = read("Zipcode", in);
            return new Address(name, street, city, state, zip);
        }

        /* Read a Product.
        @param in the input stream from which to read the Product. */
        static Product readProduct(Scanner in) 
        {
            Product product = null;
            System.out.println("Product description (empty line to terminate):");

            String description = in.nextLine();
            if (description.equals(""))
                return null;
            System.out.print("Price: ");
            double price = in.nextDouble();
            in.nextLine();
            product = new Product(description, price);
            return product;
        }

        // @param args the command line arguments.
        public static void main(String[] args) 
        {
            System.out.println("This program reads an invoice (name, address, products purchased)");
            System.out.println("and prints an invoice.\n");
            Scanner in = new Scanner(System.in);
            Address address;
            while ((address = readAddress(in)) != null) 
            {
                Invoice invoice = new Invoice(address);
                Product product;
                while ((product = readProduct(in)) != null) 
                {
                    System.out.println("Quantity: ");
                    int quantity = in.nextInt();
                    in.nextLine();
                    invoice.add(product, quantity);
                }
                System.out.println(invoice.format());
            }
        }
    }
}