package by.glinkiy.lesson5.tast28;

public class AnyTypeArray<T> {
    private T[] arr;

    public T getArrIndex(int i) {

        return arr[i];
    }

    public void setArr(T[] arr) {

        this.arr = arr;
    }

    public int getLength() {

        return arr.length;
    }
}
