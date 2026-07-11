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
        
        for(int i =0; i<r; i++){
            
            int max =m[i][0];
            int min = m[i][0];
            
            for(int j =1; j<c; j++){
            if(m[i][j] > max){
                max = m[i][j];
            }
            if(m[i][j] < min){
                min = m[i][j];
            }
            
            }
            System.out.println("Row " + (i + 1) +
                    ": Maximum = " + max +
                    ", Minimum = " + min);
            
        }
        
        
        }
    }
