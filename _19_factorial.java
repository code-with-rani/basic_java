package day2;
import java.util.Scanner; //import scanner for take input from user
public class factorial {
    public static void main(String[] args) {
        int n,fact=1; //variable create
        System.out.println("enter any number:"); 
        Scanner sc=new Scanner(System.in); //create scanner obj to take input from user
        n=sc.nextInt(); //take input from user
        
        for(int i=1;i<=n;i++){  //condtion 
            fact=fact*i;
        }
        System.out.println("factorial "+fact);
    }
}
