package codingtest.session08;

import java.lang.reflect.Array;
import java.util.*;
import java.lang.Math;

public class asd {

    public static void main(String[] args) {

        int[][] line = {{2,-1,4},{-2, -1, 4},{0, -1, 1},{5, -8, -12},{5, 8, 12}};
        String[] answer = {};
        int count = 0;

        for(int i=0; i<line.length-1; i++){
            for(int j=i+1; j< line.length; j++){
                double x =  (double)(line[i][1] * line[j][2] - line[i][2] * line[j][1]) / (line[i][0] * line[j][1] - line[i][1] * line[j][0]);
                double y =  (double)(line[i][2] * line[j][0] - line[i][1] * line[j][0]) / (line[i][0] * line[j][1] - line[i][1] * line[j][0]);
                System.out.println("x = " + x + "y = " + y);
            }
        }







    }



}
