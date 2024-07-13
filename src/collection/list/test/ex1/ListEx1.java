package collection.list.test.ex1;

import java.util.ArrayList;

public class ListEx1 {
    public static void main(String[] args) {
        ArrayList<Integer> studentslist = new ArrayList<>();
        studentslist.add(90);
        studentslist.add(80);
        studentslist.add(70);
        studentslist.add(60);
        studentslist.add(50);


        int total = 0;
        for(int i=0; i<studentslist.size(); i++){
            total+= studentslist.get(i);
        }

        double average = (double) total / studentslist.size();
        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + average);

    }
}
