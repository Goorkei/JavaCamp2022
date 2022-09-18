package intro;

public class ArraysDemo {
	public static void main(String[] args) {
		String[] ogrenciler = new String[3];
		ogrenciler[0] = "Görkem";
		ogrenciler[1] = "Arslan";
		ogrenciler[2] = "Mercan";

		for (Object ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}
	}

}
