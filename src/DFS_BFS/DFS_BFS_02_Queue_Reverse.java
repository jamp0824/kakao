package DFS_BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DFS_BFS_02_Queue_Reverse {
    static Queue<Integer> queue;

    static void Print(){
        while(!queue.isEmpty()){
            System.out.print(queue.peek()+ " ");
            queue.remove();
        }
    }
    public static void reverseQueue(){
            Stack<Integer> stack = new Stack<>();
            while(!queue.isEmpty()){
                stack.add(queue.peek());
                queue.remove();
            }
            while(!stack.isEmpty()){
                queue.add(stack.peek());
                stack.pop();
            }
    }
    public static void main(String[] args) {

        

        queue = new LinkedList<>();
        queue.offer(5);
        queue.offer(2);
        queue.offer(3);
        queue.offer(7);
        queue.poll();
        queue.offer(1);
        queue.offer(4);
        queue.poll();
        Print();
        System.out.println();
        queue = new LinkedList<>();
        queue.offer(5);
        queue.offer(2);
        queue.offer(3);
        queue.offer(7);
        queue.poll();
        queue.offer(1);
        queue.offer(4);
        queue.poll();
        reverseQueue();
        Print();

//        while(!queue.isEmpty()){
//            System.out.println(queue.poll());
//        }
    }
}
