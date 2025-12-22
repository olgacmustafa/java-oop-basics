 class Araba {
 int kapi_sayisi;
 int vites_sayisi ;

 
 public Araba() {
	 
 }
 public Araba(int adet) {
 kapi_sayisi = adet ; 
 }

public Araba(int adet, int sayi) {
 kapi_sayisi = adet ;
 vites_sayisi = sayi ; 
 }
}

public class YapilandiriciBasitOrnek{
public static void main(String[] args) {
 Araba ar = new Araba(); // ! Hata var! Bu satır anlamlı
// değil; yapılandırıcısı yok
 Araba ar1 = new Araba(2);
 Araba ar2 = new Araba(4,5);
 
 System.out.println(ar1);
 System.out.println(ar2);
 System.out.println(ar);
}
}
