import java.util.Scanner;

public class method03 {

    public static void main(String[] args) {

        Scanner rate = new Scanner (System.in);

        Scanner review = new Scanner (System.in);

        Scanner scan = new Scanner (System.in);
        
        

        System.out.println("Enjoy the game? \nRate this game out of 5 ");
        int num = rate.nextInt();

        switch (num) {
            case 5:
                System.out.println("Glade! You enjoy the game");
                break;
            case 4:
                System.out.println("Thanks for positve feedback! ");
                break;
            case 3:
                System.out.println("Thanks, Help us by reviewing your suggestion");
                break;        
            case 2:
                System.out.println("Thanks, Help us by reviewing your suggestion");
                break;
            case 1:
                System.out.println("Thanks, press 'C' if you wanna review the game\n or press 'Q' if you wanna quite this game ");
                
                char CorQ = scan.next().charAt(0);

                if (CorQ == 'C'){
                    System.out.println("Type Here: ");
                }
                else if (CorQ == 'Q'){
                    System.out.println(QuitetheGame());
                }
                else{
                    System.out.println("Sorry! You enterd Wrong Input");
                }
            default:
                
                break;
        }


        
        
    }



    static String QuitetheGame(){

        
        System.out.println("Enter 'yes' if you wanna Quite The Game else enter 'no' : ");
        Scanner YsorNo = new Scanner(System.in);

        String inp = YsorNo.next();
        String ok = "ENJOY! ";

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
