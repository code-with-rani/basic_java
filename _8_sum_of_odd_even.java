package basic;
import java.util.Scanner;
public class sum_of_odd_even {
    public static void main(String[] args) {
        int n,sum=0;//varible defined
        System.out.println("enter value:"); //print message
        Scanner sc=new Scanner(System.in); //create scanner object to take input
        n=sc.nextInt(); //take input from user

        if(n%2==0){ //check condtion
            for(int i=0;i<=n;i=i+2){
                sum=sum+i;
            }
            System.out.println("sumof even:"+sum);
        }
        else{
            for(int i=1;i<=n;i=i+2){
                sum=sum+i;
            }
            System.out.println("sumof odd:"+sum); 
        }


    }
}
