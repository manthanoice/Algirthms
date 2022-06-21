package searchingAlgos;

import java.util.Scanner;

public class jumpSearch {
    private static int search(int []arr, int x){
        int n = arr.length;
        int step = (int)Math.floor(Math.sqrt(n));
        int prev = 0;
        while(arr[Math.min(step, n)-1] < x){
            prev = step;
            step += (int)Math.floor(Math.sqrt(n));
            if(prev >= n)
                return -1;
        }
        while(arr[prev] < x){
            prev++;
            if(prev == Math.min(step, n))
                return -1;
        }
        if(arr[prev] == x)
            return prev;
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        int x = sc.nextInt();
        System.out.println((search(arr, x))==-1?"Element doesn't exist":"Element found at index: "+search(arr, x));
    }
}