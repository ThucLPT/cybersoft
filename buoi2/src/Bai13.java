import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Bai13 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("So phan tu: ");
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Phan tu " + i + ": ");
			arr[i] = new Scanner(System.in).nextInt();
		}
		IntStream stream = Arrays.stream(arr);

		double avg = stream.average().getAsDouble();
		System.out.println("Average: " + avg);

		int maxPos = stream.filter(i -> i > 0).max().orElse(0);
		System.out.println("Max positive: " + maxPos);

		int minPos = stream.filter(i -> i > 0).min().orElse(0);
		System.out.println("Min positive: " + minPos);

		int maxNeg = stream.filter(i -> i < 0).max().orElse(0);
		System.out.println("Max negative: " + maxNeg);

		int minNeg = stream.filter(i -> i < 0).min().orElse(0);
		System.out.println("Min negative: " + minNeg);

		System.out.println("Even");
		stream.filter(i -> i % 2 == 0).boxed().collect(Collectors.toList()).forEach(System.out::println);

		System.out.println("Odd");
		stream.filter(i -> i % 2 != 0).boxed().collect(Collectors.toList()).forEach(System.out::println);
	}
}
