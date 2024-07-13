package collection.list;

import java.util.Arrays;

public class MyArrayList<E> implements MyList<E>{

    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;

    public MyArrayList() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int initialCapacity){
        elementData = new Object[initialCapacity];
    }

    @Override
    public int size(){
        return size;
    }

    @Override
    public void add (E e){
        //코드 추가
        if(size == elementData.length){
            grow();
        }

        elementData[size] = e;
        size++;
    }

    //코드 추가
    @Override
    public void add(int index, E e){
        //코드 추가
        if(size == elementData.length){
            grow();
        }
        //데이터 이동하고 넣어야함
        shiftRightFrom(index);
        elementData[index] = e;
        size++;
    }

    private void shiftRightFrom(int index) {
        for(int i = size; i >index; i--){
            elementData[i] = elementData[i-1];
        }
    }

    //코드 추가
    @Override
    public E remove(int index){
        E oldValue = get(index);

        //데이터 이동
        shiftLeftFrom(index);
        size--;
        elementData[size] = null;
        return oldValue;

    }

    //코드 추가 요소의 index부터 마지막까지 왼쪽 밀기
    private void shiftLeftFrom(int index) {
        for(int i=index; i<size-1; i++)
            elementData[i] = elementData[i+1];
    }

    //grow라는 메서드 추가
    private void grow() {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity*2;
        //배열을 새로 만들고, 기존 배열을 새로운 배열에 복사한다.
        //밑에 배열의 복사를 한줄로 끝내는 메서드
        elementData = Arrays.copyOf(elementData, newCapacity);

//        Object[] newArr = new Object[newCapacity];
//        for (int i = 0; i < elementData.length; i++) {
//            newArr[i] = elementData[i];
//        }

    }

    @Override
    public E get(int index){
        return (E)elementData[index];
    }

    @Override
    public E set(int index,E element){
        E oldValue = get(index);
        elementData[index] = element;
        return oldValue;
    }

    @Override
    public int indexOf(Object o ){
        for (int i = 0; i < size; i++) {
            if(o.equals(elementData[i])){
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString(){
        //[1,2,3,null,null]이면 1,2,3만 출력할거임
        //elementData의 size만큼만 복사해서 toString해주는 코드.
        return Arrays.toString(Arrays.copyOf(elementData,size)) + " size = " + size + ", capacity = " + elementData.length;
    }

}
