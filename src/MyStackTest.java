import java.util.Arrays;

public class MyStackTest {
    public static void main(String[] args) {
        MyStack myStack = new MyStack(10);

        myStack.push(1);
        myStack.push(11);
        myStack.push(111);
        myStack.push(1111);
        myStack.push(11111);
        myStack.push(111111);
        myStack.push(1111111);
        myStack.push(11111111);
        myStack.push(111111111);
        myStack.push(1111111111);
        System.out.println(Arrays.toString(myStack.getArray()));
        System.out.println("size : " + myStack.size());
        System.out.println("===========================");

        System.out.println("Check full : " + myStack.isFull());
        System.out.println("===========================");

        while (!myStack.isEmpty()) {
            System.out.println(myStack.pop());
        }
        System.out.println("size : " + myStack.size());

        System.out.println("===========================");

        System.out.println("Check null : " + myStack.isEmpty());
        System.out.println("===========================");

    }
}
