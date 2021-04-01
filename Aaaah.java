
import java.util.Scanner;


public class Aaaah {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        String inp1 = scan.next();
        String inp2 = scan.next();
        
        if(inp1.length() >= inp2.length()){
            System.out.println("go");
        }else{
            System.out.println("no");
        }
    }
}
