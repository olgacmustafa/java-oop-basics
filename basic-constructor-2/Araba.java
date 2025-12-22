public class Araba {
    String marka;
    int hiz;

    // 🔹 Constructor (yapıcı metot)
    public Araba(String m, int h) {
        marka = m;
        hiz = h;
        System.out.println("Yeni araba oluşturuldu!");
    }

    // 🔹 Normal method
    void hizArttir(int miktar) {
        hiz += miktar;
        System.out.println(marka + " hızlandı: " + hiz);
    }

    void bilgileriGoster() {
        System.out.println("Marka: " + marka + ", Hız: " + hiz);
    }

    public static void main(String[] args) {
        // 🔹 Constructor otomatik çağrılır
        Araba a1 = new Araba("BMW", 120);
        Araba a2 = new Araba("Toyota", 100);

        // 🔹 Method’lar biz çağırdığımızda çalışır
        a1.hizArttir(30);
        a2.hizArttir(50);

        a1.bilgileriGoster();
        a2.bilgileriGoster();
    }
}
