package december;


public class NO9 {
    public boolean isPalindrome(int x) {
        if(x<0) {
            return false;
        }
        long b=x;
        long a=0;
        while (x!=0){
            a=a*10+x%10;
            x=x/10;
        }
        if(b==a){
            return true;
        }else {
            return  false;
        }
    }
}
