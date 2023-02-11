package Materialization;

import java.util.Scanner;

public class Materialization01_Coordinate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int x = 1, y = 1;

        String[] plans = sc.nextLine().split(" ");
        //L,R,U,D
        int[] dx = {0,0,-1,1};
        int[] dy = {-1,1,0,0};
        char[] move_types = {'L','R','U','D'};

        //입력한 이동 계획을 하나씩 확인
        for(int i = 0; i < plans.length; i++){
            char plan = plans[i].charAt(0);

            int nx = -1, ny = -1;
            // 주어진 죄표 입력값 확인
            for(int j = 0; j < 4 ; j++){
                //맞는 죄표가 구해지면 죄표를 구하기
                if(plan == move_types[j]){
                    nx = x + dx[j];
                    ny = y + dy[j];
                    System.out.println(j+"번째 = x ="+x+" y  ="+y );
                    System.out.println(j+"번째 = nx ="+nx+" ny  ="+ny );
                }
            }
            //좌표가 벗어나는 경우 상위 for문으로 복귀
            if(nx < 1 || ny < 1 || nx > n || ny > n) continue;
            System.out.println("111111111111111");
            //현재 죄표 값을 x , y에 대입
            x = nx;
            y = ny;
        }
        System.out.println(x + " " + y);
    }
}
