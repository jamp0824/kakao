package SequentialSearch;

import java.util.Scanner;

public class SearchingPartForGaesuOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //n (가게의 부품 개수)
        int n = sc.nextInt();
        int[] arr = new int[1000001];
        for(int i = 0; i<n; i++){
            int x = sc.nextInt();
            arr[x] = 1;
        }

        //손님
        int m = sc.nextInt();
        int[] targets = new int[n];
        for(int i = 0; i<m; i++){
            targets[i] = sc.nextInt();
        }

        //손님 확인 부품 확인
        for(int i = 0; i < m; i++){
            if(arr[targets[i]]==1){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
    }
}
