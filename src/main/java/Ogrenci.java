
public class Ogrenci {

	public int id;
	
	public String isim;
	
	public String soyisim;
	
	private int yas;
	
	public void bilgiileriYazdir() {
		System.out.println("id: " + id );
		System.out.println("isim: " + isim );
		System.out.println("soyisim: " + soyisim );
	}

	public int getYas(){
		return yas*2;
		}
	public void setYas(int yas) {
		this.yas=yas;
	}
	}
