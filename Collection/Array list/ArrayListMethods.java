import java.util.*;

class UserIndexOutOfBoundsException extends RuntimeException {

    UserIndexOutOfBoundsException(String desc) {
        super(desc);
    }
}

class UserNoSuchElementException extends RuntimeException {

    UserNoSuchElementException() {
        super();
    }
}

class UserArrayList<E> implements Cloneable {

    private E[] arr;
    private int index;

    private final int INITIAL_CAPACITY = 10;

    // Default constructor
    @SuppressWarnings("unchecked")
    public UserArrayList() {
        arr = (E[]) new Object[INITIAL_CAPACITY];
    }

    // Parameterized constructor
    @SuppressWarnings("unchecked")
    public UserArrayList(int capacity) {

        if (capacity < 0) {
            throw new IllegalArgumentException(
                    "Capacity cannot be negative"
            );
        }

        arr = (E[]) new Object[capacity];
    }

    // Returns number of elements
    public int size() {
        return this.index;
    }

    // Checks whether list is empty
    public boolean isEmpty() {
        return size() == 0;
    }

    // Returns current capacity
    public int capacity() {
        return arr.length;
    }

    // Converts list into String
    @Override
    public String toString() {

        if (isEmpty()) {
            return "[]";
        }

        String op = "[";

        for (int i = 0; i < size(); i++) {

            op += arr[i];

            if (i < size() - 1) {
                op += ", ";
            }
        }

        op += "]";

        return op;
    }

    // Calculates new capacity
    private int newCapacity(int oldCap) {

        if (oldCap == 0) {
            return 1;
        }

        return oldCap + oldCap / 2;
    }

    // Adds element at the end
    public boolean add(E ele) {

        if (size() == arr.length) {
            increaseCapacity();
        }

        arr[index++] = ele;

        return true;
    }

    // Increases array capacity
    @SuppressWarnings("unchecked")
    private void increaseCapacity() {

        E[] newArr =
                (E[]) new Object[newCapacity(arr.length)];

        for (int i = 0; i < size(); i++) {
            newArr[i] = arr[i];
        }

        arr = newArr;
    }

    // Reduces capacity to current size
    @SuppressWarnings("unchecked")
    public void trimToSize() {

        if (size() == arr.length) {
            return;
        }

        E[] newArr =
                (E[]) new Object[size()];

        for (int i = 0; i < size(); i++) {
            newArr[i] = arr[i];
        }

        arr = newArr;
    }

    // Makes sure capacity is at least newCap
    @SuppressWarnings("unchecked")
    public void ensureCapacity(int newCap) {

        if (newCap <= capacity()) {
            return;
        }

        E[] newArr =
                (E[]) new Object[newCap];

        for (int i = 0; i < size(); i++) {
            newArr[i] = arr[i];
        }

        arr = newArr;
    }

    // Checks whether element exists
    public boolean contains(E ele) {

        return indexOf(ele) != -1;
    }

    // Returns first occurrence index
    public int indexOf(E ele) {

        for (int i = 0; i < size(); i++) {

            if (Objects.equals(arr[i], ele)) {
                return i;
            }
        }

        return -1;
    }

    // Returns last occurrence index
    public int lastIndexOf(E ele) {

        for (int i = size() - 1; i >= 0; i--) {

            if (Objects.equals(arr[i], ele)) {
                return i;
            }
        }

        return -1;
    }

    // Clone
    @Override
    public Object clone() {

        try {
            UserArrayList<E> copy =
                    (UserArrayList<E>) super.clone();

            copy.arr = arr.clone();

            return copy;

        } catch (CloneNotSupportedException e) {

            throw new AssertionError(e);
        }
    }

    // Converts to Object array
    public Object[] toArray() {

        Object[] newArr =
                new Object[size()];

        for (int i = 0; i < size(); i++) {
            newArr[i] = arr[i];
        }

        return newArr;
    }

    // Converts to generic array
    public <T> T[] toArray(T[] a) {

        if (a.length < size()) {

            return Arrays.copyOf(
                    arr,
                    size(),
                    (Class<? extends T[]>) a.getClass()
            );
        }

        for (int i = 0; i < size(); i++) {
            a[i] = (T) arr[i];
        }

        if (a.length > size()) {
            a[size()] = null;
        }

        return a;
    }

    // Checks valid index
    private void checkIndex(int index) {

        if (index < 0 || index >= size()) {

            throw new UserIndexOutOfBoundsException(
                    "Index " + index
                    + " out of bounds for length "
                    + size()
            );
        }
    }

