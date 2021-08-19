public class MyStack {
    private int[] array;
    private int size;
    private int index;

    public MyStack(int size) {
        this.size = size;
        array = new int[size];
    }

    public int[] getArray() {
        return array;
    }

    public void push(int element) {
        if (isFull()) {
            throw new StackOverflowError("Stack is full");
        }
        array[index] = element;
        index++;
    }

    public int pop() {
        if (isEmpty()) {
            throw new StackOverflowError("Stack i null");
        }
        return array[--index];
    }

    public int size() {
        return index;
    }

    public boolean isEmpty() {
        if (index == 0) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if (index == size) {
            return true;
        }
        return false;
    }
}
