import java.util.Scanner;

public class SinhVien {
	private String ten;
	private String maSV;
	private double diemToan;
	private double diemLy;
	private double diemHoa;
	private double diemTB;
	private String loai;

	public SinhVien() {
	}

	public SinhVien(String ten, String maSV, double diemToan, double diemLy, double diemHoa) {
		this.ten = ten;
		this.maSV = maSV;
		this.diemToan = diemToan;
		this.diemLy = diemLy;
		this.diemHoa = diemHoa;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getMaSV() {
		return maSV;
	}

	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}

	public double getDiemToan() {
		return diemToan;
	}

	public void setDiemToan(double diemToan) {
		this.diemToan = diemToan;
	}

	public double getDiemLy() {
		return diemLy;
	}

	public void setDiemLy(double diemLy) {
		this.diemLy = diemLy;
	}

	public double getDiemHoa() {
		return diemHoa;
	}

	public void setDiemHoa(double diemHoa) {
		this.diemHoa = diemHoa;
	}

	public double getDiemTB() {
		return diemTB;
	}

	public void setDiemTB(double diemTB) {
		this.diemTB = diemTB;
	}

	public String getLoai() {
		return loai;
	}

	public void setLoai(String loai) {
		this.loai = loai;
	}

	public void nhap(Scanner scanner) {
		System.out.print("Ten: ");
		this.ten = scanner.nextLine();

		System.out.print("Ma SV: ");
		this.maSV = scanner.nextLine();

		System.out.print("Diem toan: ");
		this.diemToan = scanner.nextDouble();
		scanner.nextLine();

		System.out.print("Diem ly: ");
		this.diemLy = scanner.nextDouble();
		scanner.nextLine();

		System.out.print("Diem hoa: ");
		this.diemHoa = scanner.nextDouble();
		scanner.nextLine();
	}

	public void xuat() {
		System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n", this.ten, this.maSV, this.diemToan, this.diemLy,
				this.diemHoa, this.diemTB, this.loai);
	}

	public void tinhDiemTB() {
		this.diemTB = (this.diemToan + this.diemLy + this.diemHoa) / 3;
	}

	public void xepLoai() {
		if (this.diemTB >= 9)
			this.loai = "Xuat sac";
		else if (this.diemTB >= 8 && this.diemTB < 9)
			this.loai = "Gioi";
		else if (this.diemTB >= 7 && this.diemTB < 8)
			this.loai = "Kha";
		else if (this.diemTB >= 6 && this.diemTB < 7)
			this.loai = "TB Kha";
		else if (this.diemTB >= 5 && this.diemTB < 6)
			this.loai = "TB";
		else
			this.loai = "Yeu";
	}
}
