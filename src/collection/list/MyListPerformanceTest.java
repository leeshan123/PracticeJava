package collection.list;

public class MyListPerformanceTest {

    public static void main(String[] args) {
        int size = 50_000;
        System.out.println("==MyArrayList 추가 ==");
        addFirst(new MyArrayList<>(), size);
        addMid(new MyArrayList<>(), size); //찾는데O(1), 데이터 추가 O(n) // 얘가 약간 더 빠름
        addLast(new MyArrayList<>(), size); //찾는데 O(1), 데이터 추가O(1) // 굉장히 빠름.
        System.out.println("==선언 후 넣기==");
        MyArrayList<Integer> arrayList = new MyArrayList<>(); // 조회용 데이터로 사용
        addLast(arrayList, size);

        System.out.println();

        int loop = 10_000;
        System.out.println("==MyArrayList 조회 ==");
        getIndex(arrayList,loop,0); //앞에서 조회
        getIndex(arrayList,loop,size/2); // 중간에서 조회
        getIndex(arrayList,loop,size-1); //뒤에서 조회

        System.out.println();

        System.out.println("==MyArrayList 검색 ==");
        search(arrayList,loop,0); //앞에서 조회
        search(arrayList,loop,size/2); // 중간에서 조회
        search(arrayList,loop,size-1); //뒤에서 조회


        System.out.println();

        System.out.println("==MyLinkedList 추가 ==");
        addFirst(new MyLinkedList<>(), size); //훨씬 효율적
        addMid(new MyLinkedList<>(), size); //찾는데 O(n), 데이터 추가(1)
        addLast(new MyLinkedList<>(), size); //찾는데 O(n), 데이터 추가(1)
        System.out.println("==선언 후 넣기==");
        MyLinkedList<Integer> linkedList = new MyLinkedList<>(); // 조회용 데이터로 사용
        addLast(linkedList, size);

        System.out.println();

        System.out.println("==MyLinkedList 조회 ==");
        getIndex(linkedList,loop,0); //앞에서 조회
        getIndex(linkedList,loop,size/2); // 중간에서 조회
        getIndex(linkedList,loop,size-1); //뒤에서 조회

        System.out.println();

        System.out.println("==MyLinkedList 검색 ==");
        search(linkedList,loop,0); //앞에서 조회
        search(linkedList,loop,size/2); // 중간에서 조회
        search(linkedList,loop,size-1); //뒤에서 조회



    }

    private static void addFirst(MyList<Integer> list, int size){
        long startTime = System.currentTimeMillis();
        for (int i=0; i<size; i++){
            list.add(0,i); //앞에 추가 linkedList가 더 적절함. 즉 코드 변경이 필요함.
        }
        long endTime = System.currentTimeMillis();
        System.out.println("앞에 추가 - 크기: " + size +", 계산 시간: " + (endTime-startTime)+"ms");
    }

    private static void addMid(MyList<Integer> list, int size){
        long startTime = System.currentTimeMillis();
        for (int i=0; i<size; i++){
            list.add(i/2,i); //앞에 추가 linkedList가 더 적절함. 즉 코드 변경이 필요함.
        }
        long endTime = System.currentTimeMillis();
        System.out.println("평균(중간)에 추가 - 크기: " + size +", 계산 시간: " + (endTime-startTime)+"ms");
    }

    private static void addLast(MyList<Integer> list, int size){
        long startTime = System.currentTimeMillis();
        for (int i=0; i<size; i++){
            list.add(i); //앞에 추가 linkedList가 더 적절함. 즉 코드 변경이 필요함.
        }
        long endTime = System.currentTimeMillis();
        System.out.println("뒤에 추가 - 크기: " + size +", 계산 시간: " + (endTime-startTime)+"ms");
    }

    private static void getIndex(MyList<Integer> list, int loop, int index){
        long startTime = System.currentTimeMillis();
        for(int i=0; i<loop; i++){
            list.get(index);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("index: " + index +", 반복: " +loop+ ", 계산 시간: "+ (endTime-startTime)+"ms");
    }

    private static void search(MyList<Integer> list, int loop, int findValue){
        long startTime = System.currentTimeMillis();
        for(int i=0; i<loop; i++){
            list.indexOf(findValue);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("findValue: " + findValue +", 반복: " +loop+ ", 계산 시간: "+ (endTime-startTime)+"ms");
    }



}
