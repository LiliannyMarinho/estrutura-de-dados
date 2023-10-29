package linkedList;

public class Node {
    private int data;
    private Node prox;

    public Node(int newdata){
        this.data = newdata;
    }
    public int getData(){
        return data;
    }
    public void setData(int data){
        this.data = data;
    }
    public Node getProx(){
        return prox;
    }
    public void setProx(Node prox){
        this.prox = null;
    }
}
