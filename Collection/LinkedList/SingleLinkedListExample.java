class UserNoSuchElementException extends RuntimeException {
    UserNoSuchElementException() {
        super();
    }
}

class UserIndexOutOfBoundsException extends RuntimeException {
    UserIndexOutOfBoundsException(String desc) {
        super(desc);
    }
}

class UserLinkedList<E> {

    private int index;
    Node<E> head;
    Node<E> tail;

    // Node class
    class Node<E> {
        E ele;
        Node<E> next;

        Node(E ele) {
            this.ele = ele;
            this.next = null;
        }
    }

    // 1. size()
    public int size() {
        return index;
    }

    // 2. isEmpty()
    public boolean isEmpty() {
        return size() == 0;
    }

    // 3. add()
    public void add(E ele) {
        Node<E> newNode = new Node<>(ele);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

        index++;
    }

    // 4. toString()
    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        }

        String op = "[";
        Node<E> curr = head;

        while (curr != null) {
            op += curr.ele;

            if (curr.next != null) {
                op += ", ";
            }

            curr = curr.next;
        }

        op += "]";

        return op;
    }

    // 5. getFirst()
    public E getFirst() {
        if (isEmpty()) {
            throw new UserNoSuchElementException();
        }

        return head.ele;
    }

    // 6. getLast()
    public E getLast() {
        if (isEmpty()) {
            throw new UserNoSuchElementException();
        }

        return tail.ele;
    }

    // 7. addFirst()
    public void addFirst(E ele) {

        Node<E> newNode = new Node<>(ele);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }

        index++;
    }

    // 8. addLast()
    public void addLast(E ele) {
        add(ele);
    }

    // 9. checkIndex()
    public void checkIndex(int index) {

        if (index < 0 || index >= size()) {
            throw new UserIndexOutOfBoundsException(
                    "Invalid index: " + index
            );
        }
    }

    // 10. get(index)
    public E get(int index) {

        checkIndex(index);

        Node<E> curr = head;

        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }

        return curr.ele;
    }

    // 11. set(index, element)
    public E set(int index, E newEle) {

        checkIndex(index);

        Node<E> curr = head;

        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }

        E oldEle = curr.ele;
        curr.ele = newEle;

        return oldEle;
    }

    // 12. removeFirst()
    public E removeFirst() {

        if (isEmpty()) {
            throw new UserNoSuchElementException();
        }

        Node<E> tempNode = head;

        head = head.next;

        tempNode.next = null;

        index--;

        if (index == 0) {
            tail = null;
        }

        return tempNode.ele;
    }

    // 13. clear()
    public void clear() {

        head = null;
        tail = null;
        index = 0;
    }

    // 14. removeLast()
    public E removeLast() {

        if (isEmpty()) {
            throw new UserNoSuchElementException();
        }

        if (size() == 1) {
            return removeFirst();
        }

        Node<E> curr = head;

        while (curr.next != tail) {
            curr = curr.next;
        }

        E temp = tail.ele;

        curr.next = null;
        tail = curr;

        index--;

        return temp;
    }

    // 15. add(index, element)
    public void add(int index, E ele) {

        if (index < 0 || index > size()) {
            throw new UserIndexOutOfBoundsException(
                    "Invalid index: " + index
            );
        }

        if (index == 0) {
            addFirst(ele);
            return;
        }

        if (index == size()) {
            addLast(ele);
            return;
        }

        Node<E> newNode = new Node<>(ele);

        Node<E> curr = head;

        for (int i = 1; i < index; i++) {
            curr = curr.next;
        }

        newNode.next = curr.next;
        curr.next = newNode;

        this.index++;
    }

    // 16. addAll()
    public void addAll(UserLinkedList<E> newList) {

        for (int i = 0; i < newList.size(); i++) {
            addLast(newList.get(i));
        }
    }

    // 17. addAll(index, list)
    public void addAll(int index, UserLinkedList<E> newList) {

        if (index < 0 || index > size()) {
            throw new UserIndexOutOfBoundsException(
                    "Invalid index: " + index
            );
        }

        for (int i = 0; i < newList.size(); i++) {
            add(index++, newList.get(i));
        }
    }

    // 18. remove(index)
    public E remove(int index) {

        checkIndex(index);

        if (index == 0) {
            return removeFirst();
        }

        if (index == size() - 1) {
            return removeLast();
        }

        Node<E> curr = head;

        for (int i = 1; i < index; i++) {
            curr = curr.next;
        }

        Node<E> tempNode = curr.next;

        curr.next = tempNode.next;
        tempNode.next = null;

        this.index--;

        return tempNode.ele;
    }

    // 19. indexOf()
    public int indexOf(E ele) {

        Node<E> curr = head;
        int i = 0;

        while (curr != null) {

            if (curr.ele == null
                    ? ele == null
                    : curr.ele.equals(ele)) {
                return i;
            }

            curr = curr.next;
            i++;
        }

        return -1;
    }

    // 20. lastIndexOf()
    public int lastIndexOf(E ele) {

        Node<E> curr = head;
        int i = 0;
        int lastIndex = -1;

        while (curr != null) {

            if (curr.ele == null
                    ? ele == null
                    : curr.ele.equals(ele)) {
                lastIndex = i;
            }

            curr = curr.next;
            i++;
        }

        return lastIndex;
    }

    // 21. removeFirstOccurrence()
    public boolean removeFirstOccurrence(E ele) {

        int index = indexOf(ele);

        if (index != -1) {
            remove(index);
            return true;
        }

        return false;
    }

    // 22. removeLastOccurrence()
    public boolean removeLastOccurrence(E ele) {

        int index = lastIndexOf(ele);

        if (index != -1) {
            remove(index);
            return true;
        }

        return false;
    }

    // 23. reversed()
    public UserLinkedList<E> reversed() {

        UserLinkedList<E> newList = new UserLinkedList<>();

        Node<E> curr = head;

        while (curr != null) {
            newList.addFirst(curr.ele);
            curr = curr.next;
        }

        return newList;
    }
}


// Main class
public class SingleLinkedListExample {

    public static void main(String[] args) {

        UserLinkedList<Integer> list = new UserLinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println(list);

        list.addFirst(123);

        System.out.println(list);

        System.out.println("Size = " + list.size());

        System.out.println("First = " + list.getFirst());

        System.out.println("Last = " + list.getLast());

        System.out.println("Element at index 2 = " + list.get(2));

        list.set(2, 500);

        System.out.println("After set = " + list);

        list.removeFirst();

        System.out.println("After removeFirst = " + list);

        list.removeLast();

        System.out.println("After removeLast = " + list);
    }
}