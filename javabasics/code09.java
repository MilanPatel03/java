// First latter Capital

import java.util.Scanner;

public class code09 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Type your name:- ");

        String name = sc.nextLine();

        String firstLatter = name.substring(0,1);
        String remainingLatters = name.substring(1, name.length());

        firstLatter = firstLatter.toUpperCase();

        name = firstLatter + remainingLatters;
        
        System.out.println("Name: " + name);
    }
}
