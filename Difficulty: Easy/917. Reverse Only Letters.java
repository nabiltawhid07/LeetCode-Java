class Solution {
    public String reverseOnlyLetters(String s) {
        int pointer2=s.length();
        String empty="";
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>=97 && s.charAt(i)<=122) || (s.charAt(i)>=65 && s.charAt(i)<=90) ){
                for(int j=pointer2-1;j>=0;j--){
                     if((s.charAt(j)>=97 && s.charAt(j)<=122) || (s.charAt(j)>=65 && s.charAt(j)<=90) ){
                     empty=empty+s.charAt(j);
                     pointer2=j;
                     break;
                    }
                }
            }
            else{
                empty=empty+s.charAt(i);
            }
        }
        return empty;
    }
}

//Similar to reversing vowels in a string problem
// interesting problem..
// need to make it more efficient
