/*6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers. Go to the editor
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5
*/
//solution 06
import java.util.Scanner;
public class Main{
  public static void main(String args[]){
    Scanner input=new Scanner(System.in);
    System.out.print("enter the first number");
    int num1= input.nextInt();
    System.out.print("enter the second number");
int num2=input.nextInt();
int sum=num1+num2;
int min=num1-num2;
int mult =num1*num2;
int div =num1/num2; 
int mod =num1%num2;
System.out.println(num1 +"+"+num2+"="+sum);
System.out.println(num1 +"-"+num2+"="+min);
System.out.println(num1 +"*"+num2+"="+mult);
System.out.println(num1 +"/"+num2+"="+div);
System.out.println(num1 +"%"+num2+"="+mod);
}}
