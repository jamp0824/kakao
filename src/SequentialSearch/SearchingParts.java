package SequentialSearch;

import java.util.Scanner;

public class SearchingParts {

    private static void sequentialPartsSearch(Integer[] store, int m, Integer[] target) {
        for(int i =0 ; i< m; i++){
            int result = 0;
            for(int j: store){
               if(j == target[i]){
                   result++;
               }
            }
            if(result == 1){
                System.out.print("yes ");
            }else{
                System.out.print("no ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] store = new Integer[n];
        for(int i =0; i<n; i++){
            store[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        Integer[] target = new Integer[m];
        for(int i =0; i<m; i++){
            target[i] = sc.nextInt();
        }

       sequentialPartsSearch(store, m, target);


    }
}
