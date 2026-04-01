
class Main {
    
    public static void main(String[] args) {
        
        int []nums = {5, -4, -2, 6, -1};
        int res  =maxSum(nums);
        System.out.println("The max sum is " + res);
        

    }
    public static int maxSum(int []nums){
        int currsum= 0;
        int maxsum =0;
        for(int i =0; i<nums.length; i++){
            currsum = currsum + nums[i];
            
            if (currsum > maxsum ){
                maxsum = currsum;
                
            }
            if(currsum < 0){
                currsum =0;
            }
        }
        return maxsum;
        
    }
}
