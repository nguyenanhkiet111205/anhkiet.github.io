
package execise2;

import java.util.Scanner;


public class exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu cua mang:");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Nhap cac phan tu cua mang:");
        for(int i=0; i < n;i++){
            System.out.println("Phan tu thu " +( i + 1 + ":"));
            array[i] = scanner.nextInt();
        }
        int sum = 0;
        for(int i = 0;i < n;i++){
            sum += array[i];
        }
        double trungbinhcong = (double) sum / n;
        System.out.println("Tong cac phan tu trong mang la:" +sum);
        System.out.println("Trung binh cong cac phan tu trong mang la:" +trungbinhcong);
    }
}