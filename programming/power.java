import java.util.*;
class Main {
    static double power(int n , int m ){
    
       double pow = 1;
       for (int i =0; i<Math.abs(m); i++){
           pow = pow * n ;
       }
       if (m < 0) return 1 / pow;
       return pow;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the val of N : ");
        int n = sc.nextInt();
        System.out.print("Enter the val of M: ");
        int m = sc.nextInt();
        
        
        double p = power(n, m);
        System.out.println("The val is "+p);
        
     
    }
}
