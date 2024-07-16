package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV2 {

   static final int DEFAULT_INITIAL_CAPACITY = 16;

   private LinkedList<Object>[] buckets;

   private int size = 0;
   private int capacity = DEFAULT_INITIAL_CAPACITY;

    public MyHashSetV2() {
        initBuckets();
    }

    public MyHashSetV2(int capacity) {
        this.capacity = capacity;
        initBuckets();
    }

    private void initBuckets() {
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public boolean add(Object value){
        int hasIndex = hashIndex(value);
        LinkedList<Object> bucket = buckets[hasIndex];
        if(bucket.contains(value)){
            return false;
        }

        bucket.add(value);
        size++;
        return true;
    }

    public boolean contains(Object searchValue){
        int hasIndex = hashIndex(searchValue);
        LinkedList<Object> bucket = buckets[hasIndex];
        return bucket.contains(searchValue);
    }

    public boolean remove(Object value){
        int hasIndex = hashIndex(value);
        LinkedList<Object> bucket = buckets[hasIndex];
        //값으로 지울라면 Object 숫자로 지울려면 Index로 지울 수 있다. 중요!
        boolean result = bucket.remove(value);
        if(result){
            size--;
            return true;
        }else return false;

    }

    public int getSize(){
        return size;
    }


    private int hashIndex(Object value){
        int hashCode = value.hashCode();
        int hashIndex = Math.abs(hashCode) % capacity;
        return hashIndex;
    }

    @Override
    public String toString() {
        return "MyHashSetV2{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
