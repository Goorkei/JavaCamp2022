package intro;

public class MiniProjeAsalSayi {

	public static void main(String[] args) {
		int number = -1;
		boolean isAsal = true;

		if (number <= 1) {
			System.out.println(number + " asal değildir.");
			return;
		}

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isAsal = false;
				break;
			}
		}

		System.out.println(isAsal == true ? number + " asaldır." : number + " asal değildir.");

	}

}
