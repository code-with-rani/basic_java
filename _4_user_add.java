package basic;
import java.util.Scanner; //import scanner for input
public class _4_user_add {
    public static void main(String[] args) {
        int a,b; //create variable
        System.out.println("enter value:"); //print message
        Scanner sc=new Scanner(System.in); //create scanner object to take input
        a=sc.nextInt(); //take input from user
        b=sc.nextInt(); //take input from user

        System.out.println("sum:"+(a+b));

    }
   
    
}
