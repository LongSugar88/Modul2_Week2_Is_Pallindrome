import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyStackPanlllindrome<T> {
    private LinkedList<T> stack;
    public MyStackPanlllindrome(){
        stack = new LinkedList<>();
    }
    public void push(T element){
        stack.addFirst(element);
    }
    public T pop(){
        if(stack.size() == 0){
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }
    public int size(){
        return stack.size();
    }
    public boolean isEmpty(){
        return stack.size() == 0;
    }
}
