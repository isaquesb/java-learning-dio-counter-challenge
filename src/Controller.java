public class Controller {

    public static void main(String[] args) {
        NumberCatcher numberCatcher = new NumberCatcher();

        int start = numberCatcher.getInteger("Enter the start number: ", 0);

        int end = numberCatcher.getInteger("Enter the end number: ", start);

        Counter counter = new Counter(start, end);

        counter.printInterval();
    }
}
