
public class Main {

	public static void main(String[] args) {
	
		
		
	Hayvan kedi=new Kedi();
	Hayvan kopek=new Kopek();
	kedi.sesCikar();
	kopek.sesCikar();
	Memeli c1=(Memeli) kedi;
	Memeli c2=(Memeli) kopek;
	c1.beslen();
	c2.beslen();
	c2.yuru();
	
	Hayvan[] dizi=new Hayvan[2];
	dizi[0]=new Kedi();
	dizi[1]=new Kopek();
	for(Hayvan h:dizi) {
		h.sesCikar();
		Memeli h1=(Memeli) h;
		h1.beslen();
		h1.yuru();
		
	}
	
	
}
}