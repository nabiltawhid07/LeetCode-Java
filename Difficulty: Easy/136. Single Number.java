class Solution {
    public int singleNumber(int[] nums) {
        boolean flag=false;
        int required=0;
        int count=0;
        int pointer=0;
        while(flag==false){
             for(int i=0;i<nums.length;i++){
                if(nums[i]==nums[pointer]){
                    count++;
                }
             }
             if(count==2){
                flag=false;
                pointer++;
             }
             else if(count==1){
                flag=true;
                required=nums[pointer];
                break;
             }
             count=0;
        }
        return required;
        }
        
    }
//Need to make linear run time complexity
