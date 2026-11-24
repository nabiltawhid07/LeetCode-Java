class Solution {
    public boolean isHappy(int n) {
        boolean flag=false;
        int sum=0;
        int sum2=0;
        int a=0;
        int count=0;
        sum2=n;
        while(count<11){
            sum=0;
            while(sum2!=0){
                a=sum2%10;
                sum=sum+(a*a);
                sum2=sum2/10;
            }
            if(sum==1){
                flag=true;
                break;
            }
            count++;
            sum2=sum;
        }
        return flag;
    }
}
