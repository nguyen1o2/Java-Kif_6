
package com.mycompany.bai2;

import java.util.Scanner;

public class HT {
    private float r;
    Scanner scanner = new Scanner(System.in);
     public void nhap(){
         System.out.print("Nhap ban kinh: ");
         r = scanner.nextFloat();
     }
     
     public float CV(){
         return (float) (2*Math.PI);
     }
     
     public float DT(){
         return(float) Math.PI*r*r;
     }
     
     public void TIEUDE(){
         System.out.printf("%15s%15s%15s%n","Ban Kinh","Chu vi","Dien Tich");
     }
     
     public void xuat(){
         System.out.printf("%15.1f%15.1f%15.1f%n",r,CV(),DT());
     }
}
