package codingtest.session05;


import java.util.Scanner;
import java.util.Stack;

public class Session_05_04 {
        //세션 5번의 4번 문제(4. 후위식 연산(postfix))

        public int solution(String s){
            int answer = 0;
            Stack<Integer> stack = new Stack<>();
            for(char x : s.toCharArray()){
                //캐릭터를 숫자로 바꾸는거!
                if(Character.isDigit(x)) stack.push(x-48);
                else{
                    int rt = stack.pop();
                    int lt = stack.pop();
                    if(x == '+') stack.push(lt+rt);
                    else if (x=='-') stack.push(lt-rt);
                    else if (x=='*') stack.push(lt*rt);
                    else if (x=='/') stack.push(lt/rt);

                }

            }
            answer = stack.get(0);


            return answer;

        }


        public static void main(String[] args) {
            Session_05_04 T = new Session_05_04();
            Scanner scan = new Scanner(System.in);
            String s = scan.next();

            System.out.println(T.solution(s));



        }
    }


