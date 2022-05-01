import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import model.CongTy;
import model.GiamDoc;
import model.NhanSu;
import model.NhanVien;
import model.TruongPhong;

public class Service {
	private CongTy congTy;
	private List<NhanSu> listNs;
	private List<NhanVien> listNv;
	private List<TruongPhong> listTp;
	private List<GiamDoc> listGd;

	public Service() {
		congTy = new CongTy();
		listNs = new ArrayList<>();
		listNv = new ArrayList<>();
		listTp = new ArrayList<>();
		listGd = new ArrayList<>();
	}

	public List<NhanSu> getListNs() {
		return listNs;
	}

	public void nhapCongTy(Scanner scanner) {
		System.out.print("Ten: ");
		congTy.setTen(scanner.nextLine());
		System.out.print("Ma so thue: ");
		congTy.setMaSoThue(scanner.nextLine());
		System.out.print("Doanh thu thang: ");
		congTy.setDoanhThuThang(Double.parseDouble(scanner.nextLine()));
	}

	public void phanBoNhanVienVaoTruongPhong(String maSoCuaNhanVien, String maSoCuaTruongPhong) {
		NhanVien nhanVien = listNv.stream().filter(nv -> nv.getMaSo().equals(maSoCuaNhanVien)).findAny().get();
		TruongPhong truongPhong = listTp.stream().filter(tp -> tp.getMaSo().equals(maSoCuaTruongPhong)).findAny().get();
		nhanVien.setTruongPhongQuanLy(truongPhong);
		truongPhong.getDsNhanVien().add(nhanVien);
	}

	public void themNhanSu(NhanSu nhanSu, Scanner scanner) {
		System.out.print("Ma so: ");
		nhanSu.setMaSo(scanner.nextLine());
		System.out.print("Ho ten: ");
		nhanSu.setTen(scanner.nextLine());
		System.out.print("Sdt: ");
		nhanSu.setSdt(scanner.nextLine());
		System.out.print("So ngay lam: ");
		nhanSu.setSoNgayLam(Integer.parseInt(scanner.nextLine()));
		if (nhanSu instanceof NhanVien)
			listNv.add((NhanVien) nhanSu);
		if (nhanSu instanceof TruongPhong)
			listTp.add((TruongPhong) nhanSu);
		if (nhanSu instanceof GiamDoc) {
			System.out.print("So co phan: ");
			((GiamDoc) nhanSu).setCoPhan(Double.parseDouble(scanner.nextLine()));
			listGd.add((GiamDoc) nhanSu);
		}
		listNs.add(nhanSu);
	}

	public void xoaNhanSu(String maSo) {
		NhanSu nhanSu = listNs.stream().filter(ns -> ns.getMaSo().equals(maSo)).findAny().get();
		if (nhanSu instanceof NhanVien) {
			((NhanVien) nhanSu).getTruongPhongQuanLy().getDsNhanVien().remove(nhanSu);
			listNv.remove(nhanSu);
		}
		if (nhanSu instanceof TruongPhong) {
			for (NhanVien nhanVien : ((TruongPhong) nhanSu).getDsNhanVien())
				nhanVien.setTruongPhongQuanLy(null);
			listTp.remove(nhanSu);
		}
		if (nhanSu instanceof GiamDoc)
			listGd.remove(nhanSu);
		listNs.remove(nhanSu);
	}

	public void xuatDanhSachNhanSu(List<NhanSu> listNs) {
		System.out.printf("%s\t\t%s\t\t%s\t\t%s\n", "Ma so", "Ho ten", "Sdt", "So ngay lam");
		for (NhanSu nhanSu : listNs)
			System.out.printf("%s\t\t%s\t\t%s\t\t%s\n", nhanSu.getMaSo(), nhanSu.getTen(), nhanSu.getSdt(),
					nhanSu.getSoNgayLam());
	}

	private int tinhLuong(NhanSu nhanSu) {
		if (nhanSu instanceof TruongPhong)
			return nhanSu.getLuong1Ngay() * nhanSu.getSoNgayLam()
					+ 100000 * ((TruongPhong) nhanSu).getDsNhanVien().size();
		return nhanSu.getLuong1Ngay() * nhanSu.getSoNgayLam();
	}

	public int tinhTongLuong() {
		int sum = 0;
		for (NhanSu nhanSu : listNs)
			sum += tinhLuong(nhanSu);
		return sum;
	}

