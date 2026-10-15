class Solution {
    public int[] plusOne(int[] digits) {
        long num=0;
        long FinalNum=0;
        for(int i=0;i<digits.length;i++){
          num=(num*10)+digits[i];  //converting the array into numbers([1,2,3] into 123)
        }
        FinalNum=num+1;  //number+1
        int count=0;
        long temp=FinalNum;
        while(temp!=0){
            count++;    //counting length of the number
            temp=temp/10;
        }
        long []arr=new long[count];
        long remainder=0;
        int j=count;
        while(FinalNum!=0){
            remainder=FinalNum%10;
            arr[j-1]=remainder;   //converting the final number into array(124 into [1,2,4])
            FinalNum=FinalNum/10;
            j--;
        }
        return arr;
    }
}

//This logic dosen't work for large numbers such as if digits=[3,0,0,0,0,0,0,0,0,0]
//then the number will be 3000000000, but 'int' can't handle that much large number...
//What if we use 'long' data type?
//then still for larger numbers the code will not work, 
//so, we have to change the logic and approach, the changed code is provided in the latest commit
