// for loop

import java.util.Scanner;

public class code08 {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your name below: ");

        String name = scn.nextLine();

        for (int i = 0; i < 5; i++ )
        {
            System.out.println(name);
        }

    }
}
