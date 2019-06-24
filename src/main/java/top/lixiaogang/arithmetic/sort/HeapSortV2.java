package top.lixiaogang.arithmetic.sort;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * Created by lixiaogang on 2018/6/24.
 * 该例子是大根堆
 */
public class HeapSortV2 {

    public static void heapSort(int[] arr) {

        int high = arr.length - 1;

        for (int i = (high / 2) - 1 ; i >= 0 ; i--) {
            heapAdjust(arr, i, high);
            System.out.println(JSONObject.toJSONString(arr));
        }

        for (int i = 0 ; i <= high ; i++) {
            int tmp = arr[0];
            arr[0] = arr[high - i];
            arr[high - i] = tmp;

            heapAdjust(arr, 0, high - i - 1);
        }
    }

    public static void heapAdjust(int[] arr, int low, int high) {

        int leftIndex = 2 * low + 1;
        int rightIndex = leftIndex + 1;
        int maxIndex = low;

        if (leftIndex <= high && arr[leftIndex] > arr[maxIndex]) {
            maxIndex = leftIndex;
        }

        if (rightIndex <= high && arr[rightIndex] > arr[maxIndex]) {
            maxIndex = rightIndex;
        }

        if (low != maxIndex) {
            // swap low and maxIndex
            int tmp = arr[low];
            arr[low] = arr[maxIndex];
            arr[maxIndex] = tmp;
            heapAdjust(arr, maxIndex, high);
        }

        System.out.println("rrr:" + JSONObject.toJSONString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8,9,10};
        heapSort(arr);
        System.out.println(JSON.toJSONString(arr));
    }

}
