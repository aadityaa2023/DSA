import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int r = sc.nextInt();
        int c = sc.nextInt();
        
        int [][]m = new int[r][c];
        
        for(int i =0; i<r; i++){
            for(int j =0; j<c; j++){
                m[i][j] = sc.nextInt();
                
            }
        }
        int sum = 0;
        for(int i =0; i<r; i++){
            for(int j =0; j<c; j++){
                sum = sum + m[i][j];
                
            }
        }
        System.out.println("sum " + sum);

        
        }
    }
