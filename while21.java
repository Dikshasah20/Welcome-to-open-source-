import java.util.*;
public class while21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        int counter = 0;
        while(counter < 100){
            System.out.println("hello world");
            counter++;
        
        }
        System.out.println("printed HW 100x");
    
        */
         /* int counter = 1;
         while(counter <= 10){
            System.out.print(counter+ " ");
            counter++;
         }
         System.out.println();
         */
        int counter = 0;
        System.out.println("enter number of terms");
        int n = sc.nextInt();

        while( counter <= n){
            System.out.print(counter + " ");
            counter++;
        }
        System.out.println();
    }
}
