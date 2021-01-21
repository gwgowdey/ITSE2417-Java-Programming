// Student: Griffin Gowdey.
// Instructor: Daniel Goodman.
// Class Number: ITSE1479-86039.
// Class Name: Java Programming.
// Semester: Fall 2020.
// Lesson 8: Part 2.

/*
Assignment:
Implement the Coin class described:

public class CashRegister
{
	public static final double QUARTER_VALUE = 0.25;
	public static final double DIME_VALUE = 0.1;
	public static final double NICKEL_VALUE = 0.05;
	. . .
	public void receivePayment(int dollars, int quarters, 
	int dimes, int nickels, int pennies)
	. . .
}
			
There are really two concepts here: a cash register that holds coins 
and computes their total, and the values of individual coins. 
(For simplicity, we assume that the cash register only holds coins, not bills.
It makes sense to have a separate Coin class and have coins responsible for 
knowing their values:

public class Coin
{
. . .
public Coin(double aValue, String aName) { . . . }
public double getValue() { . . . }
. . .
} 

Then the CashRegister class can be simplified:

public class CashRegister
{
	. . .
	public void receivePayment(int coinCount, Coin coinType) { . . . }
	{
		payment = payment + coinCount * coinType.getValue();
	}
	. . .
}

Now the CashRegister class no longer needs to know anything 
about coin values.

Modify the CashRegister class so that coins can be added 
to the cash register, by supplying a method:

   void receivePayment(int coinCount, Coin coinType)
   
The caller needs to invoke this method multiple times, 
once for each type of coin that is present in the payment.
*/

// A coin with a monetary value.
public class Lesson8Part2
{
   private double value;
   private String name;

   /*
      Constructs a coin.
      @param aValue the monetary value of the coin.
      @param aName the name of the coin.
   */
   public Coin(double aValue, String aName)
   {
      value = aValue;
      name = aName;
   }

   /*
      Gets the coin value.
      @return the value.
   */
   public double getValue()
   {
      return value;
   }

   /*
      Gets the coin name.
      @return the name.
   */
   public String getName()
   {
      return name;
   }
}
}