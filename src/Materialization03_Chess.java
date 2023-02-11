import java.util.Scanner;

public class Materialization03_Chess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input_data = sc.nextLine();

        //현재 위치 입력
        int row = input_data.charAt(1) - '0';
        int column = input_data.charAt(0) -'a'+1;
        // 나이트가 이동할 수 있는 8가지 방향 입력
        int[] dx = {-2,-1,-2,-1,2,1,1,2},
                dy = {-1,-2,1,2,-1,-2,2,1};

        // 8가지 방향에 대해서 각 위치로 이동이 가능한지 확인
        int result = 0;
        for(int i= 0; i<8; i++){
            //이동하고자 하는 위치 확인
            int nextRow = row+dx[i];
            int nextColumn = column+dy[i];
            //해당 위치로 이동이 가능하다면 카운트 증가
            if(nextRow>=1 && nextRow <= 8 && nextColumn>=1 && nextColumn<=8){
                result += 1;
            }
        }
        System.out.println(result);
    }
}
