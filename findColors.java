import java.util.Scanner;

public class FindColors {
 public static void main(String[] args) {
   
   Scanner ask = new Scanner(System.in);
   
   System.out.println("============================================");
   System.out.println("         FINDING COLOR USING FOR EACH LOOP");
   System.out.println("============================================");
   
   System.out.print("Type the main 8 colors do you want: \t");
   String typeColor = ask.nextLine();
   
   String[] colors = {"\n","White","\n","Black","\n","Yellow","\n","Green","\n","Red","\n","Blue","\n","Purple","\n","Brown"};
   
   
   
   for (String color: colors) {
     if (color.equalsIgnoreCase(typeColor)) {
       System.out.println("\nColor:\t" + color + "\tFound!");
       
     }
     else {
       System.out.print(color);
     }
 
   }
 }
}
