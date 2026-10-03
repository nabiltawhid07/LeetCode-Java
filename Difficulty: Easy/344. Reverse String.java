class Solution {
    public void reverseString(char[] s) {
        int j=s.length;
        boolean flag=false;
        if(s.length%2!=0){
        for(int i=0;i<s.length;i++){
            j=j-1;
            while(j>=0){
                if(i==j){
                    flag=true;
                    break;
                }
                else{
                 char temp=s[i];
                 s[i]=s[j];
                 s[j]=temp;
                 break;
                }
            }
            if(flag==true){
                break;
            }
        }
        }
        else if(s.length%2==0){
            for(int i=0;i<s.length/2;i++){
                j=j-1;
                while(j>(s.length/2)-1){
                     char temp=s[i];
                 s[i]=s[j];
                 s[j]=temp;
                 break;
                }
            }
        }
    }
}
