package Sorting;

import java.util.ArrayList;
import java.util.List;

public class SortOfSelecting {

    public static void main(String[] args) {
        int num = 10;
        int[] array = new int[]{7,5,9,0,3,1,6,2,4,8};
        for(int i = 0; i<num; i++){
            int min_index = i;
            for(int j = i+1; j<num; j++){
                if(array[min_index]>array[j]){
                    min_index = j;
                }
            }
            int temp = array[i];
            array[i] = array[min_index];
            array[min_index] = temp;
        }
        for(int i : array){
            System.out.print(i+ " ");
        }
    }
}
