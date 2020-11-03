/*18. Write a Java program to multiply two binary numbers. Go to the editor
Input Data:
Input the first binary number: 10
Input the second binary number: 11
Expected Output
Product of two binary numbers: 110
*/
//Solution 18
https://www.w3resource.com/java-exercises/basic/java-basic-exercise-18.php
import java.util.Scanner;
public class Main{
  public static void main(String args[]){
    long binary1,binary2, multiplay=0;
    int digit,factor=1;
    // Multplication of tow binary numbers
        Scanner input=new Scanner(System.in);
    System.out.print("enter first binary number...");
     binary1=input.nextLong();
    System.out.print("enter second binary number...");
     binary2=input.nextLong();
    while (binary2!=0){
      digit=(int)(binary2%10);
      if (digit!=0){
        binary1=binary1*factor;
        multiplay=binaryproduct((int)binary1,(int)multiplay);
      }else{
        binary1=binary1*factor;
      }
      binary2=binary2/10;
      factor=10;
    }
    System.out.print("multiplication of tow binary numbers = "+multiplay);
  }
  static int binaryproduct(int binary1,int binary2){
    int []sum= new int[20] ;
    int i=0,remainder=0,binaryproduct=0;
    while(binary1!=0||binary2!=0){
      sum[i++]=((binary1 %10 +binary2 % 10 )%2);
      remainder =((binary1 %10 +binary2 % 10 )/2);
      binary1=binary1/10;
      binary2=binary2/10;
    }
    if (remainder !=0){
      sum[i++]=remainder;
    }
--i;
while(i>=0){
 binaryproduct=binaryproduct*10+sum[i--]; 
}
    System.out.print("binaryproduct = "+binaryproduct);
    
  
  return binaryproduct;
}
  
}
