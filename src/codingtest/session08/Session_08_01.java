package codingtest.session08;



import java.util.Scanner;

public class Session_08_01 {
        //세션 7번의 1번 문제(송아지 찾기 1(BFS : 상태트리탐색))
        //X


        public int solution(int n,int m) {

            int distance = m-n;
            int count = 0;

            while (distance >= 4){
                distance-=5;
                count++;
            }


            while(!(distance == 0)){
                if(distance > 0){
                    distance--;
                }else {
                    distance++;
                }
                count++;
            }


            return count;
        }


        public static void main(String[] args) {
            Session_08_01 T = new Session_08_01();
            Scanner scan = new Scanner(System.in);

            int n = scan.nextInt();
            int m = scan.nextInt();

            System.out.println(T.solution(n,m));

        }
    }


