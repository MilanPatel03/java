import java.util.Random;

// For Random value 

public class code13 {

    public static void main(String[] args) {
        
        Random rand = new Random();

        int x = rand.nextInt(25);

        double y = rand.nextDouble();


        System.out.println(x);
        System.out.println(y);
    }
}
