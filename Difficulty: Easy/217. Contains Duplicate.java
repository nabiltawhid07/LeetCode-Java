class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean flag=false;
        int i=0;
        int j=0;
        for(i=0;i<nums.length;i++){
            for(j=0;j<nums.length;j++){
                if(nums[i]==nums[j] && i!=j){
                    flag=true;
                    break;
                }
            }
        }
        return flag;
    }
}

//slightly improved version
