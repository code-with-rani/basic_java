package day5;
import java.util.Scanner; //import scanner class for input
public class marks {
    public static void main(String[] args) {
        int marks;
        System.out.println("enter marks:"); //to display
        Scanner sc=new Scanner(System.in); //create scanner ob to take input from user
        marks=sc.nextInt(); //to take input from user

        //check condtion 
        if(marks>=60 && marks<=100){
            System.out.println("first division");
        }
        else if(marks>=45 && marks<=60){
            System.out.println("2nd divison");
        }
        else if(marks>=33 && marks<=45){
            System.out.println("3rd divison");
        }
        else{
            System.out.println("failed");

        }
    }
}
