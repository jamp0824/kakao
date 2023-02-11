package Greedy;

import java.util.Scanner;

public class Greedy03_numberCardGame {
    //숫자 카드 게임이다
    // 첫째 줄에 숫자 카드를 놓인 행의 개수 N과 열의 개수 M이 공백을 기준으로 하여 각각 자연수로 주어진다
    // 둘째 줄부터 N개의 줄에 걸쳐 각 카드에 적힌 숫자가 주어진다. 각 숫자는 1이상 10,000 이하의 자연수이다.
    //출력 조건 첫째 줄에 게임의 룰에 맞게 선택한 카드에 적힌 숫자를 출력한다
    public static void main(String[] args) {
        int Board[][] = new int[100][100];
        Scanner scanner = new Scanner(System.in);
        int Row = scanner.nextInt();
        int Column = scanner.nextInt();

        int result = 0;

        for (int i = 0; i < Row; ++i) {
            //현재 줄에서 '가장 적은 수' 찾기
            int min_value = 10001;
            for (int j = 0; j < Column; ++j) {
                int x = scanner.nextInt();
                min_value = Math.min(min_value, x);
            }

            result = Math.max(result, min_value);
        }
        System.out.println(result);

    }

}
