package hesapMakinesi;
import java.util.*;

public class HesapMakinesi {
	int a;
	int b;
	int sonuc;
	char ch;
	
	public void islemler() {

		
		switch(ch) {
		  
		case '+':
			sonuc=a+b;
			System.out.println("Sonuc="+sonuc);
			break;
		case '-':
			sonuc=a-b;
			System.out.println("Sonuc="+sonuc);
			break;
		case '*':
			sonuc=a*b;
			System.out.println("Sonuc="+sonuc);
			break;
		case '/':
			
			if(b==0) {
				System.out.println("Maalesef sifira bolme islemi gerceklestirilemez.");
				return;
			}
			double sonuc=(double)a/b;
			System.out.println("Sonuc="+sonuc);
			break;
		
		}
		
	}
	 
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
	   System.out.println("----Merhabalar HESAP MAKİNESİNE Hoşgeldiniz----");
	      HesapMakinesi cv=new HesapMakinesi();
	   System.out.println("1. sayiyi giriniz:");
	      cv.a=input.nextInt();
	   System.out.println("2. sayiyi giriniz:");
	      cv.b=input.nextInt();
	   System.out.println("Yapmak istediğiniz işlemi giriniz:(+,-,/,*)");
	      cv.ch=input.next().charAt(0);
	      if(cv.ch!='+' && cv.ch!='-'&& cv.ch!='*' && cv.ch!='/') {
	    	  System.out.println("Yanlıs islem girdiniz. Tekrar deneyiniz..");
	      }
	      else {
	    	  cv.islemler();
	    	  input.close();
	      }
		
	}	
}
