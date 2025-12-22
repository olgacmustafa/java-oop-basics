public class Aile{
	
	String tcNo;
	int dogumYili;
	String cinsiyet;
	public Aile(String tcNo,int dogumYili,String cinsiyet) {
		this.tcNo=tcNo;
		this.dogumYili=dogumYili;
		this.cinsiyet=cinsiyet;
		
	}
	public void yazdir() {
		System.out.println("TC:"+tcNo+", Doğum Yılı:"+dogumYili+", Cinsiyet:"+cinsiyet);
	}
	
	
	
}
