/* Nama  : Kaila Talitha Putri
 * Nim   : 24060123140179
 * Kelas : C
 * Lab   : C1 */

// Class MataKuliah
public class MataKuliah {
    private String idMatKul;
    private String nama;
    private int sks;
    
    public MataKuliah(String idMatKul, String nama, int sks) {
        this.idMatKul = idMatKul;
        this.nama = nama;
        this.sks = sks;
    }

    public String getidMatKul() { 
        return idMatKul; 
    }

    public void setidMatKul(String idMatKul) { 
        this.idMatKul = idMatKul; 
    }

    public String getNama() { 
        return nama; 
    }

    public void setNama(String nama) { 
        this.nama = nama; 
    }

    public int getSks() { 
        return sks; 
    }

    public void setSks(int sks) { 
        this.sks = sks; 
    }
}
