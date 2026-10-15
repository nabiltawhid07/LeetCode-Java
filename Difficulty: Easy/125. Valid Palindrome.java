class Solution {
    public boolean isPalindrome(String s) {
        int length=0;
        boolean flag=false;
        String empty="";
        String empty2="";
        String New="";
        String New2="";
        if( (s.length()==1) ) { //edge case handle
            flag=true;
        }
        else{ //general case handle
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>=97 && s.charAt(i)<=122)  || (s.charAt(i)>=65 && s.charAt(i)<=90) || (s.charAt(i)>=48 && s.charAt(i)<=57) ){ //small/capital letters/(0-9) 
            empty=empty+s.charAt(i);
            }
        }
        empty2=empty2+empty.toLowerCase();
        length=empty2.length();
    if(length%2!=0){  //for odd numbered length
        for(int m=empty2.length()-1;m>=length-(length/2);m--){
         New=New+empty2.charAt(m);
        }
        for(int n=0;n<length-(length/2)-1;n++){
            New2=New2+empty2.charAt(n);
        }
        if(New.equals(New2)){
            flag=true; 
        }
    }
    else if(length%2==0){  //for even numbered length
    for(int m=empty2.length()-1;m>=length-(length/2);m--){
    New=New+empty2.charAt(m);
    }
    for(int n=0;n<length-(length/2);n++){
        New2=New2+empty2.charAt(n);
    }
    if(New.equals(New2)){
            flag=true;
    }
}
        
        }
return flag;
}
}


//Solved some edge cases, now need to make the code more efficient
