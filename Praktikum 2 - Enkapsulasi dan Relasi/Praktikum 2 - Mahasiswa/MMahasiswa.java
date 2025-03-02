/* Nama  : Kaila Talitha Putri
 * Nim   : 24060123140179
 * Kelas : C
 * Lab   : C1 */

public class MMahasiswa {
    public static void main(String[] args) {
        // Objek MataKuliah 
        MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Berorientasi Objek", 3);
        MataKuliah MBD = new MataKuliah("MBD", "Manajemen Basis Data", 3);
        
        // Objek Mahasiswa
        Mahasiswa M1 = new Mahasiswa("234", "Furina", "Informatika");
        Mahasiswa M2 = new Mahasiswa("179", "Kaila", "Informatika");
        
        // Objek Dosen
        Dosen D1 = new Dosen("123", "Nahida", "Informatika");
        Dosen D2 = new Dosen("356", "Zhongli", "Informatika");

        // Objek Kendaraan
        Kendaraan K1 = new Kendaraan("H1234AB", "Motor");
        Kendaraan K2 = new Kendaraan("H1984OM", "Mobil");

        // Menetapkan dosen wali dan kendaraan
        M1.setDosenWali(D1);
        M1.setKendaraan(K1);
        M2.setDosenWali(D2);
        M2.setKendaraan(K2);

        // Menambahkan mata kuliah
        M1.addMatKul(PBO);
        M1.addMatKul(MBD);
        M2.addMatKul(PBO);
        M2.addMatKul(MBD);

        // Menampilkan detail Mahasiswa M1
        System.out.println("========== DATA MAHASISWA 1 ==========");
        M1.printDetailMhs();
        System.out.println("Jumlah Mata Kuliah = " + M1.getJumlahMatKul());
        System.out.println("Jumlah SKS Mata Kuliah = " + M1.getJumlahSKS());

        // Menampilkan detail Mahasiswa M2
        System.out.println("\n========== DATA MAHASISWA 2 ==========");
        M2.printDetailMhs();
        System.out.println("Jumlah Mata Kuliah = " + M2.getJumlahMatKul());
        System.out.println("Jumlah SKS Mata Kuliah = " + M2.getJumlahSKS());
    }
}
