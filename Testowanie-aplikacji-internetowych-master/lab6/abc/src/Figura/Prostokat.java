package Figura;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Prostokat {

    private double pierwszyBok;
    private double drugiBok;

    public Prostokat() {
    }

    public Prostokat(double pierwszyBok, double drugiBok) {
        this.pierwszyBok = pierwszyBok;
        this.drugiBok = drugiBok;
    }
    
    public double getPierwszyBok() {
        return pierwszyBok;
    }

    public double getDrugiBok() {
        return drugiBok;
    }

    public void setPierwszyBok(double pierwszyBok) {
        this.pierwszyBok = pierwszyBok;
    }

    public void setDrugiBok(double drugiBok) {
        this.drugiBok = drugiBok;
    }

    public double poleProstokata() {
        return pierwszyBok*drugiBok;
    }

    public double obwodProstokata() {
        return 2*pierwszyBok+2*drugiBok;
    }

    public double przekatnaProstokata() {
        return sqrt(pow(pierwszyBok,2)+pow(drugiBok,2));
    }
    

    
}


