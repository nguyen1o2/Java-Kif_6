/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author OS
 */
public class Bai1 {

    public static void NhapDS(NV a[],int n){
        for(int i=0;i<n;i++){
            System.out.println("Nhap thong tin nhan vien "+(i+1));
            a[i]=new NV();
            a[i].Nhap();
        }
    }
    
    public static void XuatDS(NV a[],int n){
        for(int i=0;i<n;i++){
            a[i].Xuat();
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        NV a[] ;
        int n;
        System.out.print("Nhap so nhan vien: ");
        n=scanner.nextInt();
        a=new NV[n];
//        NhapDS(a, n);
//        System.out.printf("%15s%15s%15s%15s%n","ho dem","ten","ngay sinh","ngay vao");
//        XuatDS(a, n);
                try{
           FileOutputStream ou = new FileOutputStream("D:/test.txt"); 
           ObjectOutputStream out = new ObjectOutputStream(ou);
//           for(int i=0;i<n;i++){
               NhapDS(a, n);
               out.writeObject(a);
               out.flush();
               System.out.println("Da ghi file");
//           }
           out.close();
        }catch(Exception ex){
            System.out.println(ex);
    }
                
    }
}
