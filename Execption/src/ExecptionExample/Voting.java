package ExecptionExample;

import java.util.Scanner;

class YoungerAgeExecption extends RuntimeException {
	YoungerAgeExecption(String msg) {
		super(msg);
	}
}

public class Voting {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age = s.nextInt();
		if (age < 18) {
			throw new YoungerAgeExecption("You are not eligible to vote");
		} else {
			System.out.println("Please vote");
		}
	}

}
