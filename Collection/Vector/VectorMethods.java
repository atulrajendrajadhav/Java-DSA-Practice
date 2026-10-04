
import java.util.Collection;
import java.util.Enumeration;
import java.util.NoSuchElementException;
import java.util.Objects;

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

class UserVector<E> implements Cloneable {

    // Internal array
    private E[] arr;

    // Number of elements
    private int index;

    // Capacity increment
    private int capacityIncrement;

    // Default capacity
    private static final int DEFAULT_CAPACITY = 10;

    // =========================================================
    // CONSTRUCTORS
    // =========================================================

    // 1. Default constructor
    public UserVector() {
        this(DEFAULT_CAPACITY, 0);
    }

    // 2. Constructor with initial capacity
    public UserVector(int initialCapacity) {
        this(initialCapacity, 0);
    }

    // 3. Constructor with capacity and capacity increment
    @SuppressWarnings("unchecked")
    public UserVector(
            int initialCapacity,
            int capacityIncrement) {

        if (initialCapacity < 0) {
            throw new IllegalArgumentException(
                    "Illegal Capacity: "
                            + initialCapacity);
        }

        if (capacityIncrement < 0) {
            throw new IllegalArgumentException(
                    "Illegal Capacity Increment: "
                            + capacityIncrement);
        }

        arr = (E[]) new Object[initialCapacity];

        this.capacityIncrement = capacityIncrement;
        this.index = 0;
    }

    // 4. Constructor from Collection
    public UserVector(Collection<? extends E> collection) {

        this(collection.size(), 0);

        addAll(collection);
    }

    // =========================================================
    // BASIC METHODS
    // =========================================================

    // Returns number of elements
    public synchronized int size() {
        return index;
    }

    // Returns capacity
    public synchronized int capacity() {
        return arr.length;
    }

    // Checks empty
    public synchronized boolean isEmpty() {
        return index == 0;
    }

    // =========================================================
    // CAPACITY METHODS
    // =========================================================

    // Ensures minimum capacity
    public synchronized void ensureCapacity(int minCapacity) {

        if (minCapacity <= arr.length) {
            return;
        }

        grow(minCapacity);
    }

    // Increases capacity
    @SuppressWarnings("unchecked")
    private void grow(int minCapacity) {

        int oldCapacity = arr.length;

        int newCapacity;

        if (capacityIncrement > 0) {

            newCapacity = oldCapacity + capacityIncrement;

        } else {

            // Similar idea to Vector's automatic growth
            newCapacity = oldCapacity * 2;
        }

        if (newCapacity < minCapacity) {
            newCapacity = minCapacity;
        }

        E[] newArr = (E[]) new Object[newCapacity];

        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }

