class Solution {
    public int lengthOfLastWord(String s) {
        int temp=0;
        for(int i=s.length()-1;i>=0;i--){  //for managing the spaces at the end of the string
            if(s.charAt(i)==' '){
                continue;
            }
            else{
                temp=i;
                break;
            }
        }
        int count=0;
        for(int j=temp;j>=0;j--){  //for counting the length of last word
            if(s.charAt(j)==' '){
                break;
            }
            else{
                count++;
            }
        }
        return count;
    }
}
