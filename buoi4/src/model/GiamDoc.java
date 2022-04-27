package model;

public class GiamDoc extends NhanSu {
	private double coPhan;

	public GiamDoc() {
		setLuong1Ngay(300000);
	}

	public double getCoPhan() {
		return coPhan;
	}

	public void setCoPhan(double coPhan) {
		this.coPhan = coPhan;
	}
}
