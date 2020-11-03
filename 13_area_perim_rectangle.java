/*13. Write a Java program to print the area and perimeter of a rectangle. Go to the editor
Test Data:
Width = 5.5 Height = 8.5
Expected Output
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20
*/
//Solution 13
import java.util.Scanner;
public class Main {
 public static void main(String[] args) {
  Scanner io = new Scanner(System.in);
  System.out.println("Input the first number");
  float width = io.nextFloat();
  System.out.println("Input the second number");
  float height = io.nextFloat();
  float Area =width*height;
  float Perimeter  =(width+height)*2;
  System.out.println("Area is = "+Area+"\n Perimeter is ="+Perimeter);
 }
}
