/*11. Write a Java program to print the area and perimeter of a circle. Go to the editor
Test Data:
Radius = 7.5
Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586
*/
//Solution 11
import java.util.Scanner;
public class Main {
 public static void main(String[] args) {
  Scanner io = new Scanner(System.in);
  System.out.println("Input the radius of the circle: ");
  double radius = io.nextDouble();
  double Perimeter,Area;
  Perimeter= (2 * radius * Math.PI);
  Area=(Math.PI * radius * radius);
  System.out.println("Perimeter is = " +Perimeter);
  System.out.println("Area is = " +Area);
 }
}
