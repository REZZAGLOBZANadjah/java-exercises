/*12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers. Go to the editor
*/
//solution 12
import java.util.Scanner;
public class Main {
 public static void main(String[] args) {
  Scanner io = new Scanner(System.in);
  System.out.println("Input the first number");
  int num1 = io.nextInt();
  System.out.println("Input the second number");
  int num2 = io.nextInt();
  System.out.println("Input the third number");
  int num3 = io.nextInt();
  float avg =(num1+num2+num3)/3;
  System.out.println("Avrege is = "+avg);
 }
}
