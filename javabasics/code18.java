public class code18 {
    
    public static void main(String[] args) {
        
        //2D Arrays = an arrays of arrays

        String cars[][] = new String[3][3];

        cars[0][0] = "Camaro";
        cars[0][1] = "Corvette";
        cars[0][2] = "Pagani";
        cars[1][0] = "Cadilac";
        cars[1][1] = "Ranger";
        cars[1][2] = "Mustang";
        cars[2][0] = "Lotus";
        cars[2][1] = "Tesla";
        cars[2][2] = "Bentley";

        for( int i = 0; i<cars.length; i++){
            System.out.println();
            for( int j = 0; j<cars[i].length; j++){
                System.out.print(cars[i][j] + " ");
            }
        }
        
        // Onother Method 
        

        System.out.println();

        String carsm[][] = {
                             {"Camaro", "Corvette", "Pagani"},
                             {"Ranger", "Mustang", "Lotus"},
                             {"Cadilac", "Tesla", "Bentley"}
                           };
            
        for( int i = 0; i<carsm.length; i++){
            System.out.println();
            for( int j = 0; j<carsm[i].length; j++){
                System.out.print(carsm[i][j] + " ");
            }
        }              
    }
}
