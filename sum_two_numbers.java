/*2. Write a Java program to print the sum of two numbers. 
Test Data:
74 + 36
Expected Output :
110
*/
//Solution 02
/*public class Main {
  public static void main(String[] args) {
	int x=74;
	int y=+ 36;
	System.out.println(" Test Data:\n"+x+ "+"+y );
	int Output =x+y;
 	System.out.println("Expected Output :\n " +Output);
}
}
*/
//Other solution
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    	Scanner input = new Scanner (System.in);
        System.out.print("Input the first number: ");
    	int num1 = input.nextInt();
    	System.out.print("Input the second number: ");
    	int num2=input.nextInt();
    	int Output =num1+num2;
    	System.out.println("Expected Output :\n " +Output);
}
}
