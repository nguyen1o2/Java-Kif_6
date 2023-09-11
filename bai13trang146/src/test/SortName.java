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
public class SortName implements Comparator<NguoiLaoDong>{

    @Override
    public int compare(NguoiLaoDong o1, NguoiLaoDong o2) {
        return o1.getHoten().compareTo(o2.getHoten());
    }
    
}
