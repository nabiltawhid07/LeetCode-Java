class Solution {
    public int missingNumber(int[] nums) {
        int sum1=0;
        int sum2=0;
        for(int i=0;i<=nums.length;i++){
          sum1=sum1+i;      //required sum of all elements
        }
        for(int j=0;j<nums.length;j++){
          sum2=sum2+nums[j];    //sum of the elements of the existing array
        }
        int missing=sum1-sum2;   //missing number
        return missing;
    }
}

//More efficient solution
// should have used data type "long" instead of "int"....just in case nums array is very big

// another approach would be to use a boolean array-->jei jei element pabo, shegula true hoye jabe, jeta false theke jabe shetai missing number
// can see ChatGPT for that approach
