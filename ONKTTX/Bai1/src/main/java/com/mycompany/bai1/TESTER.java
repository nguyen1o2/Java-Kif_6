/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bai1;

import java.util.Scanner;

/**
 *
 * @author OS
 */
public class TESTER extends NHANVIEN {
    private int soLoi;
    static Scanner scanner = new Scanner(System.in);
    @Override
    public void Nhap(){
        super.Nhap();
        System.out.print("Nhap soLoi: ");
        soLoi=scanner.nextInt();
    }
    
    public long LuongThang(){
        return luongCoBan+soLoi*100000;
    }
    @Override
    public String toString(){
        return super.toString()+" "+soLoi+" "+LuongThang();
    }
}
