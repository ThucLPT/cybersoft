package model;

public class NhanVien extends NhanSu {
	private TruongPhong truongPhongQuanLy = null;

	public NhanVien() {
		setLuong1Ngay(100000);
	}

	public TruongPhong getTruongPhongQuanLy() {
		return truongPhongQuanLy;
	}

	public void setTruongPhongQuanLy(TruongPhong truongPhongQuanLy) {
		this.truongPhongQuanLy = truongPhongQuanLy;
	}
}
