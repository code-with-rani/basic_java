package basic;
import java.util.Scanner; //import scanner for input
public class _7_sum_natural {
    public static void main(String[] args) {
        int n,sum=0; //varible defined
        System.out.println("enter value"); //print message
        Scanner sc=new Scanner(System.in); //create scanner object to take input
        n=sc.nextInt(); //take input from user

        for(int i=1;i<=n;i++){ //check condtion
            sum=sum+i;
        }
        System.out.println("sum:"+(sum)+" ");

    }
}
