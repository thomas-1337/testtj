public class CounterMain {
    public static void main(String[] args) {
        Counter myCounter = new Counter();
        System.out.println("Initial count: " + myCounter.getCount());

        myCounter.up();
        System.out.println("After first increment: " + myCounter.getCount());

        myCounter.up().up();
        System.out.println("After second increment: " + myCounter.getCount());

        myCounter.reset();
        System.out.println("After reset: " + myCounter.getCount());
    }
}
