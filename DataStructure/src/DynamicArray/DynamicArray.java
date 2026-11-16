package DynamicArray;

public class DynamicArray {

    int size;
    int capacity = 10;

    Object[] array;

    public DynamicArray() {
        this.array = new Object[capacity];
    }

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.array = new Object[capacity];
    }

    public void add(Object data) {
        if (size == capacity) {
            grow();
        }
        array[size++] = data;
    }

    public void insert(Object data, int index) {
        if (size >= capacity) {
            grow();
        }
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1]; //shift over
        }
        array[index] = data;
        size++;
    }

    public void delete(Object data) {
        //l-R
        for (int i = 0; i < size; i++) {
            if (array[i] == data ) { // ==data .equals(data)
                //shift to the left
                for (int j = i; j < (size - i - 1); j++) {
                    array[i + j] = array[i + j + 1];
                    //array[j] = array[j + 1];
                }
                array[size - 1] = null;
                size--;
                //shrink ;
                if (size <=(int) (capacity / 3)) {
                    shrink();
                }
                break;
            }
        }

    }

    public int search(Object data) {

        for (int i = 0; i < size; i++) {
            if (array[i] == data) { //.equals(data)
                return i;
            }
        }
         return  -1;
    }

    private void grow() {
        int newCapacity = (int)(capacity * 2);
        Object[] newArray = new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array    = newArray;
    }

    private void shrink() {
        int newCapacity = (int)(capacity / 2);
        Object[] newArray = new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array    = newArray;
    }

    public  boolean isEmpty() {
        return size == 0;
    }

    public String toString() {

        String string = "" ;

        for (int i = 0; i < capacity; i++){ //size - capacity
            string += array[i] + ", ";
        }

        if (string !=""){

            string = "[" + string.substring(0, string.length() - 2) + "]";
        }
        else {
            string = "[]";
        }
        return string;
    }
}
