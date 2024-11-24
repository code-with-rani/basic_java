//this program is used to print character 
//like a----->a 
package day2;
import java.util.Scanner; //import scanner for take input
public class char_print {
    public static void main(String[] args) {
        char ch;
        System.out.println("enter character:"); //to print
        Scanner sc=new Scanner(System.in); //take input from user
        ch=sc.next().charAt(0);
        System.out.println(ch); //to print output
    }
}
