class Solution {
    public char findTheDifference(String s, String t) {
        boolean flag=false;
        int i=0;
        int j=0;
        for(i=0;i<t.length();i++){
            flag=false;
            for(j=0;j<s.length();j++){
                if(t.charAt(i)==s.charAt(j)){
                    flag=true;
                    break;
                }
            }
            if(flag==false){
                break;
            }
        }
        if(flag==false){
            return t.charAt(i);
        }
        else{
            return t.charAt(i-1);
        }
    }
}

//correct the code and solve time complexity
