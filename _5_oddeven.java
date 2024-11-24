package basic;
import java.util.Scanner;

public class _5_oddeven {
    public static void main(String[] args) {
        int num; //variable define
        System.out.println("enter value:"); //print enter value as message
        Scanner sc=new Scanner(System.in); //create scanner object to take input
        num=sc.nextInt(); //take input from user

        //check condtion if number is % 2 then print even other print odd
        if(num%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }


    }
}
