import java.util.Scanner;

public class code16 {
    public static void main(String[] args) {
       
       Scanner scn = new Scanner(System.in);
       
       System.out.println("Enter temprarure outside:- ");
       int temp = scn.nextInt();

       if(temp > 30){
           System.out.println("Its hot outside! ");
       }
       else if(temp >= 20 && temp <= 30){
           System.out.println("Its warm outside! ");
       }
       else{
           System.out.println("Its cold outside! ");
       }
    }
}
