package codingtest.session07;



import java.util.Scanner;

public class Session_07_04 {
        //피보나치 재귀(메모제이션)
        //문제에 없음
        static int[] fibo;
        public int DFS(int n){
            //fibo가 0이 아니면 바로 리턴해버리면됨
            //0이 아니라는건 fibo의 값이 있다는 뜻이기 때문에 계산을 줄임.
            if(fibo[n]>0) return fibo[n];
           if(n == 1){
               return fibo[n] =1;
           }else if(n == 2) {return fibo[n] =1;}
            else{

               return fibo[n] = DFS(n-2)+DFS(n-1);
           }
        }


    public int[] solution(int n) {

            int[] arr = new int[n];
            arr[0] = 1;
            arr[1] = 1;


            for(int i=0; i<n-2; i++){
                arr[i+2] = arr[i] + arr[i+1];
            }




            return arr;
        }


        public static void main(String[] args) {
            Session_07_04 T = new Session_07_04();
            Scanner scan = new Scanner(System.in);

            int n = scan.nextInt();
            fibo = new int[n+1];

//            for(int x : T.solution(n)){
//                System.out.print(x + " ");
//            }
            T.DFS(n);

            for(int i =1; i<=n; i++) System.out.print(fibo[i] + " ");

        }
    }


