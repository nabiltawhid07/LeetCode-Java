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

// The logic of this code is okay, but it has a Time Complexity of O(n^2), dosen't work for large arrays...
// Now if i want to make the code more optimized or efficient, to make the time complexity O(n), i'll need to use Data Structures(HashSet)...
// So i'll come back again to this problem after learning DSA.
