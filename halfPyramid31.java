public class halfPyramid31 {
    public static void main(String[] args) {
        /* 
        int n = 5;
        for( int i = 1; i<= n; i++){
            for(int num = 1; num<= i; num++){
                System.out.print(num);
            }
            System.out.println();
        }
            */
    // characater pattern
    int n= 5;
    char ch = 'A';
    for(int i =1 ; i<=n; i++){
        for(int j = 1; j<=i; j++){
            System.out.print(ch);
            ch++;
        }
        System.out.println();
    }
    
    }
}
