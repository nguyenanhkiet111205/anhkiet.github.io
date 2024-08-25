
import java.util.Scanner;


public class ifelse {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
      System.out.println("Nhap x:");
      int x = scanner.nextInt();
      scanner.nextLine();
      if (x>0){
          System.out.println("Positive");
      }else if (x>0){
          System.out.println("Negative");
      }else {
          System.out.println("Zero");
      }
    }

}
