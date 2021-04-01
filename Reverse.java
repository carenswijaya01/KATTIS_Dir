
import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int inp = scan.nextInt();
        int nor[] = new int[inp];

        for (int i = 0; i < nor.length; i++) {
            nor[i] = scan.nextInt();
        }
        
        for (int j = nor.length-1; j >= 0; j--) {
            System.out.println(nor[j]);
        }

    }
}
