
public class Mustafa extends Aile{
	
	int maas;
	
	
	public Mustafa(String tcNo,int dogumYili,String cinsiyet,int maas) {
		super(tcNo,dogumYili,cinsiyet);
		this.maas=maas;
		
	}
	public void enSevdigiKisi() {
		System.out.println("MERVE KARAGÜLLE 1 NUMARA TABİKİSİDE...(MERCAN KISKAN)");
		
	}


	@Override
	public void yazdir() {
		super.yazdir();
		System.out.println(", Maaş:"+maas);
	}
}
