package DAO;

public class GiangVien {
	private String MaGV;
	private String HoTenGV;
	private String Sdt;
	private String TrinhDo;

   public GiangVien() {
	   
   }
	public String getMaGV() {
		return MaGV;
	}
	public void setMaGV(String MaGV) {
		this.MaGV = MaGV;
	}
	public String getHoTenGV() {
		return HoTenGV;
	}
	public void setHoTenGV(String hoTenGV) {
		HoTenGV = hoTenGV;
	}
	public String getSdt() {
		return Sdt;
	}
	public void setSdt(String sdt) {
		Sdt = sdt;
	}
	public String getTrinhDo() {
		return TrinhDo;
	}
	public void setTrinhDo(String trinhDo) {
		TrinhDo = trinhDo;
	}
	public GiangVien(String MaGV, String HoTenGV, String Sdt, String TrinhDo) {
		this.MaGV = MaGV;
		this.HoTenGV = HoTenGV;
		this.Sdt = Sdt;
		this.TrinhDo = TrinhDo;
	}

	
}
