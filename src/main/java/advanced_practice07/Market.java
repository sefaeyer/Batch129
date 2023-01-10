package advanced_practice07;

import java.time.LocalDate;
import java.util.Date;

public class Market {

    String urunAdi;
    Double urunFiyati;
    String sonKullanmaTarihi;

    Market(String urunAdi, double fiyat, int aySonra){
        this.urunAdi=urunAdi;
        if(fiyat>99){
            fiyat=fiyat*0.9;
        }
        urunFiyati=fiyat;
        sonKullanmaTarihi = LocalDate.now().plusMonths(aySonra).toString();
    }
    Market(String urunAdi, double fiyat){
        this.urunAdi=urunAdi;
        if(fiyat>99){
            fiyat=fiyat*0.9;
        }
        urunFiyati=fiyat;
        sonKullanmaTarihi = "Bu urunun SKT yoktur";
    }

    Market(){

    }


    @Override
    public String toString() {
        return " " +
                "Urun Adi='" + urunAdi + '\'' +
                ", Fiyati=" + urunFiyati +
                ", Son Kullanma Tarihi='" + sonKullanmaTarihi + '\'';
    }
}
