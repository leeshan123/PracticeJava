package codingtest.session05;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Person{
    int id;
    int priority;

    public Person(int id, int priority){
        this.id = id;
        this.priority = priority;
    }
}

public class Session_05_08 {
        //queue 문제
        //세션 5번의 8번 문제(8. 응급실)
        //FIFO Q.poll() -> 맨 앞에꺼 꺼냄
        //Q.offer() -> 맨 뒤로 넣음
        //peek나 contains 알아두기

        public int solution(int n, int m, int[] arr){
            int answer = 0;
            Queue<Person> Q =new LinkedList<>();
            for(int i=0; i<n; i++){
                Q.offer(new Person(i,arr[i]));
            }
            while(!Q.isEmpty()){
                Person tmp = Q.poll();
                for(Person x : Q){
                    if(x.priority > tmp.priority){
                        Q.offer(tmp);
                        tmp=null;
                        break;
                    }
                }
                if(tmp!=null){
                    answer++;
                    if(tmp.id==m) return answer;

                }

            }

            return answer;

        }


        public static void main(String[] args) {
            Session_05_08 T = new Session_05_08();
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


