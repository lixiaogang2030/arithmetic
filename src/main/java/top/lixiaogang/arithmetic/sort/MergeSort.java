package top.lixiaogang.arithmetic.sort;

import com.alibaba.fastjson.JSONObject;

/**
 * Created by lixiaogang on 2018/4/2.
 * 归并排序
 */
public class MergeSort {

    public static void merge(int[] arr, int start, int mid, int end) {
        System.out.println("merge：start" + start + " ,mid：" + mid + " ,end:" + end);
        int[] temp = new int[1 + (end - start)];
        int left = start, right = mid + 1, tempIndex = 0;
        while (left <= mid && right <= end) {
            if (arr[left] < arr[right]) {
                temp[tempIndex++] = arr[left++];
            } else {
                temp[tempIndex++] = arr[right++];
            }
        }
        while (left <= mid) {
            temp[tempIndex++] = arr[left++];
        }
        while (right <= end) {
            temp[tempIndex++] = arr[right++];
        }
        for (int i = 0; i < temp.length; i++) {
            System.out.println("temp[i]:" + temp[i]);
            arr[start + i] = temp[i];
        }
    }

    public static void sort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = start + (end - start) / 2;
        sort(arr, start, mid);
        sort(arr, mid + 1, end);
        merge(arr, start, mid, end);
    }

    public static void main(String[] args) {
        int[] arr = {90, 1, 23, 2, 3, 5, 2, 1};
        sort(arr, 0, arr.length - 1);
        System.out.println(JSONObject.toJSONString(arr));
    }
}
