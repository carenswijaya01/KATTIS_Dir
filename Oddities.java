import java.util.Scanner;
public class Oddities {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int tc = s.nextInt();
        int [] num = new int [tc];
        String [] stat = new String [tc];
        for (int i = 0; i < tc; i++) {
            num[i]=s.nextInt();
            if(num[i]%2==0){
                stat[i]="is even";
            }
            else{
                stat[i]="is odd";
            }
        }
        for (int i = 0; i < tc; i++) {
            System.out.println(num[i]+" "+stat[i]);
        }
    }
}
