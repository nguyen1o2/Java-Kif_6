/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bai1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author OS
 */
public class HT extends HINHPHANG{
    private int r;
    Scanner scanner = new Scanner(System.in);
    public void Nhap() {
        tenHinh="Hinh tron";
        System.out.print("Nhap r = ");
        r=scanner.nextInt();
    }
    @Override
    double CV() {
      return Math.PI*2*r;
    }

    @Override
    double DT() {
        return Math.PI*r*r;
    }
    
    @Override
    public String toString(){
        DecimalFormat df = new DecimalFormat("###,###.#");
        return super.toString()+" r = "+r+" Chu vi = "+df.format(CV())+" Dien tich = "+df.format(DT());
    }
}
