/* Nama File : Garis.java
 * Nama      : Kaila Talitha Putri
 * Nim       : 24060123140179
 * Kelas     : C
*/

public class Garis {
    private Titik titikawal;
    private Titik titikakhir;
    private static int counterGaris = 0;

    public Garis(){
        this.titikawal = new Titik(0,0);
        this.titikakhir = new Titik(1,1);
        counterGaris++;
    }

    public Garis(Titik titikawal, Titik titikakhir){
        this.titikawal = titikawal;
        this.titikakhir = titikakhir;
        counterGaris++;
    }

    public Titik getTitikAwal(){
        return titikawal;
    }

    public Titik getTitikAkhir(){
        return titikakhir;
    }

    public void setAwal(Titik titikawal){
        this.titikawal = titikawal;
    }

    public void setAkhir(Titik titikakhir){
        this.titikakhir = titikakhir;
    }

    public static int getCounterGaris(){
        return counterGaris;
    }

    public double panjangGaris(){
        return Math.sqrt(Math.pow(titikakhir.getAbsis() - titikawal.getAbsis(),2) + Math.pow(titikakhir.getOrdinat() - titikawal.getOrdinat(), 2));
    }

    public double gradien(){
        if (titikakhir.getAbsis() - titikawal.getAbsis() == 0) {
            throw new ArithmeticException("Garis vertikal, gradien tidak terdefinisi."); //jika garisnya vertikal
        }
        return (titikakhir.getOrdinat() - titikawal.getOrdinat()) / (titikakhir.getAbsis() - titikawal.getAbsis());
    }

    public Titik titikTengah() {
        return new Titik((titikawal.getAbsis() + titikakhir.getAbsis()) / 2, (titikawal.getOrdinat() + titikakhir.getOrdinat()) / 2);
    }

    public boolean ckSejajar(Garis g){
        return this.gradien() == g.gradien();
    }

    public boolean cekTegakLurus(Garis g){
        return this.gradien()*g.gradien() == -1;
    }

    public void printGaris(){
        System.out.println("Titik Awal: (" + titikawal.getAbsis() + ", " + titikawal.getOrdinat() + ")");
        System.out.println("Titik Akhir: (" + titikakhir.getAbsis() + ", " + titikakhir.getOrdinat() + ")");
    }

    public String printPersamaanGaris(){
        double m = gradien();
        double c = titikawal.getOrdinat() - m * titikawal.getAbsis();
        return "y = " + m + "x + " + c;
    }

} //end class Garis
