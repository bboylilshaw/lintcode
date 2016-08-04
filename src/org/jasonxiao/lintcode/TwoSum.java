package org.jasonxiao.lintcode;

/**
 * Created by Jason on 8/5/16.
 * 两数求和
 * http://www.lintcode.com/zh-cn/problem/two-sum/
 */
public class TwoSum {
    /*
     * @param numbers : An array of Integer
     * @param target : target = numbers[index1] + numbers[index2]
     * @return : [index1 + 1, index2 + 1] (index1 < index2)
     */
    public int[] twoSum(int[] numbers, int target) {
        // write your code here
        for (int i = 0; i < numbers.length; i++) {
            int candidate = target - numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] == candidate) {
                    return new int[]{i + 1, j + 1};
                }
            }
        }
        return null;
    }
}
