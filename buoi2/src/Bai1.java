public class Bai1 {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			if (i % 2 != 0) {
				for (int j = 0; j < 6; j++)
					System.out.print("* ");
				for (int j = 0; j < 34; j++)
					System.out.print("=");
				System.out.println();
			} else {
				for (int j = 0; j < 5; j++)
					System.out.print(" *");
				System.out.print("  ");
				for (int j = 0; j < 34; j++)
					System.out.print("=");
				System.out.println();
			}
		}
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 46; j++)
				System.out.print("=");
			System.out.println();
		}
	}
}
