import java.util.Scanner;

public class Bai11 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println(Math.log(n) / Math.log(2));
	}
}
