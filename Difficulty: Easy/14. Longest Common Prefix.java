  class Solution {
    public String longestCommonPrefix(String[] strs) {
        int j=0;
        int i=0;
        int m=0;
        boolean flag=true;
        boolean flag2=false;
        String empty="";
        int jMIN=0;
        int temp=0;
        if(strs.length==1 && strs[0].length()==0){ //For edge case strs=[""]
            empty="";
        }
        else if(strs.length==1){ //for edge case something like strs=["a"]
            empty=empty+strs[0].charAt(0);
        }
        else{ // for general case
            for(int k=0;k<strs.length;k++){
                if(strs[i].length()==0){ //If in the array, there is an element whose length is zero, then no common prefix
                    flag2=true;
                    break;
                }
            }
            if(flag2==false){
                jMIN=strs[0].length();
                for( m=0;m<strs.length;m++){
                    temp=strs[m].length();
                    if(temp<jMIN){
                        jMIN=temp;
                    }
                }
                while(flag==true && j<=jMIN-1){ //trace this part to find out what is the purpose of j and jMIN
                    for(i=0;i<strs.length-1;i++){
                        flag=false;
                        if(strs[i].charAt(j)==strs[i+1].charAt(j)){
                            flag=true;
                        }
                        else{
                            flag=false;
                            break;
                        }
                    }
                    if(flag==true){
                        empty=empty+(strs[i].charAt(j));
                        j++;
                    }
                }
            }
        }
        return empty;
    }
}
//Should make the code more efficient, added uncessary variables and edge cases
// The problem is interesting and logic brainstorming friendly, should try again
