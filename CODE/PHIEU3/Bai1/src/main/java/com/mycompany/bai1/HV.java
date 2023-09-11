/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bai1;

import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author OS
 */
public class HV extends HINHPHANG{
    private int r;
    
    Scanner scanner = new Scanner(System.in);
    public void Nhap(){
        tenHinh="Hinh vuong";
        System.out.print("Nhap r = ");
        r=scanner.nextInt();
    }

    @Override
    double CV() {
        return 4*r;
    }

    @Override
    double DT() {
        return r*r;
    }
    
    @Override
    public String toString(){
        DecimalFormat df =new DecimalFormat("###,###.#");
        return super.toString()+" r = "+r+" Chu vi = "+df.format(CV())+" Dien tich: "+df.format(DT());
    }
}
