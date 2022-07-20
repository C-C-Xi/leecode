package december;


import java.util.HashMap;
import java.util.Map;

public class No6 {
    /**
     *输入："PAYPALISHIRING", numRows = 4
     * 输出："PINALSIGYAHRPI"
     * @param s
     * @param numRows
     * @return
     */
    public static String convert(String s, int numRows) {
        String result="";
        char[] chars=s.toCharArray();
        int loc=2*numRows-2;
        if(numRows==1) {
            return s;
        }
        Map<Integer,String> map=new HashMap<>();
        for (int i = 0; i <chars.length ; i++) {
            String str=String.valueOf(chars[i]);
            int row= (i+1)%loc;
            if(row==0) {
                row=loc;
            }
            if(row>numRows){
                row=2*numRows-row;
            }
            String a=map.get(row);
            if(null==a){
                map.put(row,str);
            }else {
                map.put(row,a+str);
            }
        }
        for (int i = 1; i <=numRows ; i++) {
            String str=map.get(i);
            if(null!=str){
                result+=str;
            }

        }
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        System.out.println("PAHNAPLSIIGYIR".equals(convert("PAYPALISHIRING",3)));
    }
}
