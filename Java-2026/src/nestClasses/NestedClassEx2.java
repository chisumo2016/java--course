package nestClasses;


import java.util.Iterator;

class MyArray implements Iterable<Integer>{
    private Integer arr[];
    private int size;
    private int currentPosition; //-1, 1 ,0 , 1

    public MyArray(int size) { // should mention size
        this.size = size;
        arr = new Integer[size];
        currentPosition = -1;
    }

    // add some value to array eg size = 1  1 - 1 = 0
    public void add(Integer value) {
        if (currentPosition < size - 1) {
            currentPosition++;
            arr[currentPosition] = value;  //++currentPosition
        }else {
            throw new ArrayIndexOutOfBoundsException("Array is full" + currentPosition);
        }
    }

    public  void printArray() {
        for (int i = 0; i <= currentPosition; i++) {
            System.out.println(arr[i]);
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return new MyArrayIterator();
    }

    //inner class

    class MyArrayIterator implements Iterator<Integer> {

        private int position = 0;


        @Override
        public boolean hasNext() {
            return position <= currentPosition;
        }

        @Override
        public Integer next() {
            return arr[position++];  //0 ,0+ 1, 1+1 , 2+1
        }
    }
}
public class NestedClassEx2 {

    public static void main(String[] args) {

        MyArray obj = new MyArray(5);
        obj.add(1);
        obj.add(2);
        obj.add(3);
        obj.add(4);
        obj.add(5);
        obj.printArray();

//        for (Integer i : obj) {
//            System.out.println(i);
//        }

        Iterator<Integer> iterator = obj.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
