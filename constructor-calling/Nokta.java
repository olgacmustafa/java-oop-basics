package yapilandiriciCagirma;

public class Nokta {
    int x, y;

    // Birincil constructor
    public Nokta(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Tek parametreli constructor, diğerini çağırıyor
    public Nokta(int x) {
        this(x, 0); // <-- burada diğer constructor çağrılıyor
    }

    // Parametresiz constructor, zinciri devam ettiriyor
    public Nokta() {
        this(0); // Nokta(0) -> Nokta(0,0)
    }


    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public static void main(String[] args) {
        System.out.println(new Nokta());       // (0,0)
        System.out.println(new Nokta(5));      // (5,0)
        System.out.println(new Nokta(3,4));    // (3,4)
    }
}