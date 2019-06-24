package top.lixiaogang.arithmetic.sort;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * Created by lixiaogang on 2019/6/24.
 * 该例子是希尔排序
 */
public class ShellSort {

    public static void shellSort(int[] arr) {

        int n = arr.length - 1;

        for (int step = 4; step > 0; step--) {

            for (int i = 0; i <= n; i++) {

                int currentIndex = i;
                int nextIndex = i + step;
                int swapIndex = i;
                while (currentIndex <= n && nextIndex <= n) {
                    if (arr[currentIndex] < arr[nextIndex]) {
                        swapIndex = nextIndex;
                    }
                    nextIndex += step;
                }

                if (currentIndex != swapIndex) {
                    int tmp = arr[currentIndex];
                    arr[currentIndex] = arr[swapIndex];
                    arr[swapIndex] = tmp;
                }

                System.out.println("rr:" + JSON.toJSONString(arr));
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {10,23,2,3,4,12,36,17,98,9,10};
        shellSort(arr);
        System.out.println(JSON.toJSONString(arr));
    }

}
