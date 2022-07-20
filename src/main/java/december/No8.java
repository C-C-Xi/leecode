package december;


public class No8 {
    public static int myAtoi(String s) {
        s = s.trim();

        int a = 1;
        StringBuilder stringBuilder = new StringBuilder();
        if (s.startsWith("-")||s.startsWith("+")) {
            if(s.length()<2){
                return 0;
            }

            if(s.startsWith("-")){
                stringBuilder.append('-');
            }
            s = s.substring(1);
        }
        while(s.startsWith("0")){
            s = s.substring(1);
        }
        if("".equals(s)) {
            return 0;
        }
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c > 47 && c < 58) {
                stringBuilder.append(c);
                if(stringBuilder.length()>12){
                    break;
                }
            } else {
                if (i == 0) {
                    return 0;
                }
                break;
            }
        }
        long b = Long.valueOf(stringBuilder.toString());
        if ( b <Integer.MIN_VALUE ) {
            return Integer.MIN_VALUE;
        }
        if(b>Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        return (int)b;
    }


    public static int myAtoi1(String s) {
        s = s.trim();
        if("".equals(s)) {
            return 0;
        }
        StringBuilder stringBuilder = new StringBuilder();
        if (s.startsWith("-")||s.startsWith("+")) {
            if(s.length()<2){
                return 0;
            }

            if(s.startsWith("-")){
                stringBuilder.append('-');
            }
            s = s.substring(1);
        }
        char[] chars = s.toCharArray();
        return 1;
    }
    public static void main(String[] args) {
        System.out.println(myAtoi(" -42"));
    }
}
