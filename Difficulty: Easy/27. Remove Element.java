class Solution {
    public int removeElement(int[] nums, int val) {
        int pointer=0;
        boolean flag2=false;
        for(int p=0;p<nums.length;p++){ //for test case; nums=[3,3], val=5
            if(nums[p]==val){
                flag2=true;
                break;
            }
        }
        if(flag2==false){
            int k=nums.length;
            return k;
        }
        if(nums.length==0){  //for test case; nums=[], val=0;
            int k=0;
            return k;
        }
        else{            //for general test cases
        while(pointer!=(nums.length-1)){
        for(int i=0;i<nums.length;i++){
            boolean flag=false;
            if(nums[i]==val){
                pointer=i;
                for(int j=i;j<nums.length;j++){
                    if(nums[j]==val){
                        pointer=j;
                        continue;
                    }
                    else{
                        int temp=nums[pointer];
                        nums[pointer]=nums[j];
                        nums[j]=temp;
                        flag=true;
                        break;
                    }
                }
            }
            else{
                continue;
            }
            if(flag==true){
                break;
            }
        }
        }
        }
    int k=0;
    for(int m=0;m<nums.length;m++){
        if(nums[m]!=val){
          k++;
        }
    }
      return k;
}
}
