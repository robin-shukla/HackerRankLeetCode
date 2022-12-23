package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args){
        //Insertion sort is a simple sorting algorithm that works similar to the way you
        // sort playing cards in your hands. The array is virtually split into a sorted
        // and an unsorted part. Values from the unsorted part are picked and placed at
        // the correct position in the sorted part.
        // worst case O(n^2) , best case O(n)
        int[] arr = {4,2,5,1,3};
        for(int i=1;i<arr.length;i++){
            int key = arr[i];
            int j = i -1;
            while(j>=0 && arr[j] > key){
                arr[j+1] = arr[j];
                j = j - 1;
            }
            arr[j+1] = key;
        }
        Arrays.stream(arr).forEach(e-> System.out.print(e + " "));
    }
}
