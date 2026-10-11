class Solution {
    public boolean detectCapitalUse(String word) {
        boolean flag=true;;
        if(word.length()==1){
            flag=true;
        }
        else{
          if(word.charAt(0)>=97 && word.charAt(0)<=123){  //small
            for(int i=0;i<word.length();i++){
              if(word.charAt(i)>=65 && word.charAt(i)<=91){
                flag=false;
                break;
              }
            }
          }
          else if(word.charAt(0)>=65 && word.charAt(0)<=91){  //capital
            if(word.charAt(1)>=65 && word.charAt(1)<=91){  //capital
                for(int k=0;k<word.length();k++){
                    if(word.charAt(k)>=97 && word.charAt(k)<=123){
                        flag=false;
                        break;
                    }
                }
          }
            else if(word.charAt(1)>=97 && word.charAt(1)<=123){  //small
            for(int m=2;m<word.length();m++){
                   if(word.charAt(m)>=65 && word.charAt(m)<=91){
                  flag=false;
                  break;
              }
            }
             
          }
        }
    }
    return flag;
}
}
