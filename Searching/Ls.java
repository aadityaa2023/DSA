
class Ls {
    public static void main(String[] args) {
        int arr [] = {2 , 3, 5, 6, 8, 9, 45};
        int target = 6;
        int ans = ls(arr, target);
        System.out.println(ans);

    }
    static int ls(int arr[], int target){
        for(int element : arr){
            if (element == target){
                return 1;
            }
        }
        return -1;
        
    }
}
