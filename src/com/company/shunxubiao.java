package com.company;

public class shunxubiao {
    public void paixu(int[] arr, int p){
        int n = arr.length;
        int p1 = p % n;
        for(int i = 0; i < p1; i++){
            replace(arr, i, p1, n);
            for(int j: arr)
                System.out.print(j + " ");
            System.out.println();
        }
        for(int i: arr)
            System.out.print(i + " ");
    }

    private void replace(int[] arr, int i, int p1, int n){
        int t = arr[i];
        arr[i] = arr[n - p1 + i];
        arr[n - p1 + i] = t;
    }
}
