package intro;

public class SayiBulma {

	public static void main(String[] args) {

		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 3;
		boolean varMi = false;

		for (int i : sayilar) {
			if (i == aranacak) {
				varMi = true;
				break;
			}
		}
		System.out.println(varMi?"Sayi bulundu":"Sayi bulunamadı.");

	}

}
