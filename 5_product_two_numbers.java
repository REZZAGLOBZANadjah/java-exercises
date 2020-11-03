/*5. Write a Java program that takes two numbers as input and display the product of two numbers. Go to the editor
Test Data:
Input first number: 25
Input second number: 5
Expected Output :
25 x 5 = 125
*/
//Solution 05
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
Scanner input =new Scanner(System.in);
System.out.print("enter the first number");
int num1= input.nextInt();
System.out.print("enter the second number");
int num2=input.nextInt();
int mult=num1*num2;
System.out.print("multiplication of "+num1+"*"+num2+"="+mult);
 
  }
}
