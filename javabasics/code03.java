// input from user

import java.util.Scanner;

public class code03 {

    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
       Scanner nm = new Scanner(System.in);

       System.out.println("Enter your age: ");
       int age = sc.nextInt();

       System.out.println("Enter your percentage: ");
       float percentage = sc.nextFloat();

       System.out.println("Enter your name: ");
       String name = nm.nextLine();
       

       System.out.println(2 * age);
       System.out.println(percentage);
       System.out.println(name);
    }
    
}
