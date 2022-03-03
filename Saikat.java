public class Saikat extends PK {
    String name2 = "Son's Name : Saikat Roy";
    String work = "Occupation: NALLA";

    void need() {
        System.out.println("Saikat: Baba Bike Lagbe");
        System.out.println("Saikat: R Pretrol Er Money");
    }

    void girlfriend() {
        System.out.println("Saikat: Baba R GF Is So Hot....Bank Blance Capture Kore Amr GF Korte Hobe");
    }

    void capture() {
        System.out.println("Saikat: Baba R Bank Balance R GF Amr Kache ");
        System.out.println("Saikat: Captured Ridhima Shahu.....Aahu Aahu");
    }

    public static void main(String[] args) {
        PK p1 = new PK();
        System.out.println(p1.name);
        System.out.println(p1.bike);
        System.out.println(p1.bankblance);
        p1.girlfrined();
        Saikat s1 = new Saikat();
        System.out.println(s1.name2);
        System.out.println(s1.work);
        System.out.println("  ");
        System.out.println("   CONVERSATION");
        System.out.println("  ");
        s1.need();
        s1.gift();
        s1.girlfriend();
        s1.capture();
        s1.blackmail();
    }
}
