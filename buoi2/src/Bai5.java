import java.util.Scanner;

public class Bai5 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("xA: ");
		int xA = scanner.nextInt();

		System.out.print("yA: ");
		int yA = scanner.nextInt();

		System.out.print("xB: ");
		int xB = scanner.nextInt();

		System.out.print("yB: ");
		int yB = scanner.nextInt();

		System.out.println(Math.sqrt(Math.pow(xB - xA, 2) + Math.pow(yB - yA, 2)));
	}
}
