package day4;
import java.util.Scanner;
public class area_circle {
    public static void main(String[] args) {
        double pi=22.7,area;
        int r;
        System.out.println("enter radius:");
        Scanner sc=new Scanner(System.in);
        r=sc.nextInt();
        area=r*r*pi;
        System.out.println("area of circle:"+area);


    }
}
