package model;

public abstract class NhanSu {
	private String maSo;
	private String ten;
	private String sdt;
	private int soNgayLam;
	private int luong1Ngay;

	public NhanSu() {
	}

	public String getMaSo() {
		return maSo;
	}

	public void setMaSo(String maSo) {
		this.maSo = maSo;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public int getSoNgayLam() {
		return soNgayLam;
	}

	public void setSoNgayLam(int soNgayLam) {
		this.soNgayLam = soNgayLam;
	}

	public int getLuong1Ngay() {
		return luong1Ngay;
	}

	public void setLuong1Ngay(int luong1Ngay) {
		this.luong1Ngay = luong1Ngay;
	}
}
