package aaaadeneme;

import projeler.proje04_hastane_projesi.VeriBankasi;

public class Doktor extends VeriBankasi {

    private String isim;
    private String Soyisim;
    private String unvan;

    public Doktor() {

    }

    public Doktor(String isim, String soyisim, String unvan) {
        this.isim = isim;
        Soyisim = soyisim;
        this.unvan = unvan;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return Soyisim;
    }

    public void setSoyisim(String soyisim) {
        Soyisim = soyisim;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }
}
