/* Nama File : Titik.java 
 * Nama      : Kaila Talitha Putri
 * Nim       : 24060123140179
 * Kelas     : C
*/

public class Titik {
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    public Titik(){
        absis = 0;
        ordinat = 0;
        
        counterTitik++;
    }

    public Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    public double getAbsis(){
        return this.absis;
    }

    public double getOrdinat(){
        return this.ordinat;
    }

    public void setAbsis(double x){
        this.absis = x;
    }

    public void setOrdinat(double y){
        ordinat = y;
    }

    public void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    public int getKuadran() {
        if (absis > 0 && ordinat > 0) {
            return 1;
        } else if (absis < 0 && ordinat > 0) {
            return 2;
        } else if (absis < 0 && ordinat < 0) {
            return 3;
        } else if (absis > 0 && ordinat < 0) {
            return 4;
        } else {
            return 0; //jika berada pada (0,0)
        }
    }

    public double getJarakPusat(){
        return Math.sqrt(absis*absis + ordinat*ordinat);
    }

    public double getJarak(Titik T) {
        return Math.sqrt(Math.pow(absis - T.getAbsis(), 2) + Math.pow(ordinat - T.getOrdinat(), 2));
    }

    public void RefleksiX(){
        this.absis *= -1;
    }

    public void RefleksiY(){
        this.ordinat *= -1;
    }

    public Titik getRefleksiX(){
        return new Titik (absis, -ordinat);
    }
    
    public Titik getRefleksiY(){
        return new Titik(-absis, ordinat);
    }

    public void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    public static int getCounterTitik() {
        return counterTitik;
    }
} //end class Titik

