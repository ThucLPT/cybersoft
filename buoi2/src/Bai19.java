import java.util.Scanner;

public class Bai19 {
	static Scanner scanner = new Scanner(System.in);

	static void ptBac1() {
		System.out.print("a: ");
		double a = scanner.nextDouble();

		System.out.print("b: ");
		double b = scanner.nextDouble();

		if (a == 0 && b == 0)
			System.out.println("PT co vo so nghiem");
		if (a == 0 && b != 0)
			System.out.println("PT vo nghiem");
		if (a != 0)
			System.out.println(-b / a);
	}

	static void ptBac2() {
		System.out.print("a: ");
		double a = scanner.nextDouble();

		System.out.print("b: ");
		double b = scanner.nextDouble();

		System.out.print("c: ");
		double c = scanner.nextDouble();

		double del = Math.pow(b, 2) - 4 * a * c;
		if (del < 0)
			System.out.println("PT vo nghiem");
		if (del == 0)
			System.out.println("x1=x2=" + -b / (2 * a));
		if (del > 0) {
			System.out.println("x1=" + (-b + Math.sqrt(del)) / (2 * a));
			System.out.println("x2=" + (-b - Math.sqrt(del)) / (2 * a));
		}
	}

	public static void main(String[] args) {
		System.out.println("1.PT bac 1");
		System.out.println("2.PT bac 2");

		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			ptBac1();
			break;
		case 2:
			ptBac2();
			break;
		}
	}
}
