import java.util.*;
public class continue27 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
         /*System.out.println("enter number");
       
       for(int i = 1; i<= 5 ; i++){
        if(i == 3){
            continue;
        }
        System.out.println(i);

       } 
        */
        do{
             System.out.println("enter number");

            int n = sc.nextInt();
            if(n % 10 == 0 ){
                continue;
            }
            System.out.println("number was :" + n);
        }while(true);
       

    }
}
