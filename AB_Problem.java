
import java.util.Scanner;

public class AB_Problem {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i, j;

        int C = scan.nextInt();
        int input;
        for (i = 0; i < C; i++) {
            int count = 0;
            double A = 0;
            double rata = 0;
            input = scan.nextInt();
            double[] angka = new double[input];
            for (j = 0; j < angka.length; j++) {
                angka[j] = scan.nextInt();
                A = A + angka[j];
                rata = (double) (A / input);
            }
            for (j = 0; j < angka.length; j++) {
                if (angka[j] > rata) {
                    count++;
                }
            }
            double peluang = (double) (count * 100) / input;
            System.out.printf("%.3f", peluang);
            System.out.println("%");
        }
    }
}
