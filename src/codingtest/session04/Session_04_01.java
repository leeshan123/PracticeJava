package codingtest.session04;


import java.util.Scanner;

public class Session_04_01 {
        //세션 4번의 1번 문제( 학급 회장(해쉬))
        // 시간 초과

        public char solution(int n,String s){
            char answer = ' ';
            int[] arr = new int[n];


            for(int i=0; i<n; i++){
                if(s.charAt(i) =='A')
                    arr[0]++;
                else if(s.charAt(i) =='B')
                    arr[1]++;
                else if(s.charAt(i) =='C')
                    arr[2]++;
                else if(s.charAt(i) =='D')
                    arr[3]++;
                else
                    arr[4]++;
            }

            int max = Integer.MIN_VALUE;
            int a = 0;

            for(int i=0; i<n; i++){
                if(arr[i] > max){
                    max = arr[i];
                    a = i;
                }
            }

            if( a == 0){
                return 'A';
            }else if (a == 1){
                return 'B';
            }else if (a == 2){
                return 'C';
            }else if (a == 3){
                return 'D';
            }else {
                return 'E';
            }


        }


        public static void main(String[] args) {
            Session_04_01 T = new Session_04_01();
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            String s = scan.next();



            System.out.println(T.solution(n,s));


        }
    }


