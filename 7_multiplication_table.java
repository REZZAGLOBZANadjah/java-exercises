/*7. Write a Java program that takes a number as input and prints its multiplication table upto 10. Go to the editor
Test Data:
Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80
*/
//solution 07 
/*import java.util.Scanner;
public class Main{
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    System.out.print("enter a number!");
    int num=input.nextInt();
    System.out.println(
                        num+" * 1 = " + num*1 +"\n"
                       +num+" * 2 = " + num*2 +"\n"
                       +num+" * 3 = " + num*3 +"\n"
                       +num+" * 4 = " + num*4 +"\n"
                       +num+" * 5 = " + num*5 +"\n"
                       +num+" * 6 = " + num*6 +"\n"
                       +num+" * 7 = " + num*7 +"\n"
                       +num+" * 8 = " + num*8 +"\n"
                       +num+" * 9 = " + num*9 +"\n"
                       +num+" * 10 = " + num*10 +"\n");
    
  }}
  */
//other solution 
import java.util.Scanner;
public class Main{
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    System.out.print("enter a number!");
    int num=input.nextInt();
    for(int i=1 ; i<=20; i++){
       for(int j=1 ; j<=10;j++){
          System.out.println( i+" *" + j+" = " + i*j );}
      System.out.println("-----------");
    }}}
