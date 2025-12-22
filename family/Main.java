import java.util.ArrayList;
import java.util.List;

public class Main {
	

	public static void main(String[] args) {
		
		List<Aile> liste=new ArrayList<>();
		liste.add(new Merve("10769759712",2006,"kadın","gomulu"));
		liste.add(new Mustafa("11369837558",2007,"erkek",100000));
		liste.add(new Mercan("11111111111",2030,"kadın"));
		liste.add(new Mert("22222222222",2035,"erkek"));
		
		for(Aile a:liste) {
			a.yazdir();
			
		}
		
		Mustafa sevgi=new Mustafa("11369837558",2007,"erkek",100000);
		sevgi.enSevdigiKisi();
		Merve konum= new Merve("10769759712",2006,"kadın","gomulu");
		konum.evdekiKonumu();
	}
	
}
