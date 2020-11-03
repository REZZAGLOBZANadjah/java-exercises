/* 34. Write a Java program to compute the area of a hexagon. Go to the editor
Area of a hexagon = (6 * s^2)/(4*tan(π/6))
where s is the length of a side
Input Data:
Input the length of a side of the hexagon: 6
Expected Output
The area of the hexagon is: 93.53074360871938
*/
//Solution 34
import java.util.Scanner;
public class Main{
  public static void main(String args[]){
   double lengthSize;
  Scanner input =new Scanner(System.in);
  System.out.print("enter   the length of a side of hexagon  ");
   lengthSize=input.nextDouble();
double area ;
area= (6 * (lengthSize)*(lengthSize))/(4*Math.tan(Math.PI/6));
  System.out.print("  hexagon area "+area);
   
  } 
}
