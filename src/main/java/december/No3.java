package december;

import java.util.ArrayList;
import java.util.List;

public class No3 {

    public static int lengthOfLongestSubstring(String s) {
        int length = 0;
        List<Character> list = new ArrayList<Character>();
        char[] chars = s.toCharArray();
        for (char item : chars) {
            if(list.contains(item)){
                if(length<list.size()){
                    length = list.size();
                }
                int idenx=list.indexOf(item);
                while (list.contains(item)){
                    list.remove(0);
                }

                list.add(item);
                continue;
            }
            list.add(item);
            if(length<list.size()){
                length = list.size();
            }
        }
        return length;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("nfpdmpi"));
    }

}
