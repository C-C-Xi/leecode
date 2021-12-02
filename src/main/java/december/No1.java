package december;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No1 {
    public static int[] twoSum(int[] nums, int target) {
        List<Integer> list=new ArrayList<>();
        for (int item:nums){
            list.add(item);
        }
        int b;
        int[]arr=new int[2];
        for (int i = nums.length-1; i >=0 ; i--) {
            b=target-nums[i];
            if(list.contains(b)&&(list.indexOf(b)!=i)){
                arr[0]=i;
                arr[1]=list.indexOf(b);
                break;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] a = {3,3};
        System.out.println(Arrays.toString(twoSum(a,6)));
    }

}
