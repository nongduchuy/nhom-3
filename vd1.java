
package tuan5;

import java.util.ArrayList;
import java.util.Scanner;

public class vd1 {
    public static int dem(ArrayList <Integer> list){
        int dem=0;
        for (Integer i : list){
            if(i%2==0&&i%3==0)
                dem++;
        }
        return dem;
    }
    
      public static int tong(ArrayList <Integer> list){
        int tong=0;
        for (Integer i : list){
            if(i%2==0&&i%3==0)
                tong+=i;
        }
        return tong;
    }
    
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList <Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.printf("nhap phan tu n ");
        int n = sc.nextInt();
        for (int i =0;i<n;i++){
            System.out.printf("a[%d]",i);
            int x = sc.nextInt();
            list.add(x);
        }
        System.out.println(list);
        System.out.println("so phan tu chan chia het cho 3: "+ dem(list));
        System.out.println("tong so phan tu chan chia het cho 3: "+ tong(list));
        int k;
        do{
        System.out.println("vi tri can chen ");     
        k = sc.nextInt();  
        }while(k<0||k>n);
        System.out.println("so can chen ");
        int x=sc.nextInt();
        list.add(k,x);
        System.out.println("sau khi chen "+list);
        
        ArrayList <Integer> listnew = new ArrayList <Integer>();
        listnew.addAll(list);
        System.out.println("Mang moi ");
        System.out.println(listnew);
        
        list.clear();
        System.out.println("Mang moi sau khi xoa "+list);
       

    }

}
