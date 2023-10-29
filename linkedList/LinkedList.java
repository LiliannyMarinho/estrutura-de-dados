package linkedList;

public class LinkedList {
    private Node first; //primeiro
    private Node last; //último
    private int size; //tamanho

    public LinkedList(){
        this.size = 0;
    }
    public Node getFirst(){
        return first;
    }
    public void setFirst(Node first){
        this.first = first;
    }
    public Node getLast(){
        return last;
    }
    public void setLast(Node last){
        this.last = last;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }

    public void insert(int newdata){
        Node newNode = new Node(newdata);
        if(isEmpty()){
            first = newNode;
            last = newNode;
        }else{
            last.setProx(newNode);
            last = newNode;
        }
        size++;
    }

    public void remove(int newdata){

    }

    public boolean isEmpty(){
        return first == null;
    }

    public boolean isFull(){
        return first != null;
    }

}
