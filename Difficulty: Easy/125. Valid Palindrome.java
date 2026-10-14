class Solution {
    public boolean isPalindrome(String s) {
        int count=0;
        boolean flag=false;
        String empty="";
        String empty2="";
        String New="";
        String New2="";
        if(  (s.equals(" ")) || (s.length()==1)  ) {
            flag=true;
        }
        else{
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>=97 && s.charAt(i)<=122)  || (s.charAt(i)>=65 && s.charAt(i)<=90)){     //(int)
            empty=empty+s.charAt(i);
            }
        }
        empty2=empty2+empty.toLowerCase();
        if((empty2.equals(" ")) || (empty2.length()==1)){
            flag=true;
        }
        else{
        count=empty2.length();
    if(count%2!=0){
        for(int m=empty2.length()-1;m>=count-(count/2);m--){
         New=New+empty2.charAt(m);
        }
        for(int n=0;n<count-(count/2)-1;n++){
            New2=New2+empty2.charAt(n);
        }
        if(New.equals(New2)){
            flag=true;
        }
    }
    else if(count%2==0){
    for(int m=empty2.length()-1;m>=count-(count/2);m--){
    New=New+empty2.charAt(m);
    }
    for(int n=0;n<count-(count/2);n++){
        New2=New2+empty2.charAt(n);
    }
    if(New.equals(New2)){
            flag=true;
    }
}
        }
        }
return flag;
}
}
