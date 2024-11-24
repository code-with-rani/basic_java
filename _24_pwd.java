package day5;
import java.util.Scanner; //import scanner class for input
public class pwd {
    public static void main(String args[])
    {
        int pwd;
        System.out.println("enter password:"); //display
        Scanner sc=new Scanner(System.in); //create scanner ob to take input from user
        pwd=sc.nextInt(); //take input from user

        //check condtion using if else statement to check if pwd===123
        // then print correct psd otherwise else execute print incoorect password.
        //it is used when we want to execute two statement for a single condtion
        if(pwd==123){
            System.out.println("correct password..");
            System.out.println("welcome to rani kumari");
            System.out.println("my age:22");
            System.out.println("my contact :1234567890");
            System.out.println("my address: india");
        }
        else{
            System.out.println("incorrect password..");
        }
    }
}