package collection.list;

public class ArrayBatchProcessor {

    //얘는 MyArrayList 밖에 나오지 못함.
    private final MyArrayList<Integer> list = new MyArrayList<>();


    public void logic(int size){
        long startTime = System.currentTimeMillis();
        for (int i=0; i<size; i++){
            list.add(0,i); //앞에 추가 linkedList가 더 적절함. 즉 코드 변경이 필요함.
        }
        long endTime = System.currentTimeMillis();
        System.out.println("크기: " + size +", 계산 시간: " + (endTime-startTime)+"ms");
    }


}
