// if , else if statement code

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class code05 {
    
    public static void main(String[] args) {
        
        Scanner grd = new Scanner(System.in);

        System.out.println("Type your Grade: ");

        char grade = grd.next().charAt(0);

        if (grade == 'A')
        {
            System.out.println("Your grade is verygood!");            
        }
        else if (grade == 'B')
        {
            System.out.println("nice, keep learning!");
        }
        else if (grade == 'C')
        {
            System.out.println("Keep improving your grade!");
        }
        else
        {
            System.out.println("Invalid Grade.");
        }
    }
}
