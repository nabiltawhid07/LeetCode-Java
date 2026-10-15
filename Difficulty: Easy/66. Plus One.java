class Solution {
    public int[] plusOne(int[] digits) {
        boolean flag=false;
        for(int i=0;i<digits.length;i++){  //checking if all elements are 9([9,9,9,9])
            flag=false;
            if(digits[i]==9){
                flag=true;
            }
            else{
              break;
            }
        }
        if(flag==true){
            int []newDigits=new int[digits.length+1];  //if all elements are 9([9,9,9,9]),then create new array whose size is one larger([1,0,0,0,0])
            newDigits[0]=1;
            digits=newDigits;
        }
        else{   //flag==false; and it's for general case
            for(int j=digits.length-1;j>=0;j--){
                if(digits[j]==9){
                    digits[j]=0;
                    if(digits[j-1]==9){  //([2,9,9] theke [3,0,0])
                        continue;
                    }
                    else{
                        digits[j-1]=digits[j-1]+1;  //([1,2,9] theke [1,3,0])
                        break;
                    }
                }
                else{  //([1,2,3] theke ([1,2,4]))
                    digits[j]=digits[j]+1;
                    break;
                }
            }
        }
        return digits;
    }
}

// This code is more efficient than the previous version
