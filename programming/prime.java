import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the val of num: ");
        int num = sc.nextInt();
        boolean isPrime = true;
        
        if (num<=1){
            isPrime = true;
        }else{
            for(int i =2; i<num/2; i++){
                if (num % i ==0){
                    isPrime = false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println("Prime");
            
        }
        else{
            System.out.println("NOt Prime");
        }

    }
}
