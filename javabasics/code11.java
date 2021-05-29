public class code11 {
    
    public static void main(String[] args) {
        

        int i = 1;
        int a = 1;

        while(true)
        {
            System.out.println(i);
            i++;
            if( i > 100)
            break;
        }
        
        while( a < 30 )
        {
            a++;
            System.out.println(a);
            if(a == 10)  // We can skip {} after if() when after that only 1(singleline statement)
            continue;
        }
    }
}