    // Gets element at index
    public E get(int index) {

        checkIndex(index);

        return arr[index];
    }

    // Gets first element
    public E getFirst() {

        if (isEmpty()) {
            throw new UserNoSuchElementException();
        }

        return arr[0];
    }

    // Gets last element
    public E getLast() {

        if (isEmpty()) {
            throw new UserNoSuchElementException();
        }

        return arr[size() - 1];
    }

    // Replaces element at index
    public E set(int index, E newEle) {

        checkIndex(index);

        E temp = arr[index];

        arr[index] = newEle;

        return temp;
    }

    // Adds element at beginning
    public void addFirst(E ele) {

        add(0, ele);
    }

    // Adds element at end
    public void addLast(E ele) {

        add(ele);
    }

    // Removes element at index
    public E remove(int index) {

        checkIndex(index);

        E temp = arr[index];

        for (int i = index; i < size() - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[size() - 1] = null;

        this.index--;

        return temp;
    }

    // Removes first element
    public E removeFirst() {

        if (isEmpty()) {
            throw new UserNoSuchElementException();
        }

        return remove(0);
    }

    // Removes last element
    public E removeLast() {

        if (isEmpty()) {
            throw new UserNoSuchElementException();
        }

        return remove(size() - 1);
    }

    // Adds element at specific index
    public void add(int index, E ele) {

        if (index < 0 || index > size()) {

            throw new UserIndexOutOfBoundsException(
                    "Invalid index: " + index
            );
        }

        if (size() == arr.length) {
            increaseCapacity();
        }

        // Shift elements to right
        for (int i = size(); i > index; i--) {
            arr[i] = arr[i - 1];
        }

        arr[index] = ele;

        this.index++;
    }

    // Adds all elements of another list
    public boolean addAll(UserArrayList<E> colln) {

        for (int i = 0; i < colln.size(); i++) {

            addLast(colln.get(i));
        }

        return true;
    }

    // Adds all elements starting from index
    public boolean addAll(
            int index,
            UserArrayList<E> colln) {

        if (index < 0 || index > size()) {

            throw new UserIndexOutOfBoundsException(
                    "Invalid index: " + index
            );
        }

        for (int i = 0; i < colln.size(); i++) {

            add(index++, colln.get(i));
        }

        return true;
    }

    // Removes all elements
    public void clear() {

        for (int i = 0; i < size(); i++) {
            arr[i] = null;
        }

        index = 0;
    }

    // Removes all occurrences of elements
    // present in another list
    public boolean removeAll(UserArrayList<E> colln) {

        if (isEmpty()) {
            return false;
        }

        boolean flag = false;

        for (int i = 0; i < colln.size(); i++) {

            E ele = colln.get(i);

            while (true) {

                int pos = indexOf(ele);

                if (pos == -1) {
                    break;
                }

                remove(pos);

                flag = true;
            }
        }

        return flag;
    }
}


// Main class
public class ArrayListMethods {

    public static void main(String[] args) {

        // Normal Java ArrayList
        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(10);
        list1.add(24);
        list1.add(44);
        list1.add(84);

        System.out.println("Java ArrayList: " + list1);


        // Our custom ArrayList
        UserArrayList<Integer> list2 =
                new UserArrayList<>();

        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(40);

        System.out.println("UserArrayList: " + list2);


        // Third list
        UserArrayList<Integer> list3 =
                new UserArrayList<>();

        list3.add(110);
        list3.add(120);
        list3.add(130);
        list3.add(140);

        System.out.println("UserArrayList 3: " + list3);


        // Testing methods

        System.out.println("Size: " + list2.size());

        System.out.println("First: " + list2.getFirst());

        System.out.println("Last: " + list2.getLast());

        System.out.println("Element at index 2: "
                + list2.get(2));

        list2.set(2, 500);

        System.out.println("After set: " + list2);

        list2.addFirst(5);

        System.out.println("After addFirst: " + list2);

        list2.addLast(100);

        System.out.println("After addLast: " + list2);

        list2.add(2, 999);

        System.out.println("After add(index): " + list2);

        list2.remove(2);

        System.out.println("After remove(index): " + list2);

        list2.removeFirst();

        System.out.println("After removeFirst: " + list2);

        list2.removeLast();

        System.out.println("After removeLast: " + list2);
    }
}

