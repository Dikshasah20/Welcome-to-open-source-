import java.util.*;// package

public class input6 {
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);// input

    //   String input = sc.next();// obj function k help se input ko capture krti hai       // next sirf space aane tk print karata hai ushe baad nhi
    //   System.out.println(input);

      String name = sc.nextLine(); // jb spaces bhi print karana hota hai
      System.out.println(name);

      int number = sc.nextInt();
      System.out.println(number);

      float price = sc.nextFloat();
      System.out.println(price);

      sc.close(); 
    }
}
