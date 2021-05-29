public class trycatch {
    
    public static void main(String[] args) {
        
        int a[] = new int[3];

        try {
            System.out.println(a[4]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error was occurd");
            System.out.println(e.getLocalizedMessage());
        }

        try {
            System.out.println(3/0);
        }
        catch(Exception e){
            System.out.println("Error was occurd");
            System.out.println(e.getLocalizedMessage());
        }
    }   
}
