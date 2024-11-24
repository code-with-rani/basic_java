//program of even range ex we enter 5 the otput come under 5 then 2,4
package basic;
import java.util.Scanner; //import scanner for input
public class _9_even_range {
    public static void main(String[] args) {
        int n; //varible defined
        System.out.println("enter range:"); //print message 
        Scanner scanner=new Scanner(System.in); //create scanner object to take input
        n=scanner.nextInt(); //take input from user

        for(int i=0;i<=n;i=i+2){ //check condtion
            System.out.println(i);
            
        }
            scanner.close();
     } 
}

