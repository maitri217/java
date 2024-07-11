import java.util.Scanner;
class GFG {
  public static void main(String[] args)
  {  
  Scanner s = new Scanner(System.in);
  System.out.println("Enter the value of a");
  double a=s.nextDouble();
  System.out.println("Enter the value of b");
  double b=s.nextDouble();
  System.out.println("Enter the value of c");
  double c=s.nextDouble();
  System.out.println("Enter the value of d");
  double d=s.nextDouble();
  System.out.println("Enter the value of e");
  double e=s.nextDouble();
  System.out.println("Enter the value of f");
  double f=s.nextDouble();

 double x=((e*c)-(b*f))/((a*e)-(b*d));
 double y=((a*f)-(c*d))/((a*e)-(b*d));
 System.out.println("x="+x);
 System.out.println("y="+y);
}
}

