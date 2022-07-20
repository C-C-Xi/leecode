package december;

import com.sun.security.jgss.GSSUtil;

import java.util.*;

public class No4 {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList();
        for (int i = 0; i < nums1.length; i++) {
            list.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            list.add(nums2[i]);
        }

        Collections.sort(list);
        int length = list.size();
        int a = length % 2;
        if (a == 0) {
            int idx=length/2;
            int b =  list.get(idx);
            int c =  list.get(idx-1);


            return (b+c)/2;
        }else {
            int idx=length/2;
            int c =  list.get(idx);
            return c;
        }

    }

    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{1,3},new int[]{2,4}));
        Map a=new HashMap();
    }
}
