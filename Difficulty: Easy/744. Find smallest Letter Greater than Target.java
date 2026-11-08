class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        boolean flag=false;
        char b='\u0000';
        int num=target+1;  
        while(flag==false){
		int num2=num;  
	    b=(char)(num); 
            for(int i=0;i<letters.length;i++){
                if(letters[i]==b){
                    flag=true;
                    break;
                }
            }
            if(flag==true){
                break;
            }
            num++;
        }
        return b;
    }
}

//need to improve the logic, efficiency, and solve the time complexity
