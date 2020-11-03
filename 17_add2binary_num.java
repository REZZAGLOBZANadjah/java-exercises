/*17. Write a Java program to add two binary numbers. Go to the editor
Input Data:
Input first binary number: 10
Input second binary number: 11
Expected Output
Sum of two binary numbers: 101
*/
//solution 17
import java.util.Scanner;
public class Main{
  public static void main(String args[]){
    long binary1,binary2;
    int i=0,reminder=0;
    int[] sum=new int[20];
    Scanner input =new Scanner(System.in);
    System.out.print("enter fist binary number");
    binary1=input.nextLong();
    System.out.print("enter second binary number");
    binary2=input.nextLong();
while(binary1 !=0|| binary2!=0)
{
  sum[i++]=(int)((binary1%10+binary2%10+reminder)%2);
  reminder=(int)((binary1%10+binary2%10+reminder)/2);
  binary1=binary1/10;
  binary2=binary2/10;
}
 if(reminder!=0) {
   sum[i++]=reminder;
 }  
 --i;
   System.out.print("Sum of two binary numbers: ");

 while(i>=0){
   System.out.print(""+sum[i--]);
 }
  }
}
