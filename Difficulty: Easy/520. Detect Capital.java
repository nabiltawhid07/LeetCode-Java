class Solution {
    public boolean detectCapitalUse(String word) {
        int capitalCount=0;
        int smallCount=0;
        boolean flag=false;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)>=97 && word.charAt(i)<=122){
                smallCount++;
            }
            else if(word.charAt(i)>=65 && word.charAt(i)<=90){
                capitalCount++;
            }
        }
        if(capitalCount==word.length()){
            flag=true;;
        }
        else if(smallCount==word.length()){
            flag=true;
        }
        else if(capitalCount==1 && smallCount==word.length()-1 && word.charAt(0)>=65 && word.charAt(0)<=90){
            flag=true;
        }
        return flag;
    }
}

//More efficient and easier solution...changed the whole logic
