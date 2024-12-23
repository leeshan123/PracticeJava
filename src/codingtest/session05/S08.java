package codingtest.session05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class S08 {

    class Person{
        int id;
        int priority;
        public Person(int id, int priority) {
            this.id = id;
            this.priority = priority;
        }
    }

    public int solution(int n, int m,int[] arr){
        int answer = 0;
        Queue<Person> Q = new LinkedList<>();
        for(int i=0; i<n; i++){
            Q.offer(new Person(i,arr[i]));
        }
        while(!Q.isEmpty()){
            Person tmp = Q.poll();
            for(Person p : Q){
                if(p.priority >tmp.priority){
                    Q.offer(tmp);
                    tmp = null;
                    break;
                }
            }
            if(tmp!=null){
                answer++;
                if(tmp.id==m)return answer;
            }

        }


        return answer;
    }

    public static void main(String[] args) {
        S08 T = new S08();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }

        System.out.println(T.solution(n,m,arr));


    }




}