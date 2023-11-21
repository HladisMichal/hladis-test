import java.math.BigDecimal;

public class Zbozi {
    private String popis;
    private int cena;
    private boolean maSnizenouDph;
    private int pocetKusu;

    public Zbozi(String popis, int cena, boolean maSnizenouDph, int pocetKusu) {
        this.popis = popis;
        this.cena = cena;
        this.maSnizenouDph = false;
        this.pocetKusu = pocetKusu;
    }

    public String getPopis() {
        return popis;
    }

    public void setPopis(String popis) {
        this.popis = popis;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public boolean isMaSnizenouDph() {
        return maSnizenouDph;
    }

    public void setMaSnizenouDph(boolean maSnizenouDph) {
        this.maSnizenouDph = maSnizenouDph;
    }

    public int getPocetKusu() {
        return pocetKusu;
    }

    public void setPocetKusu(int pocetKusu) {
        this.pocetKusu = pocetKusu;
    }
}
