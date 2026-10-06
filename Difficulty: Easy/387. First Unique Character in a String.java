class Solution {
    public int firstUniqChar(String s) {
        int k=0;
        int i=0;
        int m=0;
        boolean flag=false;
        for( i=0;i<s.length();i++){
             flag=false;
            for(int j=0;j<s.length();j++){
                if(i==j){
                    continue;  //same character 2 times count hoye jabe continue na dile
                }
                else if(s.charAt(j)==s.charAt(i)){
                    flag=true;
                    break;
                }
            }
            if(flag==false){
                m=i;
                break;
            }
        }
        if(flag==true){
            m=-1;
        }
        return m;
        }
}
    
