class Solution {
    public String reverseVowels(String s) {
        String empty="";
        int j=s.length();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e'|| s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A' || s.charAt(i)=='E'|| s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
                j=j-1;
                while(j>=0){
                    if(s.charAt(j)=='a' || s.charAt(j)=='e'|| s.charAt(j)=='i'||s.charAt(j)=='o'||s.charAt(j)=='u'||s.charAt(j)=='A' || s.charAt(j)=='E'|| s.charAt(j)=='I'||s.charAt(j)=='O'||s.charAt(j)=='U'){
                        empty=empty+s.charAt(j);
                        break;
                    }
                    else{
                        j=j-1;
                        continue;
                    }
                }
            }
            else{
                empty=empty+s.charAt(i);
            }
        }
        s=empty;
        return s;
    }
}
