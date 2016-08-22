package Problem31;
public class Solution {
    public void nextPermutation(int[] nums) {
        int len = nums.length;
        int temp = 0;
        int i = 0;
        int j = 0;
        int k = 0;
        for(i=len-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                for(k=len-1;k>i;k--){
                    if(nums[i]<nums[k]){
                        temp = nums[i];
                        nums[i] = nums[k];
                        nums[k] = temp;
                        break;
                    }
                }
                for(j=i+1;j<=(i+len)/2;j++){
                    temp = nums[j];
                    nums[j] = nums[len+i-j];
                    nums[len+i-j] = temp;
                }
                break;
            }
        }
        if(i<0){
            for(i=0;i<len/2;i++){
                temp = nums[i];
                nums[i] = nums[len-1-i];
                nums[len-1-i] = temp;
            }
        }
    }
    public static void main(String[] args){
    	int[] nums = {3,2,1};
    	Solution test = new Solution();
    	test.nextPermutation(nums);
    	System.out.println(nums[0]+" "+nums[1]+" "+nums[2]);
    }
}