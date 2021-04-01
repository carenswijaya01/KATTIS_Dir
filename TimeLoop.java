
import java.util.Scanner;

public class TimeLoop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int in = s.nextInt();
        if (in < 1 || in > 100) {
            System.out.println("1≤N≤100");
        }
        else{
            for (int i = 1; i <= in; i++) {
                System.out.println(i+" Abracadabra");
            }
        }
    }
}
