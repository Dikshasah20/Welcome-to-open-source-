import java.util.*;
public class HW29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
/*
        int number;
        int choice;
        int evenSum = 0;
        int oddSum =0;

        do{
            System.out.println("Enter the number");
            number = sc.nextInt();

            if(number % 2 == 0 ){
                evenSum += number;
            }else{
                oddSum += number;
            }
            System.out.println("Do you want to continue? press 1 or for no  press 0");
            choice = sc.nextInt();

        }while(choice == 1);
        System.out.println("Sum of even number:" + evenSum);
        System.out.println("Sum of odd number:" + oddSum);


 */
    /* int num;
     int fact = 1;

     System.out.println("Enter any positive integer");
     num = sc.nextInt();

     for( int i=1; i<=num; i++){
        fact *= i; 
     }
     System.out.println("Factorial:" + fact);
*/ 
    System.out.println("Enter the number");
    int n = sc.nextInt();
    for(int i = 1; i<=10; i++){
        System.out.println(n + "*" + i + " = " + n*i);
    }
    } 
    
    
}
