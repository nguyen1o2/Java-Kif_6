/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bai1;

/**
 *
 * @author OS
 */
public abstract class HINHPHANG {
    protected String tenHinh;
    
    abstract double CV();
    abstract double DT();
    
    @Override
    public String toString(){
        return tenHinh;
    }
}
