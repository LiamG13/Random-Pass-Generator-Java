import java.util.Random;
import java.util.Scanner;

public class Random_Pass {
	public static void main(String[] args) {
		String pass = "";
		System.out.println("Input an integer for your new password length.");
		Scanner scanner = new Scanner(System.in);
		int len = scanner.nextInt();
		Random n = new Random();
		// Array of common password special characters
		String[] specialChars = { "%", "$", "&", "*", "!", "?", "#", "@" };

		for (int i = 0; i < len; i++) {
			// the RNG between 0-1
			float f = n.nextFloat();
			// if RNG > 0.55, add a character between a-z
											if (f > 0.55) {
				int r = n.nextInt(97, 123);
				pass += (char) (r);
			}
			// if RNG <= 0.45, add a character between A-Z
			if (f <= 0.45) {
				int r = n.nextInt(65, 91);
				pass += (char) (r);
				// if 0.45 < RNG < 0.55, add a special character from specialChars array
			} else if (f > 0.45 && f < 0.55) {
				int r = n.nextInt(8);
				pass += specialChars[r];
			}

		}

		System.out.println("Below is your randomly generated password:" + "\n");
		System.out.println(pass);
		scanner.close();
	}
}