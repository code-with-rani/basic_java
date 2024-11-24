package day2;
import java.util.Scanner; //import Scanner for user input
public class power_no {
    public static void main(String[] args) {
        int n,p,result=1;
        System.out.println("enter number:");
        Scanner sc=new Scanner(System.in); // create scaannner obj to take input from user
        n=sc.nextInt(); //take input from user
        System.out.println("enter power:");
        p=sc.nextInt();

        for(int i=1;i<=p;i++){
            result=n*result;
            System.out.println("square of number"+result);
        }
    }
}
