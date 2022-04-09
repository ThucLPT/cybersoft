import java.util.Scanner;

public class Bai18 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// F = P(1 + r*t)
		System.out.print("Present value: ");
		double p = scanner.nextDouble();

		System.out.print("Future value: ");
		double f = scanner.nextDouble();

		System.out.print("Rate: ");
		double r = scanner.nextDouble();

		double t = f - p / (p * r);
		System.out.println(t + " year(s)");
	}
}
