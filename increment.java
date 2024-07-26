import java.util.*;
public class increment{
public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter Integer Value of a: ");
    int a = input.nextInt();
int b = a++;
System.out.println("a: " + a + ", b: " + b);
}
}