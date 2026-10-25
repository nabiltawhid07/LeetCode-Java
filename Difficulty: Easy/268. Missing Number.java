class Solution {
    public int missingNumber(int[] nums) {
        boolean flag=false;
        int z=0;
        int i=0;
        while(z<=nums.length){
            for(i=0;i<nums.length;i++){
                flag=false;
                if(nums[i]==z){
                    flag=true;
                    break;
                }
            }
            if(flag==false){
                break;
            }
            z++;
        }
        return z;
    }
}
