package classAssignments;

import objectStack.ObjectStack;
import java.util.Scanner;

public class BackwardsString {
	public static void main(String[] args) {
		//I used a scanner to have the string be input by the user, I wasn't sure if this was what you wanted or not
		Scanner string = new Scanner(System.in);
		System.out.println("Enter a String: ");
		//Store the input as a string
		String userInput = string.nextLine();
		
		//Create a new ObjectStack
		ObjectStack stack = new ObjectStack();
		
		//Get each character from the inputed string and push them onto the stack
		for(int i = 0, n = userInput.length() ; i < n ; i++) {
			char c = userInput.charAt(i); 
			stack.push(c);
		}
		
		//Pop each character from the stack and print them, thus giving the string in reverse order
		while(!stack.isEmpty()) {
			char value = (char) stack.pop();
			System.out.printf("%c", value);
		}
	}
}
