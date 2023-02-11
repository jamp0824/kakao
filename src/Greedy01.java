import java.util.ArrayList;
import java.util.List;

public class Greedy01 {
    public static void main(String[] args){

        int num = 1260;
        int count = 0;

        //큰 단위의 화폐부터 차례대로 확인
        int[] i;
        i = new int[] {500,100,50,10};

        for(int j: i){
            num %= j;
            count += 1;

        }
        System.out.println("count = "+count);

    }


}
