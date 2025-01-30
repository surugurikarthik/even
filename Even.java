
import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("sum = ");
        int sum = sc.nextInt();
        for (int i = 0; i <= 100; i++) {
            if(i%2==0){
                sum+=i;

                
            }
            
        }
        System.out.println("sum of even numnbers from 1 to 100 : " + sum);
        
    }
    
}
