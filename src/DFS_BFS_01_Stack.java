import java.util.Stack;

public class DFS_BFS_01_Stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // 삽입5 - 삽입2 - 삽입3 - 삽입 7 - 삭제 - 삽입 1 - 삽입 4 - 삭제
        stack.push(5);
        stack.push(2);
        stack.push(3);
        stack.push(7);
        stack.pop();
        stack.push(1);
        stack.push(4);
        stack.pop();

        while(!stack.isEmpty()){
            System.out.print(stack.peek()+" ");
            stack.pop();
        }
    }
}
