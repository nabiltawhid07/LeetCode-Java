class Solution {
    public int removeElement(int[] nums, int val) {
        int pointer=0;
        int temp=0;
        int k=0;
        boolean flag=false;
        for(int z=0;z<nums.length;z++){
            flag=false;
            if(nums[z]==val){
                flag=true;   // true: nums er moddhe val ase
                break;       //false: nums er moddhe val nai
            }
        }
        if(flag==false){
            k=nums.length;
        }
        else{
        while(pointer!=nums.length-1){
            for(int i=0;i<nums.length;i++){
                if(nums[i]==val){
                    pointer=i;
                    for(int j=i+1;j<nums.length;j++){
                        if(nums[j]!=val){
                         temp=nums[j];
                         nums[j]=nums[pointer];
                         nums[pointer]=temp;
                        }
                    }
                }
            }        
    }
    for(int q=0;q<nums.length;q++){
        if(nums[q]!=val){
            k++;
        }
    }
        }
    return k;
}
}

//slightly efficient version
