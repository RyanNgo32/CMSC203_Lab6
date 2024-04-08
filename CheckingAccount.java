/*
 * Class: CMSC203  32689
 * Instructor:Professor Grinberg
 * Lab 6
 * Description: (Subclass of bank account that is a specialized account called checking account that adds a fee to amount when you withdraw )
 * Due: 4/8/2024
 * Platform/compiler:Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Ryan Ngo
*/
public class CheckingAccount extends BankAccount
{
	final static double FEE = .15; //sets Fee 
	
	
	public CheckingAccount(String name, double amount)
	{
		super(name, amount); //calls constructor from super class
		
		setAccountNumber(getAccountNumber() + "-10"); // takes current accountNumber and appends - 10 and then sets that as the new account number. 
		
	}
	
	public boolean withdraw(double amount)
	{
		
		double checkClearing = amount + FEE; //adds fee to amount for check clearing
		
		return super.withdraw(checkClearing); //returns superclass withdraw method
		
		
	}
	
}
