import java.util.*;

class Main {
    public static void main(String[] args) {
        
        int n  =5;
        int m = 7;
        
        int temp = n;
        n = m;
        m = temp;
        
        System.out.println("The value of First number n is " + n);
        System.out.println("The value of First number m is " + m);
    }
}
