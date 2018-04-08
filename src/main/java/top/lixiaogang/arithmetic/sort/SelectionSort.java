package top.lixiaogang.arithmetic.sort;

import com.alibaba.fastjson.JSONObject;

/**
 * Created by lixiaogang on 2018/4/8.
 */
public class SelectionSort {

    public static int[] sort(int[] A, int n) {
        for (int i = 0; i < n; i++) {
            int max = 0;
            for (int j = 0; j < n - i; j++) {
                if (A[j] > A[max]) {
                    max = j;
                }
            }
            if (max != n - i - 1) {
                int temp = A[n - i - 1];
                A[n - i - 1] = A[max];
                A[max] = temp;
            }
        }
        return A;
    }

    public static void main(String[] args) {
        int[] arr = {90, 1, 23, 2, 3, 5, 2, 1};
        sort(arr, arr.length);
        System.out.println(JSONObject.toJSONString(arr));
    }
}
