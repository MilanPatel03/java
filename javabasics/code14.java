import java.util.Scanner;

// Quite the game using any key.

public class code14 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("You are playing the game, press 'q' or 'Q' to quite the game!");
        String res = sc.next();

        if(res.equals("Q") || res.equals("q")){
            System.out.println("You quite the game!");
        }
        else{
            System.out.println("You still playing game!");
        }
    }
}
