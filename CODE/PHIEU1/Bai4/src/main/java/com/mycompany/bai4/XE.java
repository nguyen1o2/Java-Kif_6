/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bai4;
import java.util.*;
public class XE {
    private String tenChuXe,loaiXe;
    private int dungTich,triGia;
    
    Scanner scanner =new Scanner(System.in);
    
    public void Nhap(){
        System.out.print("Nhap ten chu xe: ");
        tenChuXe=scanner.nextLine();
        System.out.print("Nhap loai xe: ");
        loaiXe=scanner.nextLine();
        System.out.print("Nhap dung tich: ");
        dungTich=scanner.nextInt();
        System.out.print("Nhap tri gia: ");
        triGia=scanner.nextInt();
    }
    
    public float thue(){
        if(dungTich<100){
            return triGia*0.01f;
        }
        else if(dungTich<=200){
            return triGia*0.03f;
        }
        return triGia*0.05f;
    }
    
    public  void Tieude(){
        System.out.printf("%15s%15s%15s%15s%15s%n","Ten chu xe","Loai xe","Dung tich","Tri gia","Thue phai nop");
    }
    
    public void Xuat(){
        System.out.printf("%15.1f%15.1f%15.1f%15f.1f%15.1f%n",tenChuXe,loaiXe,dungTich,triGia,thue());
    }
}
