package Stack;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class MyGenericStack<T> {
    private LinkedList<T> stack;

    public MyGenericStack(LinkedList<T> stack) {
        this.stack = stack;
    }

    public MyGenericStack() {
        stack = new LinkedList<>();
    }

    public void push(T element){
        stack.addFirst(element);

    }
    public boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }
    public T pop() {
        if (stack.isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }
    public int size() {
        return stack.size();
    }
}
