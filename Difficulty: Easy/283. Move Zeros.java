class Solution {
    public void moveZeroes(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count++;
            }
        }
       checkArray(count,nums);  //age check kori shob zeroes already end of the array te ase kina(sorted kina)
    }
    public int[] sort(int[] nums){
        for(int k=0;k<nums.length-1;k++){
            if(nums[k]==0){
                int temp=nums[k+1];
                nums[k+1]=nums[k];
                nums[k]=temp;
            }
            else if(nums[k]==0 && nums[k+1]==0){
                continue;
            }
            else{
                continue;
            }
        }
        return nums;
    }
    public void checkArray(int count,int[] nums){
  boolean flag=false;
        for(int j=nums.length-1;j>=(nums.length-count);j--){
            flag=false;
            if(nums[j]!=0){
            flag=true;
            break;
            }          //flag==false means array is now sorted, this is the required array..(no need to return the array)
        }
        if(flag==true){   //array is not sorted, so sort method is called inside it.
            sort(nums);
            checkArray(count,nums);  //sort ekbar korlam, so abar check kori sorted kina
        }
    }
}

