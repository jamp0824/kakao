package DFS_BFS;

public class DFS_BFS_RecursiveFuction_Factorial {
    public static int factorialIterative(int n){
        int result = 1;
        for( int i =1 ; i <= n ; i++){
            result*=i;
        }
        return result;
    }

    public static int facotrialRecursive(int n){
        if (n<= 1) return 1;

        return n*facotrialRecursive(n-1);
    }

    public static void main(String[] args) {
        System.out.println("반복적으로 구현:"+factorialIterative(5));
        System.out.println("반복적으로 구현:"+facotrialRecursive(5));
    }
}
