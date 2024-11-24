package day2;
import java.util.Scanner;//import scanner for user input
public class greatest_no {
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("enter 1st value:");
        Scanner sc=new Scanner(System.in); //create scanner obj to take input from user
        a=sc.nextInt();
        System.out.println("enter 2nd no:");
        b=sc.nextInt();
        System.out.println("enter 3rd no");
        c=sc.nextInt();

        if(a>b)
        {
            if(a>c)
            {
                System.out.println(a);
            }
            else{
                System.out.println(c);
            }
        }
        else{
            if(b>c){
                System.out.println(a);
            }
            else{
                System.out.println(c);
            }
        }

    }
}
