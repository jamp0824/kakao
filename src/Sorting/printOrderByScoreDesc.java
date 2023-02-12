package Sorting;

import java.util.*;

class Student implements Comparable<Student>{
    private String name;
    private int score;
    public Student(String name, int score){
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }
    public int getScore(){
        return score;
    }

    @Override
    public int compareTo(Student std) {
        if(this.score>std.score){
            //내림차순은 > 오름차순은 <
            return -1;
        }
        return 1;
    }
}
public class printOrderByScoreDesc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Student> list = new ArrayList<>();
        //list.add(new Student("홍길동",95));
        //list.add(new Student("이순신", 77));
        for(int i = 0; i<n ; i++){
            String name = sc.next();
            int score = sc.nextInt();
            list.add(new Student(name,score));
        }
        Collections.sort(list);
        for(int i = 0; i<n ; i++){
            System.out.print(list.get(i).getName()+" ");
        }

    }
}
