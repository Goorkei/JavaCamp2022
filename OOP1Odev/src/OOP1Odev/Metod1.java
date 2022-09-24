package OOP1Odev;

public class Metod1 {

	public static void main(String[] args) {

		sayiBulmaca();

	}

	public static void sayiBulmaca() {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 7;
		boolean varMi = false;

		for (int i : sayilar) {
			if (i == aranacak) {
				varMi = true;
				break;
			}
		}
		mesajVer(varMi);
	}

	public static void mesajVer(boolean varMi) {
		System.out.println(varMi ? "Sayi bulundu" : "Sayi bulunamadı.");
	}

}
