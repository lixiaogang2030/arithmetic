package top.lixiaogang.arithmetic.sort;

import com.alibaba.fastjson.JSONObject;

/**
 * Created by lixiaogang on 2018/4/8.
 */
public class BubbleSort {

    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }

            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {90, 1, 23, 2, 3, 5, 2, 1};
        sort(arr);
        System.out.println(JSONObject.toJSONString(arr));
    }
}
