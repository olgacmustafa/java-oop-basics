import java.util.Scanner;

public class Musteri {

    String musteriAd;
    String musteriId;
    String ePosta;
    String telefonNo;
    boolean uyeMi;

    // Kurucu (constructor)
    public Musteri(String musteriAd, String musteriId, String ePosta, String telefonNo, boolean uyeMi) {
        this.musteriAd = musteriAd;
        this.musteriId = musteriId;
        this.ePosta = ePosta;
        this.telefonNo = telefonNo;
        this.uyeMi = uyeMi;
    }

    // Bilgileri yazdıran metot
    public void bilgileriYazdir() {
        System.out.println("\n--- Müşteri Bilgileri ---");
        System.out.println("Ad: " + musteriAd);
        System.out.println("ID: " + musteriId);
        System.out.println("E-Posta: " + ePosta);
        System.out.println("Telefon: " + telefonNo);
        System.out.println("Üye mi: " + (uyeMi ? "Evet" : "Hayır"));
    }

    // Kullanıcıdan veri alıp Musteri nesnesi oluşturan metot
    public static Musteri musteriOlustur() {
        Scanner input = new Scanner(System.in);

        System.out.print("Müşteri adını girin: ");
        String ad = input.nextLine();

        System.out.print("Müşteri ID'sini girin: ");
        String id = input.nextLine();

        System.out.print("E-posta adresini girin: ");
        String ePosta = input.nextLine();

        System.out.print("Telefon numarasını girin: ");
        String telefon = input.nextLine();

        System.out.print("Üye mi? (true/false): ");
        boolean uyeMi = input.nextBoolean();
        input.close();

        // Yeni Musteri nesnesi oluşturuluyor
        Musteri musteri = new Musteri(ad, id, ePosta, telefon, uyeMi);

        return musteri;
    }

    // main metodu
    public static void main(String[] args) {
        Musteri yeniMusteri = musteriOlustur();
        yeniMusteri.bilgileriYazdir();
    }
}
