public interface MyInterfaceToQueue {
    void add(Object element);
    void clear();
    int size();
    Object peek();
    Object poll();
}
