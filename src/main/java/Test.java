
public class Test {

	public static void main(String[] args) {
		
		Ogrenci ogrenci1 = new Ogrenci();
		
		ogrenci1.id=1;
		ogrenci1.isim="Derya";
		ogrenci1.soyisim="Bektas";
		ogrenci1.setYas(21);
		
		ogrenci1.bilgiileriYazdir();
		
		
		System.out.println("Öğrencinin yaşı : " + ogrenci1.getYas());

	}

}
