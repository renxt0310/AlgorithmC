package cn.tx_sboot;

import java.util.Arrays;

public class Basic {

    public static void merge(int[] arr, int left, int mid, int right) {

        int length = right - left + 1;
        int[] temp = new int[length];
        int i = left, j = mid + 1, k = 0;
        while (i <= mid && j <= right) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= right) {
            temp[k++] = arr[j++];
        }

        System.arraycopy(temp, 0, arr, left, length);
    }
    public static void merge_sort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left)/2;
            merge_sort(arr, left, mid);
            merge_sort(arr, mid+1, right);
            merge(arr, left, mid, right);
        }
    }
    public static void main(String[] args) {
        int[] arr = {9, 3, 6, 7, 2, 12, 1};

        https://github.com/renxt0310/Algorithms.git
        merge_sort(arr, 0, 6);
        System.out.println(Arrays.toString(arr));
    }
}
