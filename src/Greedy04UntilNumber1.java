import java.util.Scanner;

public class Greedy04UntilNumber1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int result = 0;

        while(true){
            // target 은 N에서 K를 나누어 떨어지는 최대 숫자
            int target = (N/K)*K;   // 16           //4             //0
            //result는 N에서 target을 뺀 나누어떨어지지 않는 숫자
            System.out.println("1target = "+target);

            result +=(N-target);    // 1            //2             //4
            System.out.println("2result = "+result);

            N = target;             // 16           //4             //0
            System.out.println("3N = "+N);

            // N 이 K보다 작을 때 while반복문 나옴
            if(N < K) break;
            // 거기에 +1을 더함/???
            result += 1;            // 2            // 3
            System.out.println("4 result = "+result);
            //N을 K로 나눌때 나누어떨어지는 숫자와 상관없이 몫 값
            N /= K;                 // 4            // 1
            System.out.println("5N = "+N);
        }

        result += (N -1);
        System.out.println("final result = "+result);
    }
}
