class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        boolean flag=false;
        int count1=0;
        int count2=0;
        for(int i=0;i<ransomNote.length();i++){
            flag=false;
            count1=0;
            count2=0;
            char pointer=ransomNote.charAt(i);
            for(int j=0;j<ransomNote.length();j++){
                if(ransomNote.charAt(i)==ransomNote.charAt(j)){
                    count1++;
                }
            }
            for(int m=0;m<magazine.length();m++){
                if(pointer==magazine.charAt(m)){
                    count2++;
                }
            }
            if(count1<=count2){
                flag=true;
            }
            else if(count1>count2){
                flag=false;
                break;
            }
        }
        return flag;
    }
}
