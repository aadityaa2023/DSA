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
            int rowsum =0;
            for(int j =0; j<c; j++){
                rowsum = rowsum + m[i][j];
                
            }
            System.out.println("Row " + (i + 1) + " = " + rowsum);

        }
        
        for(int j =0; j<r; j++){
            int colsum =0;
            for(int i =0; i<c; i++){
                colsum = colsum + m[i][j];
                
            }
            System.out.println("Col " + (j + 1) + " = " + colsum);

        }
        
        }
    }
