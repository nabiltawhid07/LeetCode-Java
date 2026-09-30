class Solution {
    public int[] twoSum(int[] nums, int target) {
        boolean flag=false;
        int[] arr2=new int[2];
        for (int m = 0; m < nums.length; m++) {
            for (int n = 0; n < nums.length; n++) {
                if (m == n) {
                    continue;
                }
                if (nums[m] + nums[n] == target) {
                    arr2[0] = m;
                    arr2[1] = n;
                    flag=true;
                    break;
                }
            }
            if(flag==true){
                break;
            }
        }
         return arr2; 
    }
}
