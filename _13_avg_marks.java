package day2;
import java.util.Scanner;
public class avg_marks {
    public static void main(String[] args) {
        int a,b,c,d,e;
        System.out.println("enter marks:");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        e=sc.nextInt();

        int sum=a+b+c+d+e;
        System.out.println("total : "+sum);

        double avg=sum/5;
        System.out.println("average marks "+avg);
    }
}
