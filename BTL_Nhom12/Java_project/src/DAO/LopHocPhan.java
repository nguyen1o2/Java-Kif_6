package DAO;

public class LopHocPhan extends GiangVien{
	private String MaLopHp;
	private String Khoa;
	private String MaMH;
	private String SiSo;
	/**
	 * @param maLopHp
	 * @param khoa
	 * @param siSo
	 */
	public LopHocPhan() {
		
	}
	public LopHocPhan(String maLopHp,String MaGV,String MaMH, String khoa, String siSo) {
		super();
		MaLopHp = maLopHp;
		Khoa = khoa;
		SiSo = siSo;
	}
	public String getMaLopHp() {
		return MaLopHp;
	}
	public void setMaLopHp(String maLopHp) {
		MaLopHp = maLopHp;
	}
	public String getKhoa() {
		return Khoa;
	}
	public void setKhoa(String khoa) {
		Khoa = khoa;
	}
	public String getSiSo() {
		return SiSo;
	}
	public void setSiSo(String siSo) {
		SiSo = siSo;
	}
	
}
