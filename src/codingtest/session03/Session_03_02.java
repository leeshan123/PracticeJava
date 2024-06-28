package codingtest.session03;




import java.util.*;

public class Session_03_02 {
        //세션 3번의 2번 문제(공통원소 구하기)
        // 시간 초과



        public ArrayList<Integer> solution(int n,int m,int[] arr1,int[] arr2){
            ArrayList<Integer> answer = new ArrayList<>();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            int p1 = 0;
            int p2 = 0;
            while(p1<n && p2<m){
                if(arr1[p1]==arr2[p2]) {
                    answer.add(arr1[p1++]);
                    p2++;
                }
                else if (arr1[p1]<arr2[p2]) p1++;
                else p2++;
            }


            return answer;

        }


        public static void main(String[] args) {
            Session_03_02 T = new Session_03_02();
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            int[] arr1 = new int[n];
            for(int i=0; i<n; i++){
                arr1[i] = scan.nextInt();
            }
            int m = scan.nextInt();
            int[] arr2 = new int[m];
            for(int i=0; i<m; i++){
                arr2[i] = scan.nextInt();
            }

            for(int x : T.solution(n,m,arr1,arr2)){
                System.out.print(x+ " ");
            }



        }
    }


