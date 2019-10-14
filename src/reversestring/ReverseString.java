package reversestring;
import java.util.Scanner;

/**
 *
 * @author kasia
 * @version 1.1
 */
public class ReverseString {
    
    public static String reverseString(String stringToReverse) {
	String reversedString = new StringBuilder(stringToReverse).reverse().toString();
	return reversedString;
    }
            
    public static void main(String[] args) {
	boolean running = true;
	while(running) {
	    System.out.println("Enter string to reverse or write quite to exit");
	    Scanner scanner = new Scanner(System.in);
	    String userString = scanner.nextLine();
	    
	    
	    if (userString.equals("quit")) {
		running = false;
	    } else {
		System.out.println(reverseString(userString));
	    }
	}
    }
}
