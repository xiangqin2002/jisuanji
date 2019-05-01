package com.company;

public class shunxubiao {
    public void paixu(int[] arr, int p){
        int n = arr.length;
        for(int i = 0; i < p; i++){
            replace(arr, i, p, n);
            for(int j: arr)
                System.out.print(j + " ");
            System.out.println();
        }
        for(int i: arr)
            System.out.print(i + " ");
    }

    private void replace(int[] arr, int i, int p, int n){
        int t = arr[i];
        arr[i] = arr[n - p + i];
        arr[n - p + i] = t;
    }
}
