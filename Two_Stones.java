
import java.util.Scanner;


public class Two_Stones {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int a = s.nextInt();
        
        if(a%2==1){
            System.out.println("Alice");
        }
        else{
            System.out.println("Bob");
        }
    }
}
