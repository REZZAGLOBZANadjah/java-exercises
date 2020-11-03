/*15. Write a Java program to swap two variables.
*/ 
//Solution 15
import java.util.Scanner;
public class Main {
 public static void main(String[] args) {
   Scanner input= new Scanner(System.in);
System.out.println("enter first number");
   int num1=input.nextInt();
System.out.println("enter secone number");
   int num2=input.nextInt();
   System.out.println("first number ="+num1+"  secone number ="+num2);

int swap=num1;
num1=num2;
num2=swap;
System.out.print("swapped numbers "+num1+"    "+num2);
 }
}
