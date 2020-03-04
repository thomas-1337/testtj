public class Counter {
    private int count = 0;

    public int getCount() {
        return count;
    }

    public Counter up() {
        count++;
        return this;
    }

    public Counter reset() {
        count = 0;
        return this;
    }
}

