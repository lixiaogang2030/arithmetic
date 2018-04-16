package top.lixiaogang.arithmetic.sort;

import com.alibaba.fastjson.JSON;

/**
 * Created by lixiaogang on 2018/4/16.
 * 该例子是大根堆
 */
public class Heapsort {
    // 已知除了arr[0]，其他元素满足堆的定义
    public static void heapAdjust(int[] arr, int low, int high) {
        int temp = arr[low];
        for (int i = low * 2 + 1; i < high; i = i * 2 + 1) {
            if ((i + 1) < high && arr[i] < arr[i + 1]) {
                i++;
            }
            if (temp < arr[i]) {
                arr[low] = arr[i];
                low = i;
            } else {
                break;
            }
        }
        arr[low] = temp;
        System.out.println("adjust："+JSON.toJSONString(arr));
    }

    public static void heapSort(int[] arr) {
        int n = arr.length;
        //初始化堆，从下向上建堆
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapAdjust(arr, i, n);
        }
        System.out.println("done");
        //排序，输出头节点，把最后叶子结点的值赋值给头节点，调整
        for (int i = n - 1; i > 0; i--) {
            int head = arr[0];
            arr[0] = arr[i];
            arr[i] = head;
            heapAdjust(arr, 0, i);
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,1,3,56,1,90};
        heapSort(arr);
        System.out.println(JSON.toJSONString(arr));
    }
}
