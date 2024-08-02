public class static {
    // Static variable
    // This variable is shared among all instances of the Counter class.
    static int count = 0;

    // Constructor to increment the static variable 'count'
    public Counter() {
        count++;
    }

    // Method to display the value of the static variable 'count'
    public static void displayCount() {
        System.out.println("Number of instances created: " + count);
    }

    public static void main(String[] args) {
        // Creating instances of the Counter class
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        // All instances share the same static variable 'count'
        Counter.displayCount(); // Output will be: Number of instances created: 3
    }
}