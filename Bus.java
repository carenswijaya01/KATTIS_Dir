
import java.util.Scanner;

public class Bus {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tc = scan.nextInt();

        int[] pass = new int[31];
        pass[0] = 0;

        for (int i = 1; i < 31; i++) {
            pass[i] = (int) (2 * (pass[i - 1] + 0.5));
        }

        for (int i = 0; i < tc; i++) {
            int x = scan.nextInt();
            System.out.println(pass[x]);
        }

        scan.close();
    }

}
