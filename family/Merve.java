
public class Merve extends Aile {
	String meslek; 
	
	public Merve(String tcNo,int dogumYili,String cinsiyet,String meslek) {
		super(tcNo,dogumYili,cinsiyet);
		this.meslek=meslek;
		
	}
	
	public void evdekiKonumu() {
		System.out.println("Merve mutfakta aşkımızı pişiriyor...");
		
	}
   
	@Override
	public void yazdir() {
		super.yazdir();
		System.out.println(", Meslek:"+meslek);
		
	}

	
}
