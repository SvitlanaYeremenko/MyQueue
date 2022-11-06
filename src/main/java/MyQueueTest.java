public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue<String> myQueue = new MyQueue<>();
        myQueue.add("First");
        myQueue.add("Second");
        myQueue.add("Third");
        myQueue.add("Fourth");
        System.out.println("My Queue = " + myQueue);

        System.out.println("My Queue size = " + myQueue.size());

        System.out.println("First element from the queue = " + myQueue.peek());

        myQueue.poll();
        System.out.println("Collection after removing the first element = " + myQueue);

        myQueue.clear();
        System.out.println("Collection after clear = " + myQueue);
    }
}
