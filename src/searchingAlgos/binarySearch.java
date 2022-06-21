package searchingAlgos;

import java.util.Scanner;

public class binarySearch {
    private static int Search(int []arr, int x){
        int left = 0;
        int right = arr.length-1;
        while (left <= right){
            int middle = left + (right - left)/2;
            if(arr[middle]==x)
                return middle;
            if(arr[middle] < x)
                left = middle + 1;
            if(arr[middle] > x)
                right = middle - 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        int x = sc.nextInt();
        System.out.println((Search(arr, x))==-1?"Element doesn't exist":"Element exists at index: " + Search(arr, x));
    }
}