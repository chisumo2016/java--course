package generics;

public class Box<T> {  //Thing

    T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return this.item;
    }
}
