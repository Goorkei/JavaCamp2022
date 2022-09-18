package intro;

public class SesliHarfler {

	public static void main(String[] args) {
		char harf = 'e';

		char[] kalinHarfler = { 'a', 'ı', 'o', 'u', 'A', 'I', 'O', 'U' };
		char[] inceHarfler = { 'e', 'i', 'ö', 'ü', 'E', 'İ', 'Ö', 'Ü' };

		for (char ince : inceHarfler) {
			if (harf == ince) {
				System.out.println(harf + " harfi incedir.");
				return;
			}
		}

		for (char kalin : kalinHarfler) {
			if (harf == kalin) {
				System.out.println(harf + " harfi kalindir.");
				return;
			}
		}

		System.out.println("Giridiğiniz harf geçersizdir.");
	}

}
