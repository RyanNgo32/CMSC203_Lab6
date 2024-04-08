/*
 * Class: CMSC203 32689
 * Instructor:Professor Grinberg
 * Lab 6 
 * Description: (subclass of bankaccount that is a specialized account called savings account in which it adds monthly interest to deposit 2.5%, and has unique account numbers for the savings account )
 * Due: 4/8/2024
 * Platform/compiler:Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Ryan Ngo
*/
public class SavingsAccount extends BankAccount 
{
	private double rate = .025; //instance variable called rate
	
	private int savingsNumber = 0; //instance variable savingsNumber
	
	private String accountNumber; //instance variable accountNumber 
	
	public SavingsAccount(String originalSavingsAccount, double balance)
	{
		super(originalSavingsAccount, balance); //calls superclass constructor
		accountNumber = super.getAccountNumber() + "-" + savingsNumber; // initialize accountNumber to current value in superclass then concatenates with hyphen and savingsNumber
	}
	public void postInterest()
	{
		double monthlyRate = ((rate * getBalance())/12); // takes get balance multiplies by interest rate and then divides by 12 since its annually
		
		deposit(monthlyRate); //call deposit method and deposits monthly rate into account
	}
	
	public String getAccountNumber() //overridden getAccountNumber method
	{
		return accountNumber;
	}
	
	public SavingsAccount(SavingsAccount originalSavingsAccount, double balance) //copy constructor 
	{
		super(originalSavingsAccount, balance); //calls super class copy constructor 
		
		savingsNumber++; // adds 1 so that it is one more than the original savings account 
		
		accountNumber = super.getAccountNumber() + "-" + savingsNumber; //set accounts number by returning current account number and concatenating hypen and saving number
		
		
	}
	
}
