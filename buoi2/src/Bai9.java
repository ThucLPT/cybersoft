import java.util.Scanner;

public class Bai9 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Num1: ");
		int n1 = scanner.nextInt();
		String s1 = String.valueOf(n1);

		System.out.print("Num2: ");
		int n2 = scanner.nextInt();
		String s2 = String.valueOf(n2);

		if (n1 >= 10 && n1 <= 99 && n2 >= 10 && n2 <= 99) {
			if (s1.contains(s2.substring(0, 1)) || s1.contains(s2.substring(1, 2)))
				System.out.println("true");
			else
				System.out.println("false");
		} else
			System.out.println("Wrong");
	}
}
