public class MyQueuePallindrome<T> {
    private Node head;
    private Node tail;
    private int size;

    MyQueuePallindrome(){
        this.head = null;
        this.tail = null;
    }
    public class Node{
        private T data;
        private Node next;
        Node(T data ){
            this.data = data;
            this.next = null;
        }
    }
    public void enqueue(T element){
        Node newNode = new Node(element);
        if( head == null){
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = tail.next;
        size++;
    }
    public T deqeue(){
        if(head == null){
            return null;
        }
        Node token = head;
        head = head.next;
        size--;
        return token.data;
    }
    public int size(){
        return size;
    }
    public boolean isEmty(){
        return head == null;
    }
}