        arr = newArr;
    }

    // Reduces capacity to current size
    @SuppressWarnings("unchecked")
    public synchronized void trimToSize() {

        if (index == arr.length) {
            return;
        }

        E[] newArr = (E[]) new Object[index];

        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }

        arr = newArr;
    }

    // =========================================================
    // ADD METHODS
    // =========================================================

    // add(element)
    public synchronized boolean add(E ele) {

        ensureCapacity(index + 1);

        arr[index++] = ele;

        return true;
    }

    // add(index, element)
    public synchronized void add(
            int index,
            E ele) {

        checkPositionIndex(index);

        ensureCapacity(this.index + 1);

        for (int i = this.index; i > index; i--) {
            arr[i] = arr[i - 1];
        }

        arr[index] = ele;

        this.index++;
    }

    // addElement(element)
    public synchronized void addElement(E ele) {

        add(ele);
    }

    // addFirst
    public synchronized void addFirst(E ele) {

        add(0, ele);
    }

    // addLast
    public synchronized void addLast(E ele) {

        add(ele);
    }

    // =========================================================
    // INSERT METHOD
    // =========================================================

    // Vector-specific legacy method
    public synchronized void insertElementAt(
            E ele,
            int index) {

        add(index, ele);
    }

    // =========================================================
    // ADD ALL METHODS
    // =========================================================

    public synchronized boolean addAll(
            Collection<? extends E> collection) {

        boolean modified = false;

        for (E ele : collection) {
            add(ele);
            modified = true;
        }

        return modified;
    }

    public synchronized boolean addAll(
            int index,
            Collection<? extends E> collection) {

        checkPositionIndex(index);

        boolean modified = false;

        for (E ele : collection) {

            add(index, ele);

            index++;

            modified = true;
        }

        return modified;
    }

    // =========================================================
    // GET METHODS
    // =========================================================

    public synchronized E get(int index) {

        checkIndex(index);

        return arr[index];
    }

    // Vector-specific method
    public synchronized E elementAt(int index) {

        checkIndex(index);

        return arr[index];
    }

    // First element
    public synchronized E firstElement() {

        if (isEmpty()) {
            throw new UserNoSuchElementException();
        }

        return arr[0];
    }

    // Last element
    public synchronized E lastElement() {

        if (isEmpty()) {
            throw new UserNoSuchElementException();
        }

        return arr[index - 1];
    }

    // =========================================================
    // SET METHODS
    // =========================================================

    public synchronized E set(
            int index,
            E newEle) {

        checkIndex(index);

        E oldEle = arr[index];

        arr[index] = newEle;

        return oldEle;
    }

    // Vector-specific method
    public synchronized void setElementAt(
            E ele,
            int index) {

        checkIndex(index);

        arr[index] = ele;
    }

    // =========================================================
    // SEARCH METHODS
    // =========================================================

    public synchronized boolean contains(E ele) {

        return indexOf(ele) != -1;
    }

    public synchronized int indexOf(E ele) {

        for (int i = 0; i < index; i++) {

            if (Objects.equals(arr[i], ele)) {
                return i;
            }
        }

        return -1;
    }

    // indexOf(element, startIndex)
    public synchronized int indexOf(
            E ele,
            int startIndex) {

        if (startIndex < 0) {
            startIndex = 0;
        }

        for (int i = startIndex; i < index; i++) {

            if (Objects.equals(arr[i], ele)) {
                return i;
            }
        }

        return -1;
    }

    public synchronized int lastIndexOf(E ele) {

        for (int i = index - 1; i >= 0; i--) {

            if (Objects.equals(arr[i], ele)) {
                return i;
            }
        }

        return -1;
    }

    public synchronized int lastIndexOf(
            E ele,
            int startIndex) {

        if (startIndex >= index) {
            startIndex = index - 1;
        }

        for (int i = startIndex; i >= 0; i--) {

            if (Objects.equals(arr[i], ele)) {
                return i;
            }
        }

        return -1;
    }

    // =========================================================
    // REMOVE METHODS
    // =========================================================

    public synchronized E remove(int index) {

        checkIndex(index);

        E temp = arr[index];

        for (int i = index; i < this.index - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[this.index - 1] = null;

        this.index--;

        return temp;
    }

    // remove(Object)
    public synchronized boolean remove(Object obj) {

        int pos = indexOfObject(obj);

        if (pos == -1) {
            return false;
        }

        remove(pos);

        return true;
    }

    // Vector-specific method
    public synchronized boolean removeElement(
            Object obj) {

        return remove(obj);
    }

    // Vector-specific method
    public synchronized void removeElementAt(
            int index) {

        remove(index);
    }

    // Remove first
    public synchronized E removeFirst() {

        if (isEmpty()) {
            throw new UserNoSuchElementException();
        }

        return remove(0);
    }

    // Remove last
    public synchronized E removeLast() {

        if (isEmpty()) {
            throw new UserNoSuchElementException();
        }

        return remove(index - 1);
    }

    // Vector-specific method
    public synchronized void removeAllElements() {

        clear();
    }

    // =========================================================
    // CLEAR
    // =========================================================

    public synchronized void clear() {

        for (int i = 0; i < index; i++) {
            arr[i] = null;
        }

        index = 0;
    }

    // =========================================================
    // REMOVE ALL
    // =========================================================

    public synchronized boolean removeAll(
            Collection<?> collection) {

        boolean modified = false;

        for (int i = 0; i < index;) {

            if (collection.contains(arr[i])) {

                remove(i);

                modified = true;

            } else {

                i++;
            }
        }

        return modified;
    }

    // =========================================================
    // RETAIN ALL
    // =========================================================

    public synchronized boolean retainAll(
            Collection<?> collection) {

        boolean modified = false;

        for (int i = 0; i < index;) {

            if (!collection.contains(arr[i])) {

                remove(i);

                modified = true;

            } else {

                i++;
            }
        }

        return modified;
    }

    // =========================================================
    // SET SIZE
    // =========================================================

    public synchronized void setSize(int newSize) {

        if (newSize < 0) {
            throw new IllegalArgumentException(
                    "Negative size");
        }

        ensureCapacity(newSize);

        if (newSize < index) {

            for (int i = newSize; i < index; i++) {
                arr[i] = null;
            }

        } else {

            for (int i = index; i < newSize; i++) {
                arr[i] = null;
            }
        }

        index = newSize;
    }

    // =========================================================
    // COPY METHODS
    // =========================================================

    public synchronized void copyInto(
            Object[] destination) {

        if (destination.length < index) {

            throw new IndexOutOfBoundsException(
                    "Destination array is too small");
        }

        for (int i = 0; i < index; i++) {
            destination[i] = arr[i];
        }
    }

    // =========================================================
    // ARRAY METHODS
    // =========================================================

    public synchronized Object[] toArray() {

        Object[] newArr = new Object[index];

        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }

        return newArr;
    }

    // =========================================================
    // ENUMERATION
    // =========================================================

    public synchronized Enumeration<E> elements() {

        return new Enumeration<E>() {

            private int current = 0;

            @Override
            public boolean hasMoreElements() {

                return current < size();
            }

            @Override
            public E nextElement() {

                if (current >= size()) {

                    throw new NoSuchElementException();
                }

                return get(current++);
            }
        };
    }

    // =========================================================
    // CLONE
    // =========================================================

    @Override
    public synchronized Object clone() {

        try {

            UserVector<E> copy = (UserVector<E>) super.clone();

            copy.arr = arr.clone();

            return copy;

        } catch (CloneNotSupportedException e) {

            throw new AssertionError(e);
        }
    }

    // =========================================================
    // HELPER METHODS
    // =========================================================

    private void checkIndex(int index) {

        if (index < 0 || index >= size()) {

            throw new UserIndexOutOfBoundsException(
                    "Index " + index
                            + " out of bounds for length "
                            + size());
        }
    }

    private void checkPositionIndex(int index) {

        if (index < 0 || index > size()) {

            throw new UserIndexOutOfBoundsException(
                    "Index " + index
                            + " out of bounds");
        }
    }

    private int indexOfObject(Object obj) {

        for (int i = 0; i < index; i++) {

            if (Objects.equals(arr[i], obj)) {
                return i;
            }
        }

        return -1;
    }

    // =========================================================
    // STRING
    // =========================================================

    @Override
    public synchronized String toString() {

        if (isEmpty()) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder("[");

        for (int i = 0; i < index; i++) {

            sb.append(arr[i]);

            if (i < index - 1) {
                sb.append(", ");
            }
        }

        sb.append("]");

        return sb.toString();
    }
}

