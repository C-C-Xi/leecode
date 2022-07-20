package december;

public class No7 {
    public static int reverse(int x) {
        long a=x;
        int flags = 1;
        if (a < 0) {
            flags = -1;
            a = a * flags;
        }
        String b = new StringBuilder(String.valueOf(a)).reverse().toString();
        long s = Long.valueOf(b) * flags;
        if(s>Integer.MAX_VALUE||s<Integer.MIN_VALUE){
            return 0;
        }
        return (int)s;
    }


}
