import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the val of n: ");
        int n =sc.nextInt();
        
        int fact = 1;
        for ( int i =n; i>1; i--){
            
            fact = fact * i;
            
        }
        System.out.println("The factorial is "+ fact);
    }
}
