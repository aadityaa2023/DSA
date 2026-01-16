import java.util.*;

class Main {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 15, 25};
        
        int sum =0;
        
        for(int i =0; i<arr.length; i++){
            sum = sum + arr[i];
            
        }
        System.out.println("Largest element is "+ sum);
        
    }
}
