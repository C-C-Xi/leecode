package may;


import java.util.Arrays;

public class TwentyFour {
    /**
     * 已知一个无序数组 array，元素均为正整数。给定一个目标值 target，输出数组中是否存在若干元素的组合，相加为目标值。
     * @param arr
     * @return
     */
    public int count(int[]arr,int target) {
        int count=0;

        for (int i = 0; i <arr.length; i++) {
            int a=arr[i];
            if(a==target){count++;continue;
            }
            if(a>target)continue;
            if(a<target){
                for (int j = i; j <arr.length ; j++) {

                }
            }
        }
        return count;
    }
    public static void main(String[] args) {

    }
}


