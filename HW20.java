import java.util.*;
public class HW20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        int n = sc.nextInt();

        if(n > 0){
            System.out.println("Positive");
        }else{
            System.out.println("Negative");
            
        }
        */
        /*  double temp = 103.5;

        if(temp > 100 ){
            System.out.println("fever");
        }else{
            System.out.println("Normal");
        }*/


        /* 
        System.out.println("Enter week from (1-7):");
        int week = sc.nextInt();

        switch(week){
            case 1:
            System.out.println("Monday");
            break;

            case 2:
            System.out.println("Tuesday");
            break;

            case 3:
            System.out.println("Wednesday");
            break;

            case 4:
            System.out.println("Thusday");
            break;

            case 5:
            System.out.println("Friday");
            break;

            case 6:
            System.out.println("saturday");
            break;

            case 7:
            System.out.println("sunday");
            break;

            default:
               System.out.println("Invalid input");

            

        }
        */

        System.out.println("Input the year:");
        int year = sc.nextInt();


        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = ((year % 100 == 0) && (year % 400 == 0));

        if (x && (y || z)){
            System.out.println(year + "is a leap year");
        }else{
            System.out.println(year + " is not a leap year");
        }



    }
}
