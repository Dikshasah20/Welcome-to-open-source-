import java.util.*;
public class conversion9 {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int a = 25;
        long b = a;
        System.out.println(b);//25 is called widening,implicit,type conversion
        // but conversion from long to int can't posiible, this is called lossy conversion

        float number = sc.nextInt();
        System.out.println(number);//5.0
    }
    
}
