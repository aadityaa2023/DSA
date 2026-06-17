import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        char []numbers = String.valueOf(n).toCharArray();
        int count = 0;
        for (char num: numbers){
            count = count + 1;
            
        }
        System.out.println(count);
    
    }
}
