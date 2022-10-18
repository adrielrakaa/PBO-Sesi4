package Sesi4;

public class Matkul extends Dosen{
    String nama;

    Matkul(String nama){
        super(nama);
        this.nama = nama;
    }

    void info(){
        System.out.println("Mata Kuliah \t : " + this.nama);
    }
    
}
