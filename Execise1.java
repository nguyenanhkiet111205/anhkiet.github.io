
import java.util.Random;
import java.util.Scanner;

public class Execise1 {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        String check;
        do {
            System.out.println("Tiep tuc chuong trinh(yes or no)? ");
            check = scanner.next();
            int y = rand.nextInt(100) + 1;
            if (y % 2 == 0) {
                System.out.println(y + " la so chan");
            } else {
                System.out.println(y + " la so le");
            }
        } while (check.equals("yes"));
        if (check.equals("no")) {
            System.out.println("chuc ban mot ngay vui ve");
        }
    }
}
