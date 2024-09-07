import java.util.*;
public class ternaryOp18 {
    public static void main(String[] args) {
       /*  int number = 5;

        String check = ((number%2) == 0 )? "even" : "odd";
        System.out.println(check);
        */
        Scanner sc = new Scanner(System.in);


        int marks = sc.nextInt();
        String test = (marks >= 33)? "PASS" : "FAIL";
        System.out.println(test);
    }
    
}
