package december;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class No5 {
    public static String longestPalindrome1(String s) {
        String result = "";
        int length = s.length();
        char[] chars = s.toCharArray();
        result = s.substring(0, 1);
        int start = 0;
        int end = 0;
        for (int i = 1; i < length; i++) {
            //情况1：回文串的中间字符
            int length1 = 0;
            int start1 = 0;
            int end1 = 0;
            int start2 = 0;
            int end2 = 0;
            if (i + 1 < length && chars[i - 1] == chars[i + 1]) {
                for (int j = 1; j < length / 2; j++) {
                    if (chars[i - j] == chars[i + j] && i - j >= 0 && i + j < length) {
                        start1 = i - j;
                        end1 = i + j;
                    }
                }
                length1 = end1 - start1 + 1;
            }
            //情况2：回文串的右边字符
            int length2 = 0;
            if (i + 1 < length && chars[i] == chars[i + 1]) {
                for (int j = 0; j < length; j++) {
                    if (chars[i - j] == chars[i + j + 1] && i - j >= 0 && i + j < length) {
                        start2 = i - j;
                        end2 = i + j;
                    }
                }
                length2 = end2 - start2 + 1;
            }
            if (length1 > length2) {
                start = start1;
                end = end1;
            } else {
                start = start2;
                end = end2;
            }

        }
        result = s.substring(start, end + 1);
        return result;
    }

    public static String longestPalindrome(String s) {
        String result = "";
        char[] chars = s.toCharArray();
        int length = chars.length;
        result = String.valueOf(chars[0]);
        int start = 0;
        int end = 0;
        int slength = 0;
        for (int i = 0; i < length; i++) {
            for (int j = 1; i - j >= 0 && i + j < length; j++) {
                if (chars[i - j] == chars[i + j]) {
                    if (slength < (j * 2 + 1)) {
                        start = i - j;
                        end = i + j;
                        slength = j * 2 + 1;
                    }
                } else {
                    break;
                }
            }
            if (i + 1 < length && chars[i] == chars[i + 1]) {
                for (int j = 0; i - j >= 0 && i + j + 1 < length; j++) {
                    if (chars[i - j] == chars[i + j + 1]) {
                        if (slength < (j * 2 + 2)) {
                            start = i - j;
                            end = i + j + 1;
                            slength = j * 2 + 2;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        if (slength > 1) {

            if(end+1==length){
                result=s.substring(start);
            }else {
                result = s.substring(start, end+1);
            }
        }
        return result;

    }

    public static void main(String[] args) {
       System.out.println(longestPalindrome("babad"));
//        System.out.println(longestPalindrome("vvgogaewginhopuxzwyryobjjpieyhwfopiowxmyylvcgsnhfcnogpqpukzmnpewavoutbloyrrhatimmxfqmcwgfebuoqbbgvubbkjfvxivjfijlpvtsnhagzfptahhyojwzamayoiegkenycnkxzkambimhdykdcxyyfjnvztzypmfczdhhnkmfuvgkhzbwmjznykkagqdrueohgcmeidjqsvfugcioeduohprjtfdmtzosnhoiganffarokxjifzzxhixdzycwfheqqegduzwtiacmdhqfmxhazcxsqyrvrihfqzjxvawdeandnwgjlquvzadruiqmcsgibglhicsvzqknztqpkiihdoisxipkourentfvrltieihiktgzswtgcmmlfrjifqinhrbplbsgswqlbjkyxjwoshsvxlhlpgzwbmxzwaemtowcxwourjwmmwjruowxcwotmeawzxmbwzgplhlxvshsowjxykjblqwsgsblpbrhniqfijrflmmcgtwszgtkihieitlrvftneruokpixsiodhiikpqtznkqzvscihlgbigscmqiurdazvuqljgwndnaedwavxjzqfhirvryqsxczahxmfqhdmcaitwzudgeqqehfwcyzdxihxzzfijxkoraffnagiohnsoztmdftjrphoudeoicgufvsqjdiemcghoeurdqgakkynzjmwbzhkgvufmknhhdzcfmpyztzvnjfyyxcdkydhmibmakzxkncynekgeioyamazwjoyhhatpfzgahnstvpljifjvixvfjkbbuvgbbqoubefgwcmqfxmmitahrryolbtuovawepnmzkupqpgoncfhnsgcvlyymxwoipofwhyeipjjboyrywzxupohnigweagogvv"));
   }
}
