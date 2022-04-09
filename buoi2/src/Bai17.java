import java.util.Random;
import java.util.Scanner;

public class Bai17 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int min = 1, max = 1000;
		int n = new Random().nextInt(max - min + 1) + min;
		System.out.println(n);
		Scanner scanner = new Scanner(System.in);
		int guess;
		do {
			System.out.print("Guess: ");
			guess = scanner.nextInt();
			if (guess < n)
				System.out.println("Bigger");
			if (guess > n)
				System.out.println("Smaller");
		} while (guess != n);
		System.out.println("Correct");
	}
}
