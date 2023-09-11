package com.mycompany.bai1;

import java.util.Scanner;

public class NV {
   private String hoDem,ten,ngayVao,ngaySinh;
   Scanner scanner = new Scanner(System.in);
   public void Nhap(){
       System.out.print("Nhap hoDem: ");
       hoDem=scanner.nextLine();
       System.out.print("Nhap ten: ");
       ten=scanner.nextLine();
       System.out.print("Nhap ngaySinh: ");
       ngaySinh=scanner.nextLine();
       System.out.print("Nhap ngayVao: ");
       ngayVao=scanner.nextLine();
   }
   
   public void Xuat(){
       System.out.printf("%15.30s%15.30s%15.30s%15.30s%n",hoDem,ten,ngaySinh,ngayVao); 

   }
}
