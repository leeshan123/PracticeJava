package codingtest.session07;



import java.util.Scanner;

public class Session_07_06 {
        //부분집합 구하기(DFS)
        //문제에 없음
        static int n;
        static int[] ch;
        public void DFS(int L){
            if(L==n+1){
                String tmp = "";
                for(int i=1; i<=n; i++){
                    if(ch[i] ==1) tmp +=(i + " ");
                }
                if(tmp.length()>0)
                    System.out.println(tmp);

            }
            else{
                //왼쪽
                ch[L] = 1; //사용한다
                DFS(L+1);
                //오른쪽
                ch[L] = 0; //사용하지 않는다
                DFS(L+1);
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
            Session_07_06 T = new Session_07_06();
            Scanner scan = new Scanner(System.in);

            n=3;
            ch = new int[n+1];


            T.DFS(1);

        }
    }


