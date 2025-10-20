class Mahasiswa {
    private String nama;
    private int nilai;
    
    public Mahasiswa(String nama, int nilai) {
        this.nama = nama;
        this.nilai = nilai;
    }
    
    public String getNama() { return nama; }
    public int getNilai() { return nilai; }
}

public class SoalNomor11 {
    public static void main(String[] args) {
        Mahasiswa[] daftarMahasiswa = {
            new Mahasiswa("King Zaki", 95),
            new Mahasiswa("Prince Andi", 85),
            new Mahasiswa("Ajudan Farrash", 60)
        };
        
        for (Mahasiswa mhs : daftarMahasiswa) {
            System.out.println("Nama: " + mhs.getNama() + " - Nilai: " + mhs.getNilai());
        }
        
        Mahasiswa terbaik = daftarMahasiswa[0];
        for (Mahasiswa mhs : daftarMahasiswa) {
            if (mhs.getNilai() > terbaik.getNilai()) {
                terbaik = mhs;
            }
        }
        
        System.out.println("Mahasiswa dengan nilai tertinggi: " + 
                          terbaik.getNama() + " (" + terbaik.getNilai() + ")");
    }
}