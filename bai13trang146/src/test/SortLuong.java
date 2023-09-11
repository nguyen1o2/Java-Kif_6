/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;
import java.util.Comparator;
/**
 *
 * @author OS
 */
public class SortLuong implements Comparator<NguoiLaoDong>{

    @Override
    public int compare(NguoiLaoDong o1, NguoiLaoDong o2) {
        if(o1.tinhLuong()>o2.tinhLuong()){
                return 1;
        }
        return -1;
    }
    
}
