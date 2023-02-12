package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SwitchingTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int switchingCount = sc.nextInt();

        Integer[] arr = new Integer[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        Integer[] arr2 = new Integer[n];
        for(int i = 0; i<n; i++){
            arr2[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        Arrays.sort(arr2,Collections.reverseOrder());

        for(int i =0; i<switchingCount; i++){
            if(arr[i]<arr2[i]) {
                int temp = arr[i];
                arr[i] = arr2[i];
                arr2[i] = temp;
            }
            else break;
        }
         int result = 0;
            for(int i =0; i<n; i++){
                result+= arr[i];
             }
        System.out.println("result = "+ result);
//        for(int i =0; i<n; i++){
//            System.out.print(arr2[i]+" ");
//        }
    }
}
