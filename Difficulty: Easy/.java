class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        boolean flag=false;
        char b='\u0000';
        while(flag==false){
		int num=target+1;  
	    b=(char)(num); 
            for(int i=0;i<letters.length;i++){
                if(letters[i]==b){
                    flag=true;
                    break;
                }
            }A
            if(flag==true){
                break;
            }
        }
        return b;
    }
}
