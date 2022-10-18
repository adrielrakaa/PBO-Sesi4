package Sesi4;

public class NamaProduser {
    protected String nama_prod;

    public NamaProduser(String nama_prod, String nama_album){
        super(nama_album);
        this.nama_prod = nama_prod;
    }

    public boid infoLagu(){
        System.out.println("Nama album :" + super.nama_album);
        System.out.println("Nama Produser :" + this.nama_prod);
    }
}
