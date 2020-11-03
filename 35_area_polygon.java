/*35. Write a Java program to compute the area of a polygon. Go to the editor
Area of a polygon = (n*s^2)/(4*tan(π/n))
where n is n-sided polygon and s is the length of a side
Input Data:
Input the number of sides on the polygon: 7
Input the length of one of the sides: 6
Expected Output
The area is: 130.82084798405722
*/
//Solution 35 
import java.util.Scanner;
public class Main{
  public static void main(String args[]){
   double lengthSize,n_sided_polygon,Area_polygon;
  Scanner input =new Scanner(System.in);
   System.out.print("enter the number sided polygon of hexagon  ");
    n_sided_polygon=input.nextDouble();
  System.out.print("enter   the length of a side of hexagon  ");
   lengthSize=input.nextDouble();
Area_polygon= (n_sided_polygon*(lengthSize*lengthSize))/(4*Math.tan(Math.PI/n_sided_polygon));
  System.out.print("The area is: "+Area_polygon);
  } 
}
