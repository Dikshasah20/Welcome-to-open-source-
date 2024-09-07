import java.util.*;
public class HW12 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       /* int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int average = (a + b + c) / 3;
        System.out.println("average is:" + average);
         */

       /* int side = sc.nextInt();
        int area = (side * side);

        System.out.println("Area of square is: " + area);
        */

       /*  float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();

        float total = (pencil + pen + eraser);
        System.out.println("bill is :" + total);

        // for advance
        float newTotal = total + (0.18f * total);
        System.out.println("bill with 18% tax is: " + newTotal);
       */


       byte b = 4;
       char c ='a';
       short s = 512;
       int i = 1000;
       float f = 3.14f;
       double d = 99.9954;

       double result = (f * b) + (i % c) - (d * s);// -51155.0847
       System.out.println(result);
    }
    
}
