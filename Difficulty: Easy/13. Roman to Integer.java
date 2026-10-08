class Solution {
    public int romanToInt(String s) {
        int sum=0;
        int num1=0;
        int num2=0;
        int num3=0;
        int num4=0;
        boolean flag=false;
        int i=0;
        char []roman={'I','V','X','L','C','D','M'};
        int [] val={1,5,10,50,100,500,1000};
        if(s.length()==1){         //for handling test cases that have s.length==1
            for(int t=0;t<roman.length;t++){
                if(s.charAt(0)==roman[t]){
                    sum=val[t];
                }
            }
        }
        else{       //for handling test cases that have s.length!=1
        for(int r=0;r<s.length()-1;r++){    //ei loop er main purpose is flag true false ber kora, true hoile Additive case, false hoile subtractive case
            flag=false;
            for(int u=0;u<roman.length;u++){
                if(s.charAt(r)==roman[u]){
                    num1=val[u];
                  
                }
            }
            for(int v=0;v<roman.length;v++){
                if(s.charAt(r+1)==roman[v]){
                    num2=val[v];
                   
                }
            }
            if(num1>=num2){
                flag=true;
            }
            else{
                flag=false;
                break;
            }
        }
        if(flag==true){  //this scope is used to determine the sum using additive method, this sum is then returned, (else scope e ar dhukbena)   
            for(int w=0;w<s.length();w++){
            for(int f=0;f<roman.length;f++){
              if(s.charAt(w)==roman[f]){
                sum=sum+val[f];
              }
            }
            }
        }
        else{      //this scope is for Subtractive case
            sum=0;
        while(i<s.length()-1){
          for(int p=0;p<roman.length;p++){
            if(s.charAt(i)==roman[p]){
              num1=val[p];
            }
        }
          for(int q=0;q<roman.length;q++){
            if(s.charAt(i+1)==roman[q]){
                num2=val[q];
            }
        }
           if(num1>=num2){        //Subtractive case er bhitor jodi abar additive case thake taile oitar sum ber kora hoitese
                for(int j=0;j<roman.length;j++){
                    if(s.charAt(i)==roman[j]){
                        sum=sum+val[j];
                    }
                }
                i++;
                if(i==s.length()-1){   //while loop s.length()-1 porjonto choltese, rightmost character iterate hobena, so rightmost character handle korar jonno ei scope
                    for(int h=0;h<roman.length;h++){
                    if(s.charAt(i)==roman[h]){
                        sum=sum+val[h];
                    }
                }
                }
            }
            else{
                for(int k=0;k<roman.length;k++){
                    if(s.charAt(i)==roman[k]){
                         num3=val[k];
                    }
                }
                for(int m=0;m<roman.length;m++){
                    if(s.charAt(i+1)==roman[m]){
                         num4=val[m];
                    }
                }
                sum=sum+num4-num3;   //subtractive case e sum ber kora hoitese
                i=i+2;
                   if(i==s.length()-1){  //while loop s.length()-1 porjonto choltese, rightmost character iterate hobena, so rightmost character handle korar jonno ei scope
                    for(int e=0;e<roman.length;e++){
                    if(s.charAt(i)==roman[e]){
                        sum=sum+val[e];
                    }
                }
                }
            }
        }
        }
        }
        
        return sum;
}
}
