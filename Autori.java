import java.util.Scanner;
public class Autori {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String st = s.next();
        String[]at = st.split("-");
        for (int i = 0; i < at.length; i++) {
            at[i]=at[i].substring(0,1);
            System.out.printf(at[i]);
        }
    }
}
