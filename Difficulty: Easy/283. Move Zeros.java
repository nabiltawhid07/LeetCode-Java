class Solution {
    public void moveZeroes(int[] nums) {
        int pointer=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[pointer];
                nums[pointer]=temp;
                pointer++;
            }
        }
    }
}

//Here, the pointer variable decides where the non-zero elements will be placed,
//initally the pointer is at index 0; so the first non zero element will be at index 0; we also swap the values with 0
//then after swapping, increase pointer by 1
//then again the next non-zero element will go to index 1 beacuse pointer is at index 1 now;
//example- [0,1,0,3,12]-->[1,0,0,3,12]-->[1,3,0,0,12]-->[1,3,12,0,0]

// This solution is even more efficient, Time Complexity O(n) and Auxilliary space O(1)
