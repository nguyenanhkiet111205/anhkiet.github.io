
package execise2;

import java.util.Arrays;
import java.util.Scanner;

public class execise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu mang:");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Nhap cac phan tu cua mang:");
        for(int i =0; i < n; i++){
            System.out.println("Phan tu thu:" +(i +1)+":");
            array [i] = scanner.nextInt();
        }
        Arrays.sort(array);
        System.out.println("mang sau khi duoc sap xep tang dan la:");
        for(int giatri : array){
            System.out.println(giatri +" ");
        }
        System.out.println();
    }
}
