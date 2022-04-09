import java.util.Scanner;

public class Bai21 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("x1: ");
		int x1 = scanner.nextInt();

		System.out.print("v1: ");
		int v1 = scanner.nextInt();

		System.out.print("x2: ");
		int x2 = scanner.nextInt();

		System.out.print("v2: ");
		int v2 = scanner.nextInt();

		if (x1 >= 0 && x2 < 10000 && x1 < x2 && v1 >= 1 && v2 <= 10000) {
			if (v1 > v2)
				System.out.println("Gap");
			else
				System.out.println("K gap");
		} else
			System.out.println("Wrong");
	}
}
