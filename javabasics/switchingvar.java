public class switchingvar {
    
    public static void main(String[] args) {
        
        String x = "water";
        String y = "suger";
        String temp;

        temp = x;
        x = y;
        y = temp;

        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }
}
