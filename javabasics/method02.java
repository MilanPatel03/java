import java.util.Scanner;

public class method02 {

    public static void main(String[] args) {
        
        QuitetheGame();
    }

    static String QuitetheGame(){

        System.out.println("Enter 'yes' if you wanna Quite The Game else enter 'no' : ");
        Scanner YsorNo =new Scanner(System.in);

        String inp = YsorNo.next();
        String ok = "OK.";

        if(inp.equals("yes")){
            System.out.println("OK. You Quite The Game! ");
        }
        else if(inp.equals("no")){
            System.out.println("OK. Enjoy The Game! ");
        }
        else{
            System.out.println("Sorry! You Enterd Wrong Input! ");
        }

        return ok;
    }
}
