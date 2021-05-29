// if else basic code


import java.util.Scanner;

public class code04 {
    public static void main(String[] args) {
        
        Scanner num = new Scanner(System.in);

        System.out.println("Enter your age: ");

        int age = num.nextInt();

        if (age >18) 
        {
            System.out.println("You can vote");
        }
        else 
        {
            System.out.println("You can not vote");
        }
    }
}
