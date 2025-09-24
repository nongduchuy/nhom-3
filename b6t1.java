
package btt1;

import java.util.Scanner;

public class b6t1 {
       public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    double a,b;
    
    System.out.printf("nhap so a = ");
    a=sc.nextDouble();
    
    System.out.printf("nhap so b = ");
    b=sc.nextDouble();
    
    System.out.println("tong 2 so la " + a+b);
    System.out.println("tich 2 so la " + a*b);
    System.out.println("thuong 2 so la " + a/b);
    double hieu = a-b;
    System.out.println("hieu 2 so la " +hieu);

    }
    
}
