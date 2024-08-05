package codingtest.session08;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Session_08_04 {
        //세션 6번의 7번 문제(좌표 정렬)
        //O


        public void solution(int n,int[][] arr) {

        }


        public static void main(String[] args) {
            Session_08_04 T = new Session_08_04();
            Scanner scan = new Scanner(System.in);

            int n = scan.nextInt();
            ArrayList<Point> arr = new ArrayList<>();

            for(int i=0; i<n; i++){
                int x = scan.nextInt();
                int y = scan.nextInt();
                arr.add(new Point(x,y));
            }

            Collections.sort(arr);

            for(Point o : arr)
                System.out.println(o.x+" " + o.y);


        }
    }
    class Point implements  Comparable<Point>{
        public int x, y;

        Point(int x, int y){
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Point obj){
            //오름차순이냐 내림차순이냐 지금은 오름차순
            if(this.x == obj.x) return this.y-obj.y;
            else return this.x-obj.x;
        }

    }


