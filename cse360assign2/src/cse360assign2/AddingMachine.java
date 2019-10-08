/****************************************************************
 * Sergio Barraza
 * ASU Hybrid CSE360-70642
 * Assignment 2
 * 
 * Description: AddingMachine class will allow a user to enter
 * numbers and operations to either add or subtract. The class
 * will also track every number and operation used consecutively
 * in a string.
 ****************************************************************/

package cse360assign2;

public class AddingMachine {

	private int total;
	private String transactionHistory = "0";
	
	// Default Constructor.
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	
	// Returns the total of all user inputs.
	public int getTotal () {
		return this.total;
	}
	
	// Adds the values and adds to the user input history.
	public void add (int value) {
		this.total = this.total + value;
		this.transactionHistory = this.transactionHistory + " + " + value;
	}
	
	// Subtracts the values and adds to the user input history.
	public void subtract (int value) {
		this.total = this.total - value;
		this.transactionHistory = this.transactionHistory + " - " + value;
	}
	
	// Returns a string of the user input (numbers and operations).
	public String toString () {
		return this.transactionHistory;
	}
	
	// Clears all to default.
	public void clear() {
		this.total = 0;
		this.transactionHistory = "0";
		
	}
}

