public class local {
    public void myMethod() {
        // 'a' is a local variable within the myMethod function
        int a = 10;
        if (a == 10) {
            // 'b' is a local variable within this 'if' block
            int b = 20;
            System.out.println("Inside if block, b = " + b);
        }

        // This line is commented out because it would cause a compile-time error
        // System.out.println("Outside if block, b = " + b); 

        System.out.println("Value of a = " + a); // This is fine as 'a' is within its scope
    }

    public static void main(String[] args) {
        Example example = new Example();
        example.myMethod();
    }
}