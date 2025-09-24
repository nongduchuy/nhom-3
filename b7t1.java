
package btt1;

import java.util.Scanner;

public class b7t1 {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
  
        String maSV, hoTen, ngaySinh;
        double diemTongKet;

        System.out.print("Nhap ma sinh vien: ");
        maSV = sc.nextLine();

        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();

        System.out.print("Nhap ngay sinh (dd/mm/yyyy) : ");
        ngaySinh = sc.nextLine();

        System.out.print("Nhap điem tong ket: ");
        diemTongKet = sc.nextDouble();

        System.out.println("Ma sinh vien: " + maSV);
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Ngay sinh: " + ngaySinh);
        System.out.println("Điem tong ket: " + diemTongKet);
    }
    }
