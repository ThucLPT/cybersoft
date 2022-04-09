import java.util.Scanner;

public class Bai15 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("String: ");
		String s = scanner.next();

		System.out.print("Index: ");
		int i = scanner.nextInt();

		System.out.println("Length: " + s.length());
		System.out.println("Char at index " + i + ": " + s.split("")[i]);
		System.out.println("Contains abcdef: " + s.contains("abcdef"));
	}
}
