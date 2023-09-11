package DAO;

public class MonHoc {
	private String MaMH;
	private String TenMH;
	private int SoTC;
	public MonHoc(){
		
	}
	
	public MonHoc(String MaMH,String TenMH,int SoTC) {
		this.MaMH = MaMH;
		this.TenMH = TenMH;
		this.SoTC = SoTC;
	}

	public String getMaMH() {
		return MaMH;
	}

	public void setMaMH(String maMH) {
		MaMH = maMH;
	}

	public String getTenMH() {
		return TenMH;
	}

	public void setTenMH(String tenMH) {
		TenMH = tenMH;
	}

	public int getSoTC() {
		return SoTC;
	}

	public void setSoTC(int soTC) {
		SoTC = soTC;
	}
	
}
