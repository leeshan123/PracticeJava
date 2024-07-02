package codingtest.session06;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Session_06_07 {
        //세션 6번의 7번 문제(좌표 정렬)
        //O


        public int[][] solution(int n,int[][] arr) {
            int[][] answer = arr;

            for(int i=0; i<n-1; i++){
                for(int j=i+1; j<n;j++){
                    if(arr[i][0] > arr[j][0]){
                        int tmp = arr[i][0];
                        arr[i][0] = arr[j][0];
                        arr[j][0] = tmp;

                        tmp = arr[i][1];
                        arr[i][1] = arr[j][1];
                        arr[j][1] = tmp;
                    }else if(arr[i][0] == arr[j][0]){
                        if(arr[i][1] > arr[j][1]){
                            int tmp = arr[i][1];
                            arr[i][1] = arr[j][1];
                            arr[j][1] = tmp;
                        }
                    }
                }
            }



            return answer;
        }


        public static void main(String[] args) {
            Session_06_07 T = new Session_06_07();
            Scanner scan = new Scanner(System.in);

            int n = scan.nextInt();
            int[][] arr = new int[n][2];

            for(int i=0; i<n; i++){
                for(int j=0; j<2; j++)
                    arr[i][j] = scan.nextInt();
            }

            int[][] answer = T.solution(n,arr);

            for(int i=0; i<n; i++){
                for(int j=0; j<2; j++)
                    System.out.print(answer[i][j]+" ");

                System.out.println();
            }

        }
    }


