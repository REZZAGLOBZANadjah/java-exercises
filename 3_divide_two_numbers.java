/*3. Write a Java program to divide two numbers and print on the screen. 
Test Data :
50/3
Expected Output :
16
*/
//Solution 03
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("enter first number");
int num1= input.nextInt();
System.out.print("enter second number");
int num2= input.nextInt();
 System.out.print("Test Data :\n"+num1+"/"+num2+"\n");
 if(num2!=0){
 int div=num1 / num2;
 System.out.print("The division of a and b is:\n"+div);
 }
  }
}
