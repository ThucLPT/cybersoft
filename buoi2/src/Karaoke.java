import java.util.Scanner;

public class Karaoke {
	static void tinhTien(int gioVao, int gioRa) {
		if (gioVao >= 9 && gioRa <= 24) {
			int hour = gioRa - gioVao;
			int sum = 0;
			int h = 30000;
			if (hour <= 3)
				sum = h * hour;
			else {
				int h3 = h * 3;
				int n = h3 * 30 / 100;
				sum = h3 + (n * (hour - 3));
			}
			if (gioVao >= 9 && gioVao <= 17) {
				int dis = sum * 20 / 100;
				sum -= dis;
			}
			System.out.println(sum);
		} else
			System.out.println("K mo cua");
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Gio vao: ");
		int vao = scanner.nextInt();

		System.out.print("Gio ra: ");
		int ra = scanner.nextInt();

		tinhTien(vao, ra);
	}
}
