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
public class LAPTRINHVIEN extends NHANVIEN{
    private int soGio;
    static Scanner sc = new Scanner(System.in);
    @Override
    public void Nhap(){
        super.Nhap();
        System.out.print("Nhap soGio: ");
        soGio=sc.nextInt();
    }

    public long LuongThang() {
        return luongCoBan+soGio*245000;
    }
    @Override
    public String toString(){
        return super.toString()+" "+soGio+" "+LuongThang();
    }
}
