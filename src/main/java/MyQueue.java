import java.util.Arrays;

public class MyQueue<E> implements MyInterfaceToQueue {
    private int size = 0;
    private MyQueue.Node<E> first;
    private MyQueue.Node<E> last;

    private static class Node<E> {
        E item;
        MyQueue.Node<E> next;
        MyQueue.Node<E> previous;

        Node(MyQueue.Node<E> previous, E element, MyQueue.Node<E> next) {
            this.item = element;
            this.next = next;
            this.previous = previous;
        }
    }

    @Override
    public void add(Object value) {
        MyQueue.Node<E> l = last;
        MyQueue.Node<E> newNode = new MyQueue.Node(l, value, null);
        last = newNode;
        if (l == null) {
            first = newNode;
        } else {
            l.next = newNode;
        }
        size++;
    }

    @Override
    public void clear() {
        for (MyQueue.Node<E> x = first; x != null; ) {
            MyQueue.Node<E> next = x.next;
            x.item = null;
            x.next = null;
            x.previous = null;
            x = next;
        }
        first = last = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object peek() {
        MyQueue.Node<E> x = first;
        E element = x.item;
        return element;
    }

    @Override
    public Object poll() {
        MyQueue.Node<E> x = first;
        E element = x.item;
        MyQueue.Node<E> next = x.next;
        x.item = null;
        x.next = null;
        first = next;
        if (next == null) {
            last = null;
        } else {
            next.previous = null;
        }
        size--;
        return element;
    }

    @Override
    public String toString() {
        Object[] result = new Object[size];
        int i = 0;
        for (MyQueue.Node<E> x = first; x != null; x = x.next) {
            result[i++] = x.item;
        }
        return Arrays.toString(result);
    }
}
