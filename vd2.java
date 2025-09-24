
package tuan5;

import java.util.LinkedList;
import java.util.Scanner;


public class vd2 {
    
    public static void main(String[] args) {
    LinkedList <String> linkedlist = new LinkedList<>();
    Scanner sc = new Scanner(System.in);
    
    System.out.println("so luong skinh vien ");
    int n = sc.nextInt();
    sc.nextLine();
    for(int i = 1;i<=n;i++){
        System.out.printf("sinh ven " +i+ ": ");
        String s = sc.nextLine();
        linkedlist.add(s);
    }
    System.out.println("danh sach sinh vien");
    System.out.println(linkedlist); 
    
    int k;
    do{
        System.out.println("nhap vi tri ");
        k = sc.nextInt();
        sc.nextLine();
       
    }while(k<0||k>linkedlist.size());
    System.out.print("nhap vao sinh vien chen ");
    String x = sc.nextLine();
    linkedlist.add(k,x);
    System.out.println("danh sach sinh vien sau khi chen");
    System.out.println(linkedlist);
    
    do{
        System.out.println("nhap vi tri muon xoa ");
        k = sc.nextInt();
        sc.nextLine();
    }while(k<0||k>linkedlist.size());
    linkedlist.remove(k);
    System.out.println("danh sach sinh vien sau khi xoa");
    for(int i = 0 ; i < linkedlist.size();i++)
    {
        System.out.println(i+1+"."+linkedlist.get(i));
    }
}}
