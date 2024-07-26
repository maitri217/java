import java.util.*;
public class explicity{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the value of q:");
        double q=input.nextDouble();
        double r=q;
        System.out.println("double value:"+r);
        long s=(long)r;
        System.out.println("long value:"+s);
        int t=(int)s;
        System.out.println("int value:"+t);
    }
}