package day2;
import java.util.Scanner;

public class vow_con_check {
    public static void main(String[] args) {
        int ch;
        System.out.println("enter character:");
        Scanner sc=new Scanner(System.in); //create scanner object to take input
        ch=sc.next().charAt(0);//take input from user

        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') //check condtion 
        {
            System.out.println("vowel");
        }
        else{
            System.out.println("consonets");
        }
    }
}
