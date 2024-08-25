
package baitapvenha;

import java.util.Scanner;

public class giaiphuongtrinhbacnhat {
    public static void main(String[] args) {
        int aNumber, bNumber; 
        double nghiem;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so a:");
        aNumber = scanner.nextInt();
        System.out.println("Nhap vao so b:");
        bNumber = scanner.nextInt();
        System.out.println("Phuong trinh ban vua nhap la: " +aNumber +"x+" + bNumber +" =0" );
        if(aNumber == 0){
            if(bNumber == 0){
                System.out.println("Phuong trinh nay vo so nghiem.");
            }else {
                System.out.println("Phuong trinh nay vo nghiem.");
            }
        }else{
            nghiem = (double) -bNumber / aNumber;
            System.out.println("Phuong trinh co nghiem x= " + nghiem + ".");
        }
    }
}
