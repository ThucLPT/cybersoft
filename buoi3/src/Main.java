import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<SinhVien> list = new ArrayList<>();
		while (true) {
			System.out.println("1.Nhap");
			System.out.println("2.Xuat");
			System.out.println("3.Thoat");
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
			case 1:
				System.out.print("So SV muon nhap: ");
				int n = scanner.nextInt();
				scanner.nextLine();
				for (int i = 0; i < n; i++) {
					SinhVien sv = new SinhVien();
					sv.nhap(scanner);
					sv.tinhDiemTB();
					sv.xepLoai();
					list.add(sv);
				}
				break;
			case 2:
				System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n", "Ten", "Ma SV", "Diem toan", "Diem ly",
						"Diem hoa", "Diem TB", "Loai");
				for (SinhVien sv : list)
					sv.xuat();
				break;
			case 3:
				System.exit(0);
			}
		}
	}
}
