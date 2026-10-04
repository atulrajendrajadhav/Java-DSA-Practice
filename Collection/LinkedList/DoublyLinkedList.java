import java.util. *;


class  UserNoSuchElementException extends  RuntimeException  {
    UserNoSuchElementException() {
        super();
    }
}

class UserIndexOutOfBoundsException extends  RuntimeException {
    UserIndexOutOfBoundsException() {
        super();
    }
}
class UserDoublyLinkedList <E> {
    private int index ;
    private Node<E> head;
    private Node <E> tail;
    
    class Node <E> {
        E ele;
        Node<E> prev;
        Node<E> next;

        Node(E ele){
            this.ele  = ele;
        }
    }

    //1. Size 
    public int size() {
        return this.index;
    }

    //2. isEmpty
    public boolean isEmpty() {
        return this.size() == 0;
    } 

    // 3. getFrist
    public E getFrist() {
        if(isEmpty())throw new UserNoSuchElementException();
        return this.head.ele;
    }

    // 4. GetLast
    public E getLast() {
        if(isEmpty()) throw new UserNoSuchElementException();
        return  this.tail.ele;
    }

    @Override 
    public String toString() {
        if(isEmpty()) return "[]";

        String op = "[";
        Node<E> curr = head;
        while(curr.next != null){
            op += curr.ele+" ,";
            curr = curr.next;
        }
        op += curr.ele+ "]";
        return op;
    }

    //5. add
    public  void add(E ele) {
        Node<E> newNode = new Node<E>(ele);
        if(isEmpty()) {
            head  = newNode;
            tail = head;
        }
        else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        this.index ++;
    }

    // 6. get Frist
    public void addFirst( E ele) {
        Node<E> newNode = new Node<E>(ele);
        if(isEmpty()) {
            head = newNode;
            tail = head;
        }
        else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        this.index ++;
    }


    //7. add Last
    public void addLast(E ele) {
        add(ele);
    }

    //8 add 
    public void add(int index, E ele) {
        if(index<0 || index>size() ) 
            throw new UserIndexOutOfBoundsException();

        if(index==0) {
            addFirst(ele);
            return ;
        }

        if(index == size()) {
            addLast(ele);
            return ;
        }


        Node<E> newNode = new Node<E> (ele);
        Node<E> curr = head;
        for(int i=1; i<index; i++) {
            curr = curr.next;
        }
        newNode.next = curr.next;
        curr.next.prev = newNode;
        curr.next = newNode;
        newNode.prev = curr;
        
        this.index ++;
    }

    //9 removeFrist 
    public  E removeFrist() {
        if(isEmpty()) throw new UserNoSuchElementException();

        E temp = getFrist();
        head =head.next;
        head.prev.next  = null;
        head.prev =null;
        this.index --;
        return  temp;
    }


    // 10 remove last 
    public E removeLast() {
        if(isEmpty()) throw new UserNoSuchElementException() ;

        E temp = getLast();
        tail = tail.prev;
        tail.next.prev = null;
        tail.next = null;
        this.index --;
        return temp;
    }

    //11 remove
    public  E remove(int index) {
        if( index<0 || index> size())
            throw new UserNoSuchElementException();

        if(index == 0) return removeFrist();
        if(index == size()-1) return  removeLast();

        Node<E> curr = head;
        for(int i=1; i<index; i++) {
            curr = curr.next;
        }

        E temp = curr.next.ele;
        Node<E> temNode = curr.next;
        curr.next.prev = null;
        curr.next.next.prev = curr;
        curr.next = curr.next.next;

        temNode.next = null;
        this.index --;
        return  temp;
    } 
    
}



public class DoublyLinkedList {

    public static void main(String[] args) {

        UserDoublyLinkedList<Integer> list = new UserDoublyLinkedList<Integer> () ;
        System.out.println(list);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);
        list.addFirst(123);
        list.addLast(456);
        System.out.println(list);

        list.add(2, 45);
        System.out.println(list);
    }
}