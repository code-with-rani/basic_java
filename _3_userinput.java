package basic;
import java.util.Scanner; //import scanner for input 
public class _3_userinput {
    public static void main(String[] args) {
        int n; //variable defined
        System.out.println("enter value:"); //print enter value as message
        Scanner sc=new Scanner(System.in); //create scanner object to take input
        n=sc.nextInt(); //take input from user
        System.out.println(n); //display input

    }
}
