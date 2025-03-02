/* Nama  : Kaila Talitha Putri
 * Nim   : 24060123140179
 * Kelas : C
 * Lab   : C1 */

import java.util.ArrayList;

public class Mahasiswa {
    private String nim;
    private String nama;
    private String prodi;
    private ArrayList<MataKuliah> listMatKul = new ArrayList<>();
    private Dosen dosenWali;
    private Kendaraan kendaraan;
    
    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }
    
    public String getNim(){
        return nim;
    }

    public void setNim(String nim){
        this.nim = nim;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getProdi(){
        return prodi;
    }

    public void setProdi(String prodi){
        this.prodi = prodi;
    }

    public Dosen getDosenWali() {
        return dosenWali;
    }

    public void setDosenWali(Dosen dosenWali) { 
        this.dosenWali = dosenWali; 
    }

    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    public void setKendaraan(Kendaraan kendaraan) { 
        this.kendaraan = kendaraan; 
    }

    public ArrayList<MataKuliah> getListMatKul() {
        return listMatKul;
    }

    public void addMatKul(MataKuliah newMatKul) { 
        listMatKul.add(newMatKul); 
    }

    public int getJumlahMatKul() {
        return listMatKul.size();
    }
    
    public int getJumlahSKS() {
        int total = 0;
        for (MataKuliah mk : listMatKul) {
            total += mk.getSks();
        }
        return total;
    }
    
    public void printDetailMhs() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
        int i;
        for (i = 0; i<listMatKul.size();i++){
            System.out.println(listMatKul.get(i).getNama());
        }
        if (dosenWali != null) {
            System.out.println("Dosen Wali: " + dosenWali.getNama());
        } else {
            System.out.println("Dosen Wali: Belum ada");
        }
        if (kendaraan != null) {
            System.out.println("Kendaraan: " + kendaraan.getJenis() + " - " + kendaraan.getNoPlat());
        } else {
            System.out.println("Kendaraan: Tidak memiliki kendaraan");
        }
        System.out.println("Mata Kuliah yang diambil:");
        for (MataKuliah mk : listMatKul) {
            System.out.println("- " + mk.getNama() + " (" + mk.getSks() + " SKS)");
        }
    }
}

