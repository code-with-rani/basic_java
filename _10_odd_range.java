package basic;
//odd range - 
//5:1,3,5 print
import java.util.Scanner; //import scanner for input
public class _10_odd_range {
    public static void main(String[] args) {
        int n; //variable defined
        System.out.println("enter range:"); //print message
        Scanner sc=new Scanner(System.in); //create scanner object to take input
        n=sc.nextInt(); //take input from user

        for(int i=1;i<=n;i=i+2){ //check condition
            System.out.println(i);
        }


    }
}
