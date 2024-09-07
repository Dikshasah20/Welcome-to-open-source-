import java.util.*;
public class reverseno24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number to be reverse");
        int n = sc.nextInt();
/* 
        while(n>0){
            int lastDigit = n % 10;
            System.out.print(lastDigit);
            n = n / 10;
        }
         System.out.println();
         */

//  OR  
         int reverse = 0;
         while(n > 0){
            int lastDigit = n % 10;
            reverse = reverse * 10 + lastDigit;
            n = n/10;

         }
         System.out.println(reverse);
         
    }
    
}
