package ders;

public class Araba {

    String model;
    String renk;
    int yil;

    // Yapıcı (constructor)
    public Araba(String model, String renk, int yil) {
        this.model = model;
        this.renk = renk;
        this.yil = yil;
    }

    // Bilgileri yazdıran metot
    public void  bilgileriYazdir() {
        System.out.print("Model = " + model+" ");
        System.out.print("Renk = " + renk+" ");
        System.out.print("Yıl = " + yil+" ");
      
    }

    // Ana metod
    public static void main(String[] args) {
        // Bir araba nesnesi oluşturalım
        Araba araba1 = new Araba("BMW", "Siyah", 2022);
        Araba araba2= new Araba("Wolksvagen","Yeşil",1980);

        // Bilgileri yazdıralım
        araba1.bilgileriYazdir();
        System.out.println("\n");
        araba2.bilgileriYazdir();
    }
}
