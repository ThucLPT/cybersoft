import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Bai14 {
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
		Arrays.stream(arr).distinct().boxed().collect(Collectors.toList()).forEach(System.out::println);
	}
}
