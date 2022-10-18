package Sesi4;

public class Album {
    public static void main(String[] args) {
        Lagu LaguSaya = null;

        NamaLagu Namalagu = new NamaLagu ("Sanctuary", "Joji");
        NamaProduser nama_prod = new NamaProduser("Justin Raisen");
        LaguSaya = NamaLagu;
        LaguSaya.infoLagu();

        LaguSaya = nama_prod;
        LaguSaya.infoLagu;
    }
}
