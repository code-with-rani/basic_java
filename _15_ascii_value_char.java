// this program is used to print ascii value of character 
//like if we input a then output show result a ascii value 65 print 
package day2;
import java.util.Scanner; //import scanner for input 
public class ascii_value_char {
    public static void main(String[] args) {
        char ch;
        System.out.println("enter character :"); //display 
        Scanner sc=new Scanner(System.in); //create scanner object to take input from user
        ch=sc.next().charAt(0); //take input from user

        int a=ch; 
        System.out.println("asciii is"+" "+a);

    }
}
