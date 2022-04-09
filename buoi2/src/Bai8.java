import java.util.Scanner;

public class Bai8 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		String newStr = "";
		for (String w : s.split(" "))
			newStr += w.substring(0, 1).toUpperCase() + w.substring(1) + " ";
		System.out.println(newStr.trim());
	}
}
