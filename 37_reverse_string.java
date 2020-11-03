/*37. Write a Java program to reverse a string.
Input Data:
Input a string: The quick brown fox
Expected Output
Reverse string: xof nworb kciuq ehT
*/
//solution
import java.util.Scanner;
public class Main {
  public static void main(String args []){
    System.out.print("enter  a string");
    Scanner input =new Scanner(System.in);
    char[] letters =input.nextLine().toCharArray();
    System.out.print("Reverse string: ");
    for(int i=letters.length -1;i>=0;i--){
          System.out.print(letters[i]);

      
    }
  }
}
