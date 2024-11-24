package day3;
import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        int a,b,c,ch;
        System.out.println("enter nu");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();

        System.out.println("1.add");
        System.out.println("2sub");
        System.out.println("3.mult");
        System.out.println("4.divide");
        System.out.println("5.rem");
        System.out.println("choose opertaion...");
        ch=sc.nextInt();

        switch(ch)
        {
            case 1:c=a+b;
            System.out.println("addtion:"+c);
            break;
            case 2:c=a-b;
            System.out.println("substraction:"+c);
            break;
            case 3:c=a*b;
            System.out.println("mult:"+c);
            break;
            case 4:c=a/b;
            System.out.println("divide:"+c);
            break;
            case 5:c=a%b;
            System.out.println("rem:"+c);
            break;
            default:
            System.out.println("invalid choose..");
        }
    }
}
