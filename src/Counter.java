public class Counter {

    private int start;

    private int end;

    public Counter(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void printInterval() {
        System.out.println("Printing numbers from " + start + " to " + end + ":");
        for (int i = start; i <= end; i++) {
            System.out.println("Printing number: " + i);
        }
    }
}
