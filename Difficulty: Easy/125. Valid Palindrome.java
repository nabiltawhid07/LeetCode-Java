class Solution {
    public boolean isPalindrome(String s) {
      boolean flag=false;
      String empty="";
      for(int i=0; i<s.length();i++){
        if( (s.charAt(i)>='0' && s.charAt(i)<='9') || (s.charAt(i)>='A' && s.charAt(i)<='Z') || (s.charAt(i)>='a' && s.charAt(i)<='z') ){  //ASCII (48-57),(65-90),(97-122) er jaygay
          empty=empty+s.charAt(i);  //cleaning the string                                                                                  //'0','9','A','Z','a','z' erokom literal
        }                                                                                                                                  //characters use kora jabe.
      }
      String cleaned=empty.toLowerCase();  //converting all the characters to lowercase
      if(cleaned.equals("")){  //for edge case
        flag=true;
      }
      else{   //for general case
    int m=cleaned.length()-1;
    for(int j=0;j<cleaned.length();j++){
        flag=false;
     int n=m-j;
     if(j>=n){
        flag=true;
        break;
     }
     else if(cleaned.charAt(j)==cleaned.charAt(n)){
        flag=true;
        continue;
     }
     else{
        flag=false;
        break;
     }
    }
      }
    return flag;
}
} 
