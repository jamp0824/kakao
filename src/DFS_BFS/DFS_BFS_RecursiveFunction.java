package DFS_BFS;

public class DFS_BFS_RecursiveFunction {
    public static void recursive(int i){
        if(i == 100) return;
        System.out.println(i + "번째 재귀 함수에서 "+ (i+1)+"번째 재귀함수를 호출합니다.");
        recursive(i + 1);
        System.out.println(i + "번째 재귀 함수를 종료합니다.");
    }
    public static void main(String[] args) {
        recursive(1);
    }

}
