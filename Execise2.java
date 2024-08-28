package execise2;

import java.util.Scanner;

public class Execise2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu cua mang:");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < n; i++) {
            System.out.println("Phan tu thu " + (i + 1 + ":"));
            array[i] = scanner.nextInt();
        }
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < n; i++ ){
            if(array[i] < min){
                min = array[i];
            }
            if(array[i] > max){
                max = array[i];
            }
        }
        System.out.println("Gia tri nho nhat la: "+ min);
        System.out.println("Gia tri lon nhat la: "+ max);
    }
            

}
