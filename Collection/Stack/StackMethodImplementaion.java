class UserEmptyStackException extends RuntimeException {
    UserEmptyStackException() {
        super();
    }
}

class UserIndexOutOfBoundException extends  RuntimeException {
    UserIndexOutOfBoundException ( String desc) {
        super(desc);
    }
}

class UserVector <E> {
    private E[] arr;
    private int index;
    
    //Contructor
    UserVector() {
        arr = (E[]) new Object[10];
    }

    //size
    public int size() {
        return this.index;
    }

    // isEmpty
    public boolean isEmpty() {
        return size() == 0;
    }

    // toString Override 
    public String toString() {
        if( isEmpty()) return "[]";
        String op = "[";

        for(int i=0; i<size()-1; i++) {
            op += arr[i]  + " ,";
        }
        op += arr[size() -1] + "]";
        return op;
    }

    // addElement 
    public void addElement( E ele) {
        if(size() == arr.length) {
            E [] newArr = (E[])new Object[arr.length*2];
            for(int i=0; i<size(); i++)  {
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
        arr[index++] = ele;
    }

    // elemnetAt(E index)
    public E elemnetAt(int index) {
        if(index <0 || index>= size())
            throw new UserIndexOutOfBoundException("Invalid index: "+index+ "for Length "+size());
            return this.arr[index];
    }

    // removeElement
    public E removeElementAt(int index) {
    if (index < 0 || index >= size()) {
        throw new UserIndexOutOfBoundException("Invalid index: " + index + " for Length " + size());
    } // Fixed missing closing brace for the if block
    
    E temp = arr[index];
    for (int i = index; i < size() - 1; i++) {
        arr[i] = arr[i + 1];
    }
    arr[size() - 1] = null;
    this.index--; 
    return temp;
} // Added missing closing brace for removeElementAt method

public int lastIndexOf(E ele) {
    if (isEmpty()) return -1;
    for (int i = size() - 1; i >= 0; i--) {
        if (arr[i].equals(ele)) return i;
    }
    return -1;
}

    
}
    // Stack implement Vector
    class UserStack <E> extends UserVector<E> {
        public UserStack() {
            super();
        }

        public synchronized E push( E ele) {
            addElement(ele);
            return  ele;
        }

        public  synchronized boolean empty() {
            return  isEmpty();
        }

        public synchronized E peak () {
            int len = size();
            if(len ==0)
                throw new UserEmptyStackException ();
            return  elemnetAt(len -1 );
        }

        public  synchronized E pop() {
            int len = size();
            E temp = peak();
            removeElementAt(len - 1);
            return  temp;
        }

        public synchronized int search(E ele) {
            int i = lastIndexOf(ele);
            if(i>=0) {
                return size()-1;
            }
            return  - 1;
        }
}


public class StackMethodImplementaion {
    public static void main(String[] args) {
        UserStack<Integer> stack = new UserStack<Integer>() ;
        System.out.println(stack.empty());

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println(stack);
        System.out.println(stack.empty());
        System.out.println(stack);
        System.out.println(stack.peak());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.size());

    }
}