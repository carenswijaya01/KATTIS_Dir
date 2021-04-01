
import java.util.Scanner;

public class Filip {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String inp = scan.nextLine();
        String[] num = inp.split(" ");

        int[] nums = new int[num.length];
        int[] rev = new int[num.length];

        for (int i = 0; i < num.length; i++) {
            nums[i] = Integer.parseInt(num[i]);
            while (nums[i] != 0) {
                int digit = nums[i] % 10;
                rev[i] = rev[i] * 10 + digit;
                nums[i] /= 10;
            }
        }
        
        if (rev[0] > rev[1]) {
            System.out.println(rev[0]);
        }else{
            System.out.println(rev[1]);
        }

    }
}
