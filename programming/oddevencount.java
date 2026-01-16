import java.util.*;

class Main {
    public static void main(String[] args) {
    int []arr = {1, 2, 3, 4, 5, 6, 7};
    
    int ecount= 0;
    int ocount= 0;
    for (int i =0; i <arr.length; i++){
        if (arr[i] % 2 ==0){
            ecount++;
        }
        else {
            ocount++;
        }
        
    }
    System.out.println("Even count is "+ ecount);
    System.out.println("Odd count is "+ocount);        
        
    }
}
