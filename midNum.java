import java.util.Scanner;
public class Proj1 {
    public static void main(String[] args) {
    
     int num1,num2,num3;
     
     Scanner input = new Scanner(System.in);
     
     System.out.print("Enter 3 odd Number: \t\t");
          num1 = input.nextInt();
          
          System.out.print("The middle number is: \t\t" + Middle(num1));
   
 }
   public static int Middle(int mid_digit) {
     int total_digits = (int)Math.log10(mid_digit) + 1;  
     mid_digit = (int)(mid_digit / Math.pow(10, total_digits / 2)) % 10;  
     return mid_digit ;  
   }
}
