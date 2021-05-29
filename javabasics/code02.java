public class code02 {

    public static void main(String[] args) {
        
        System.out.println("Hi there");

        int firstNumber = 12333;
        int secondNumber = 234;

        int sum = firstNumber + secondNumber;

        float devide = firstNumber / secondNumber;

        System.out.println(sum);
        System.out.println(devide);

        // Type casting

        double devidekk = (double)firstNumber / (double)secondNumber;
        System.out.println(devidekk);

        int a = 12;
        //a = a + 1 or
        //a++; // after that statement value is updated
        //a--; 

        System.out.println(a++);   // a = 12
        System.out.println(a);     // a = 13

        //++a;
        System.out.println(++a);   // a = 14
        System.out.println(a);     // a = 14

    }
    
}
