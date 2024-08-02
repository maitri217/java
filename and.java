import java.util.Scanner;
class Helloworld{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a");
        int a=sc.nextInt();
        System.out.println("enter the value of b");
        int b=sc.nextInt();
        if((a>1 || a<0) || (b>=2 || b<0)){
            System.out.println("Enter the valid input");
        }
        else{
        if(a==1 || b==1){
            System.out.println("This is true");
           }
        else{
            System.out.println("This is false");
        }
        }
  }
}

