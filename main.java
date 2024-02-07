import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World!");

	Scanner scanner = new Scanner(System.in);
	  
	// Asks user for their name
	System.out.println("What is your name?: ");

	// User input for their name
	String userName = scanner.nextLine();

	System.out.println("Hello " + userName + "! I hope you like coding!");
		  
	// Ask user for the price of the item
	System.out.print("Enter the price of the item: ");
	
	// Read the user's input and store it in a variable
	double itemPrice = scanner.nextDouble();
	
	// Calculate the tax amount (13% of the item price)
	double totalPrice = itemPrice * 1.13;

	// Print the total price with tax
	System.out.println("The total price with tax is: $" + totalPrice);

	// Ask user for their age
	System.out.print("Enter your age: ");
	
	// Read the user's input and store it in a variable
	double userAge = scanner.nextDouble();

	int votingAge = 18;
	
	// Check if the user is old enough to vote
	if (userAge >= votingAge) {
	  System.out.println("You are old enough to vote!");
	} else {
	  System.out.println("Sorry, you are not old enough to vote.");
	}
  }
}
