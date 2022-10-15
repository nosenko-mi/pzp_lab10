package com.example;

import java.util.Arrays;

public class Main {

    public static void bubbleSort(int[] sort_arr){
        var length = sort_arr.length;
        for (int i = 0; i< length -1; ++i){
            for(int j = 0; j< length -i-1; ++j){
                if(sort_arr[j+1]<sort_arr[j]){
                    int swap = sort_arr[j];
                    sort_arr[j] = sort_arr[j+1];
                    sort_arr[j+1] = swap;
                }
            }
            System.out.printf("[%d]:\n", i+1);
            System.out.println(Arrays.toString(sort_arr));
        }
    }

    public static void bubbleSortEnhanced(int[] sort_arr){
        var length = sort_arr.length;
        for (int i = 0; i< length -1; ++i){
            var isSorted = true;
            for(int j = 0; j< length -i-1; ++j){
                if(sort_arr[j+1] < sort_arr[j]){
                    int swap = sort_arr[j];
                    sort_arr[j] = sort_arr[j+1];
                    sort_arr[j+1] = swap;
                    isSorted = false;
                }
            }
            System.out.printf("[%d]:\n", i+1);
            System.out.println(Arrays.toString(sort_arr));
            if (isSorted) break;
        }
    }

    public static void main(String[] args) {
        int[] given = {12, 3, 5, 7, 9, 10};
        int[] given2 = {12, 3, 5, 7, 9, 10};

        System.out.println("given array:");
        System.out.println(Arrays.toString(given));
        System.out.println("basic bubble sort:");
        bubbleSort(given);
        System.out.println("given array:");
        System.out.println(Arrays.toString(given2));
        System.out.println("enhanced bubble sort:");
        bubbleSortEnhanced(given2);
    }
}
