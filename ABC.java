
import java.util.Arrays;
import java.util.Scanner;


public class ABC {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        String inp = scan.nextLine();
        String[] num= inp.split(" ");
        
        int[] nums = new int [num.length];

        for (int i = 0; i < num.length; i++) {
            nums[i] = Integer.parseInt(num[i]);
        }
        
        Arrays.sort(nums);
        char[] c = scan.next().toCharArray();
        for (int i = 0; i < 3; i++) {
            System.out.print(nums[c[i] - 'A'] + " ");
        }
    }
}
