package codingtest.session07;

import java.sql.SQLOutput;
import java.util.Scanner;

public class S06 {

    static int n;
    static int[] ch;


    private void DFS(int L) {

        if(L==n+1){
            String tmp="";
            for(int i=0; i<=n; i++){
                if(ch[i]==1) tmp += (i+" ");
            }
            if(tmp.length()>0) System.out.println(tmp);

        }else {
            ch[L]=1;
            DFS(L+1);
            ch[L]=0;
            DFS(L+1);
        }

        
    }


//    public int solution(int n){
//        int a = DFS(n);
//
//        return a;
//    }



    public static void main(String[] args) {
        S06 T = new S06();
        n=3;
        ch = new int[n+1];
        T.DFS(1);





    }




}