package Sesi4;

public class NamaLagu {
    protected String Judul_Lagu;
    private java.lang.String Nama_Lagu;

    public NamaLagu(String Nama_Lagu, String nama_album){
        super(nama_album);
        this.Nama_Lagu = Nama_Lagu;
    }

    public void infoLagu(){
        System.out.println("Nama album : "+ super.nama_album);
        System.out.println("Adalah Judul album :"+ this.Nama_Lagu);
    }
}
