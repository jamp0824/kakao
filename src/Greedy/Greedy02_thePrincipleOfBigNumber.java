package Greedy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Greedy02_thePrincipleOfBigNumber {
    public static void main(String[] args) {
        //입력 받을 N,M,K를 선언
        int N;
        int M;
        int K;


        //숫자로 입력
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        K = sc.nextInt();

        //N개의 수를 공백으로 구분하여 입력받기
        int[] input = new int[]{N, M, K};
        int[] data = new int[5];

        for(int i =0; i<data.length ; i++){
            data[i] = sc.nextInt();
        }
        // 자바에는 파이썬과 같은 내림차순이 없으므로 내림차순 메서드를 만든다.
//        reverseSort(data);
        Arrays.sort(data);
        System.out.println("data = "+Arrays.toString(data));

        int first = data[N-1]; //가장 큰 수
        int second = data[N -2];   // 두 번째로 큰수

        int result = 0;
        System.out.println("K = "+K+" ,N = "+N+" ,M = "+M);
        while (true){
            for(int i = 0; i< K ; i++){
                if(M == 0){
                    break;
                }
                result+= first;
                System.out.println(M+"번째 숫자 ="+result);
                M-=1;
            }
            if(M == 0){
                break;
            }
            result+= second;
            System.out.println(M+"번째 숫자 ="+result);
            M-=1;
        }
        System.out.println(result);
        Integer[] arr3 = Arrays.stream(data).boxed().toArray(Integer[]::new);
        //Arrays.stream(배열명)으로 배열을 스트림 형태로 변경한 뒤
        //int 배열이라면 메소드 사용을 위해
        //.boxed()를 붙여주고(Intger일 경우 안 붙임)
        //.toArray(Integer[]:new); 로 Integer형태로 반환하면 된다.
        System.out.println("정렬되기 전 배열 = "+Arrays.toString(arr3));

        Arrays.sort(arr3, Collections.reverseOrder());
        System.out.println("정렬된 후 배열 = "+Arrays.toString(arr3));
    }
//        public static void reverseSort(int[] arr){
//
//            Arrays.sort(arr);
//
//            for(int i =0; i<arr.length/2; i++){
//                int temp = arr[i]; //임시 변수에 오름차순 정렬된 첫째값 입력
//                arr[i] = arr[arr.length-1]; //변수 첫번째에 오름차순 마지막 값 입력
//                arr[arr.length-1] = temp; //마지막값에 임시 변수 오름차수 정렬된 첫번째 값 입력
//            }
//        }
    }

