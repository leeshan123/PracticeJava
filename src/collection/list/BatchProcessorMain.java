package collection.list;

public class BatchProcessorMain {

    public static void main(String[] args) {
        //속도의 차이가 어마무시하다
//        MyArrayList<Integer> list = new MyArrayList<>();
        MyLinkedList<Integer> list = new MyLinkedList<>();

        BatchProcessor processor = new BatchProcessor(list);
        processor.logic(1000_000);
    }

}
