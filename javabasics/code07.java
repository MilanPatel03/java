import java.util.Scanner;

// Logical operators &&, ||, !

public class code07 {
    public static void main(String[] args) {
        
        Scanner scx = new Scanner(System.in);
        System.out.println("Enter your age: ");

        int age = scx.nextInt();

        if (age > 18 && age < 50)
        {
            System.out.println("You can vote.");
        }
        else
        {
            System.out.println("You can not vote.");
        }    
        
        // not statement

        System.out.println("In a case when child become a PM.");
        int age1 = scx.nextInt();
        
        if (!(age1 >18))
        {
            System.out.println("You can vote.");
        }
        else
        {
            System.out.println("You can not vote.");
        }

    }
}
