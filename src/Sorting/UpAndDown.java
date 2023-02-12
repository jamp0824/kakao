package Sorting;

import java.util.*;

public class UpAndDown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        List<Integer> arr = new ArrayList<>();
        Integer[] arr = new Integer[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
//        Collections.sort(arr);
//        Collections.reverseOrder();
        Arrays.sort(arr, Collections.reverseOrder());
        for(int i = 0; i< n; i++){
//            System.out.print(arr.get(i)+" ");
            System.out.print(arr[i]+" ");
        }
    }
}