	public NhanVien findNhanVienByLuongMax() {
		Comparator<NhanVien> comparator = (NhanVien nv1, NhanVien nv2) -> Integer.compare(tinhLuong(nv1),
				tinhLuong(nv2));
		listNv.sort(comparator.reversed());
		return listNv.get(0);
	}

	public void xuatNhanSuVoiLuong(NhanSu nhanSu) {
		System.out.printf("%s\t\t%s\t\t%s\t\t%s\t\t%s\n", "Ma so", "Ho ten", "Sdt", "So ngay lam", "Luong");
		System.out.printf("%s\t\t%s\t\t%s\t\t%s\t\t%s\n", nhanSu.getMaSo(), nhanSu.getTen(), nhanSu.getSdt(),
				nhanSu.getSoNgayLam(), tinhLuong(nhanSu));
	}

	public void xuatDanhSachNhanSuVoiLuong(List<NhanSu> list) {
		System.out.printf("%s\t\t%s\t\t%s\t\t%s\t\t%s\n", "Ma so", "Ho ten", "Sdt", "So ngay lam", "Luong");
		for (NhanSu nhanSu : list)
			xuatNhanSuVoiLuong(nhanSu);
	}

	public TruongPhong findTruongPhongBySoNhanVienMax() {
		Comparator<TruongPhong> comparator = (TruongPhong tp1, TruongPhong tp2) -> Integer
				.compare(tp1.getDsNhanVien().size(), tp2.getDsNhanVien().size());
		listTp.sort(comparator.reversed());
		return listTp.get(0);
	}

	public void xuatTruongPhong(TruongPhong truongPhong) {
		System.out.printf("%s\t\t%s\t\t%s\t\t%s\t\t%s\n", "Ma so", "Ho ten", "Sdt", "So ngay lam", "So nhan vien");
		System.out.printf("%s\t\t%s\t\t%s\t\t%s\t\t%s\n", truongPhong.getMaSo(), truongPhong.getTen(),
				truongPhong.getSdt(), truongPhong.getSoNgayLam(), truongPhong.getDsNhanVien().size());
	}

	public List<NhanSu> sortNhanSuByNameAsc() {
		List<NhanSu> list = new ArrayList<>();
		list.addAll(listNs);
		Comparator<NhanSu> comparator = Comparator.comparing(NhanSu::getTen);
		list.sort(comparator);
		return list;
	}

	public List<NhanSu> sortNhanSuByLuongDesc() {
		List<NhanSu> list = new ArrayList<>();
		list.addAll(listNs);
		Comparator<NhanSu> comparator = (NhanSu ns1, NhanSu ns2) -> Integer.compare(tinhLuong(ns1), tinhLuong(ns2));
		list.sort(comparator.reversed());
		return list;
	}

	public GiamDoc findGiamDocByCoPhanMax() {
		Comparator<GiamDoc> comparator = Comparator.comparing(GiamDoc::getCoPhan);
		listGd.sort(comparator.reversed());
		return listGd.get(0);
	}

	public void xuatGiamDoc(GiamDoc giamDoc) {
		System.out.printf("%s\t\t%s\t\t%s\t\t%s\t\t%s\n", "Ma so", "Ho ten", "Sdt", "So ngay lam", "So co phan");
		System.out.printf("%s\t\t%s\t\t%s\t\t%s\t\t%s\n", giamDoc.getMaSo(), giamDoc.getTen(), giamDoc.getSdt(),
				giamDoc.getSoNgayLam(), giamDoc.getCoPhan());
	}

	private double tinhThuNhap(GiamDoc giamDoc) {
		return tinhLuong(giamDoc) + giamDoc.getCoPhan() * (congTy.getDoanhThuThang() - tinhTongLuong());
	}

	public void xuatDanhSachGiamDocVoiThuNhap() {
		System.out.printf("%s\t\t%s\t\t%s\t\t%s\t\t%s\n", "Ma so", "Ho ten", "Sdt", "So ngay lam", "Thu nhap");
		for (GiamDoc gd : listGd)
			System.out.printf("%s\t\t%s\t\t%s\t\t%s\t\t%s\n", gd.getMaSo(), gd.getTen(), gd.getSdt(), gd.getSoNgayLam(),
					tinhThuNhap(gd));
	}
}
