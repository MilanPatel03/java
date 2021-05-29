// Arrays


public class code15 {

    public static void main(String[] args) {

        int marks[] = new int[5];

        marks[0] = 23;
        marks[1] = 45;
        marks[2] = 35;
        marks[3] = 74;
        marks[4] = 92;

        for( int c = 0; c < marks.length ; c++){
            System.out.println(marks[c]);
        }


        System.out.println("Age: ");
        int age[] = {12, 34, 23, 28, 37, 15};

        for( int c = 0; c < age.length; c++){
            System.out.println(age[c]);
        }

    }
}