import java.util.Scanner;

public class code17 {
    
    public static void main(String[] args) {
        

        // nested loop = loop inside of a loop

        Scanner sc = new Scanner(System.in);

        int raws;
        int columns;
        String symbol = "";

        System.out.println("Enter no. of raws: ");
        raws = sc.nextInt();
        System.out.println("Enter no. of columns: ");
        columns = sc.nextInt();
        System.out.println("Enter symbol to use: ");
        symbol = sc.next();

        for(int i = 1; i <= raws; i++){
            System.out.println();
            for(int j = 1; j <= columns; j++){
                System.out.print(symbol);
            }
        }
    }
}
