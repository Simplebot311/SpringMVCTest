package com.csa;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author yufeng1900
 * @create 2021-04-10 19:45
 */
public class JavaTest1 {
    public static void main(String[] args) {
        //测试
        int[] nums = new int[1000];
        for (int i = 0; i < 1000; i++) {
            nums[i] = (int)(Math.random()*10000);
        }

        int[][] ans = solution(nums);

        for (int i = 0; i < 10; i++) {
            System.out.println(ans[i][1]);
        }
    }

    public static int[][] solution(int[] nums){
        int[][] ans = new int[10][2];
        Arrays.sort(nums);
        int n = 0;
        for (int i = 1; i < 1000; i++) {
            if(nums[i-1]==nums[i]){
                n++;
            }else{
                for (int j = 0; j < 10; j++) {
                    if(ans[j][0] < n){
                        ans[j][0] = n;
                        ans[j][1] = nums[i-1];
                        n = 0;
                        break;
                    }
                }
            }
        }
        return ans;
    }
}
