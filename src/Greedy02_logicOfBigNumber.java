import java.util.Arrays;
import java.util.Scanner;

public class Greedy02_logicOfBigNumber {
    public static void main(String[] args){

        //N,M,K를 공백으로 구분하여 입력받기
        Scanner scanner = new Scanner(System.in);

        int n,m,k;
        n = scanner.nextInt();
        m = scanner.nextInt();
        k = scanner.nextInt();

        int[] data= new int[m];

        for(int i =0; i<data.length; i++){
            data[0] = scanner.nextInt();
        }
        Arrays.sort(data);

        int first = data[n-1];
        int second = data[n-2];

        int count = (int)(m/(k+1))*k;
        count += m%(k+1);

        int result = 0;
        result += (count)* first;
        result += (m-count)*second;

        System.out.println(result);


    }
}
