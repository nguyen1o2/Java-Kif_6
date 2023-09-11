package DAO;

import java.sql.Date;

import javax.xml.crypto.Data;

public class SinhVien {
	private String MaSV;
	private String HoTen;
	private String NgaySinh;
	private String GioiTinh;
	private String DiaChi;
	private String SDT;
	public SinhVien() {
		
	}
	public SinhVien(String maSV, String hoTen, String ngaySinh, String gioiTinh, String diaChi, String sDT) {
		super();
		MaSV = maSV;
		HoTen = hoTen;
		NgaySinh = ngaySinh;
		GioiTinh = gioiTinh;
		DiaChi = diaChi;
		SDT = sDT;
	}
	public String getMaSV() {
		return MaSV;
	}
	public void setMaSV(String maSV) {
		MaSV = maSV;
	}
	public String getHoTen() {
		return HoTen;
	}
	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}
	public String getNgaySinh() {
		return NgaySinh;
	}
	public void setNgaySinh(String ngaySinh) {
		NgaySinh = ngaySinh;
	}
	public String getGioiTinh() {
		return GioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		GioiTinh = gioiTinh;
	}
	public String getDiaChi() {
		return DiaChi;
	}
	public void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}
	public String getSDT() {
		return SDT;
	}
	public void setSDT(String sDT) {
		SDT = sDT;
	};
	
}
