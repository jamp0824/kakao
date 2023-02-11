import java.text.ParseException;

public class DFS_BFS_RecursiveFuction {

    public static void recursiveFunction(){
        System.out.println("재귀함수를 호출합니다.");
        recursiveFunction();
    }
    public static void main(String[] args) {
        try {
            recursiveFunction();

        }catch (StackOverflowError e){
            e.getMessage();
        }
    }
}
