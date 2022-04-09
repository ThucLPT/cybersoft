import java.util.Scanner;

public class Bai4 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		int sum = 0;
		for (int i = 0; i < s.length(); i++)
			sum += Integer.parseInt(s.split("")[i]);
		System.out.println(sum);
	}
}
