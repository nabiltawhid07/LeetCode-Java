class Solution {
    public boolean isSubsequence(String s, String t) {
        boolean flag=false;
        int i=0;
        int j=0;
        int k=0;
        for( i=0;i<s.length();i++){
            flag=false;
            for(j=k;j<t.length();j++){
                if(s.charAt(i)==t.charAt(j)){
                    flag=true;
                    k=j+1;
                    break;
                }
                k=j+1;
            }
            if(flag==false){
                break;
            }
        }
        if(s.equals("")){
            flag=true;
        }
        if(i<s.length()-2){   //!= dile kaaj korena keno?
            flag=false;
        }
        return flag;
    }
}

//need to work on it again, make it more efficient and improve logic