// =============================================================
// MAIN CLASS
// =============================================================

public class VectorMethods {

    public static void main(String[] args) {

        // ==========================================
        // 1. Default constructor
        // ==========================================

        UserVector<Integer> v1 = new UserVector<>();

        v1.add(10);
        v1.add(20);
        v1.add(30);
        v1.add(40);

        System.out.println("v1 = " + v1);

        // ==========================================
        // 2. Capacity
        // ==========================================

        System.out.println(
                "Size = " + v1.size());

        System.out.println(
                "Capacity = " + v1.capacity());

        // ==========================================
        // 3. First and Last
        // ==========================================

        System.out.println(
                "First = " + v1.firstElement());

        System.out.println(
                "Last = " + v1.lastElement());

        // ==========================================
        // 4. Get
        // ==========================================

        System.out.println(
                "Element at index 2 = "
                        + v1.get(2));

        // ==========================================
        // 5. Set
        // ==========================================

        v1.set(2, 500);

        System.out.println(
                "After set = " + v1);

        // ==========================================
        // 6. Add First
        // ==========================================

        v1.addFirst(5);

        System.out.println(
                "After addFirst = " + v1);

        // ==========================================
        // 7. Add Last
        // ==========================================

        v1.addLast(100);

        System.out.println(
                "After addLast = " + v1);

        // ==========================================
        // 8. Insert
        // ==========================================

        v1.insertElementAt(999, 2);

        System.out.println(
                "After insert = " + v1);

        // ==========================================
        // 9. Remove
        // ==========================================

        v1.remove(2);

        System.out.println(
                "After remove = " + v1);

        // ==========================================
        // 10. Search
        // ==========================================

        System.out.println(
                "Contains 30 = "
                        + v1.contains(30));

        System.out.println(
                "Index of 30 = "
                        + v1.indexOf(30));

        // ==========================================
        // 11. Legacy methods
        // ==========================================

        v1.addElement(200);

        System.out.println(
                "After addElement = " + v1);

        System.out.println(
                "Element at 0 = "
                        + v1.elementAt(0));

        // ==========================================
        // 12. Enumeration
        // ==========================================

        System.out.println("Enumeration:");

        Enumeration<Integer> e = v1.elements();

        while (e.hasMoreElements()) {

            System.out.println(
                    e.nextElement());
        }

        // ==========================================
        // 13. Remove first/last
        // ==========================================

        v1.removeFirst();

        System.out.println(
                "After removeFirst = " + v1);

        v1.removeLast();

        System.out.println(
                "After removeLast = " + v1);
    }
}
