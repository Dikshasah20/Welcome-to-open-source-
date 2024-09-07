import java.util.*;
public class break26 {
    public static void main(String[] args) {
        /*for( int i=0 ; i<=5 ; i++){
            if(i ==3){
                break;
            }
            System.out.println(i);
        }
        System.out.println("i an out of the loop");
        */
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter a number");
            int n = sc.nextInt();
            if(n % 10 == 0){
                break;
            }
            System.out.println(n);
        }while(true);
        


    }
}
