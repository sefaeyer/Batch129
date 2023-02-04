package aaaadeneme;

import projeler.proje04_hastane_projesi.VeriBankasi;

public class Hasta extends VeriBankasi {


    private String isim;
    private String soyIsim;
    private int hastaID;
    private Durum hastaDurumu;

    public Hasta() {

    }

    public Hasta(int hastaId, String isim, String soyisim) {

    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyIsim() {
        return soyIsim;
    }

    public void setSoyIsim(String soyIsim) {
        this.soyIsim = soyIsim;
    }

    public int getHastaID() {
        return hastaID;
    }

    public void setHastaID(int hastaID) {
        this.hastaID = hastaID;
    }

    public Durum getHastaDurumu() {
        return hastaDurumu;
    }

    public void setHastaDurumu(Durum hastaDurumu) {
        this.hastaDurumu = hastaDurumu;
    }
}
