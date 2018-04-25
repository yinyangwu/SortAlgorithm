package com.example;

public class MyClass {

    public static void main(String[] args) {
        int[] a = insertSort();
        for (int anA : a) {
            System.out.println(anA);
        }
        System.out.println("二分查找索引：" + binarySearch(a, 5));
    }

    public static int binarySearch(int[] a, int key) {
        int low = 0;
        int upper = a.length - 1;
        while (low <= upper) {
            int mid = (low + upper) / 2;
            if (a[mid] < key) {
                low = mid + 1;
            } else if (a[mid] > key) {
                upper = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static int[] bubbleSort() {
        int[] a = {3, 5, 2, 1, 6, 4};
        int len = a.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }

    public static int[] selectSort() {
        int[] a = {3, 5, 2, 1, 6, 4};
        int len = a.length;
        for (int i = 0; i < len; i++) {
            int k = i;
            for (int j = k + 1; j < len; j++) {
                if (a[j] < a[k]) {
                    k = j;
                }
            }
            if (i != k) {
                int temp = a[i];
                a[i] = a[k];
                a[k] = temp;
            }
        }
        return a;
    }

    public static int[] insertSort() {
        int[] a = {3, 5, 2, 1, 6, 4};
        int len = a.length;
        for (int i = 1; i < len; i++) {
            int j;
            int x = a[i];
            for (j = i; j > 0 && x < a[j - 1]; j--) {
                a[j] = a[j - 1];
            }
            a[j] = x;
        }
        return a;
    }

}
