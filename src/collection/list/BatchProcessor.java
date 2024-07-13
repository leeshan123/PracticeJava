package collection.list;

public class BatchProcessor {

    private final MyList<Integer> list;

    //부모는 자식을 받을 수 있다
    //즉 ArrayList / LinkedList를 둘다 받을 수 있다.
    public BatchProcessor(MyList<Integer> list) {
        this.list = list;
    }


    public void logic(int size){
        long startTime = System.currentTimeMillis();
        for (int i=0; i<size; i++){
            list.add(0,i); //앞에 추가 linkedList가 더 적절함. 즉 코드 변경이 필요함.
        }
        long endTime = System.currentTimeMillis();
        System.out.println("크기: " + size +", 계산 시간: " + (endTime-startTime)+"ms");
    }

}
