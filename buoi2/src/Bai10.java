import java.util.Scanner;
import java.util.stream.IntStream;

public class Bai10 {
	static boolean isPrime(int number) {
		return IntStream.rangeClosed(2, (int) Math.sqrt(number)).noneMatch(n -> (number % n == 0));
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int sum = 0;
		for (int i = 2; i <= n; i++) {
			if (isPrime(i))
				sum += i;
		}
		System.out.println(sum);
	}
}
