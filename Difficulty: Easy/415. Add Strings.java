class Solution {
    public String addStrings(String num1, String num2) {
        String Large="";
        String Small="";
        int difference=0;
        int count1=0;
        int count2=0;
        for(int i=1;i<=num1.length();i++){
            count1++;
        }
        for(int j=1;j<=num2.length();j++){
            count2++;
        }
        if(count1>=count2){
            Large=num1;
            Small=num2;
            difference=count1-count2;
            for(int m=1;m<=difference;m++){
                Small='0'+Small;
            }
        }
        else if(count1<count2){
            Large=num2;
            Small=num1;
            difference=count2-count1;
            for(int n=1;n<=difference;n++){
                Small='0'+Small;
            }
        }                      //example: 1234 + 56 thakle jaate 1234 + 0056 bhabe add hoy, shei bebostha kora hoilo
      //main kaaj starts
        int k=Large.length()-1;
        int carry=0;
        int sum=0;
        int result=0;
        String empty="";
        String Result="";
        char Carrychar='0';
        while(k>=0){
            if(Large.length()==1 && Small.length()==1){
               char c1=Large.charAt(k);
                int number1=c1-'0';
                char c2=Small.charAt(k);
                int number2=c2-'0';
                sum=number1+number2+carry;
                if(Large.equals("0") && Small.equals("0")){
                    empty="0";
                break;
                }
                else{
                while (sum!=0){
                int remainder=sum%10;
                sum=sum/10;
                char cc=(char)(remainder+48);
                empty=cc+empty;
                }
                break;
                }
            }
            else{
                char c1=Large.charAt(k);
                int number1=c1-'0';
                char c2=Small.charAt(k);
                int number2=c2-'0';
                sum=number1+number2+carry;
                carry=sum/10;
                result=sum%10;
                char Cresult=(char)(result+48);
                Carrychar=(char)(carry+48);
                 Result=""+Cresult;
                empty=Result+empty;
                k--;
            }
        }
         if(carry==0){
                }
                else{
                empty=Carrychar+empty;
                }
        return empty;
    }
}
//(Strings der completely integer e convert kore ,add kore, abar String e convert kore return korle hobena, question e restriction ase
//so, strings der strings hishebe rekhei addition kora holo ekhane)
