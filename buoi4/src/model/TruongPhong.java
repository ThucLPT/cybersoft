package model;

import java.util.ArrayList;
import java.util.List;

public class TruongPhong extends NhanSu {
	private List<NhanVien> dsNhanVien = new ArrayList<>();

	public TruongPhong() {
		setLuong1Ngay(200000);
	}

	public List<NhanVien> getDsNhanVien() {
		return dsNhanVien;
	}

	public void setDsNhanVien(List<NhanVien> dsNhanVien) {
		this.dsNhanVien = dsNhanVien;
	}
}
