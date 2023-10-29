package linkedList;

public class Main {
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        System.out.println(list.getSize());
        list.insert(4);
        list.insert(5);
        list.insert(8);
        System.out.println(list.getSize());
        System.out.println(list.getFirst().getData());
        System.out.println(list.getLast().getData());
    }
}
