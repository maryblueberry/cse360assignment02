package cse360assignment02;
	
/**
	 * 
	 * The Adding Machine program will do a quick calculation- 
	 * add and/or subtract to return the total integer value 
	 * while keeping a history of the transactions made and clearing the memory.
	 * 
	 * 
	 * @author Maribel Rando 
	 * @version 1.0
	 * @since 2020-05-10 
	 * 
	 */

public class AddingMachine {

	  private int total;
	  private String transactions;
	  
	  /** 
	   *  This method is used to implement the variables total and transactions 
	   *  
	   */
	  public AddingMachine () 
	  {
	    total = 0;  
	    transactions = "0";
	  }
	  
	  /**
	   * This method is used to get the total amount  
	   * @return total
	   */
	  public int getTotal () 
	  {
	    return total;
	  }
	  
	  /** 
	  * This method is used to conduct addition 
	  * @param value This is the first parameter to the add in order to get the total
	  * 
	  */
	  public void add (int value) 
	  {
		total = total + value;
		transactions = transactions + " + " + value; 
	  }

	  /**
	  * This method is used to conduct subtraction with the value parameter 
	  * @param value This is the first parameter to the subtract in order to get the total
	  * 
	  */
	  public void subtract (int value) 
	  {
		total = total - value;
		transactions = transactions + " - " + value;
	  }

	  /**
	  * This method is used to return and display the history
	  * @return history
	  */
	  public String toString () 
	  {
	    return transactions;
	  }
	  
	  /** 
	  * This method is used to clear the memory
	  * 
	  */
	  public void clear() 
	  {
		total = 0;
		transactions = "0";
	  }	 
}
