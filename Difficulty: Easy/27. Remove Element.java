class Solution {
    public int removeElement(int[] nums, int val) {
        int k=0;
        int i=0;
        int j=0;
        boolean flag=false;
        int z=nums.length-1;
        for(int m=0;m<nums.length;m++){
            if(nums[m]!=val){
                k++;
            }
        }                             
        for(i=0;i<nums.length;i++){
            if(nums[i]==val){
                for(j=z;j>=0;j--){
                    if(i>=j){
                        flag=true;
                        break;
                    }
                    else if(nums[j]!=val){
                        nums[i]=nums[j];
                        z=j-1;;
                        break;
                    }
                }
                if(flag==true){
                    break;
                }
            }
        }
        return k;
    }
}

//using 2 pointers here, Right pointer(j) and Left pointer(i), 
//Left pointer will have a val value, Right pointer will have a non-val value,
//Right pointer will give it's value to Left pointer...and it will be continued using for loop,
//when Left and Right pointers meet or crosses each other, loop breaks,
