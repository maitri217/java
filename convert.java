import java.util.*;
class converter{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("the value of meter=");
        double meter=s.nextDouble();
        double feet=meter*3.281;
        System.out.println("feet="+feet);
    }
}