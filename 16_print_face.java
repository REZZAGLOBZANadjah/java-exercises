/*16. Write a Java program to print a face. Go to the editor
Expected Output
+"""""+                                                 
[| o o |]                                                
 |  ^  |                                                 
 | '-' |                                                 
 +-----+
*/
//Solution 16
public class Main {
 public static void main(String[] args) {
System.out.println(" +\"\"\"\"\"+ ");
System.out.println("[| o o |] ");                                                 
System.out.println(" |  ^  |   ");                                                
System.out.println(" | '-' |   ");                                                
System.out.println(" +-----+");
}
}
//other solution 16
/*public class Main {
 public static void main(String[] args) {
  String[] arra = new String[5];
  arra[0] = " +\"\"\"\"\"+ ";
  arra[1] = "[| o o |]";
  arra[2] = " |  ^  |";
  arra[3] = " | '-' |";
  arra[4] = " +-----+";

  for (int i = 0; i < 5; i++) {
   System.out.println(arra[i]);
  }

 }

}
*/
