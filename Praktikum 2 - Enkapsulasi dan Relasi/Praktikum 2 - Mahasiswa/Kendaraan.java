/* Nama  : Kaila Talitha Putri
 * Nim   : 24060123140179
 * Kelas : C
 * Lab   : C1 */

// Class Kendaraan
public class Kendaraan {
    private String noPlat;
    private String jenis;
    
    public Kendaraan(String noPlat, String jenis) {
        this.noPlat = noPlat;
        this.jenis = jenis;
    }
    
    public String getNoPlat() { 
        return noPlat; }

    public void setNoPlat(String noPlat) { 
        this.noPlat = noPlat; }

    public String getJenis() { 
        return jenis; }

    public void setJenis(String jenis) { 
        this.jenis = jenis; }
}


