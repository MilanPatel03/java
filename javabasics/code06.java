import java.util.Scanner;

public class code06 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a grade: ");

        char grade = sc.next().charAt(0);

        switch (grade)
        {
            case 'A':
              System.out.println("Excellent!");
              break;
            case 'B':
              System.out.println("Good, keep going");
              break;
            case 'C':
              System.out.println("Keep improving your grade!");
              break;
            default:
              System.out.println("Invalid grade");

        }
    }
}
