import java.util.*;
public class typePromotion11 {
    public static void main(String args[]){
        char a ='a';
        char b = 'b';
        System.out.println((int)(b));//98
        System.out.println((int)(a));//97
        System.out.println(a);//a , type promotion happen only with expression
        System.out.println(b-a);//1

        int p = 10;
        float q = 20.9f;
        long r = 25;
        double s = 55;
        double ans = p + q + r + s;
        System.out.println(ans);//110.900

    }
    
}
