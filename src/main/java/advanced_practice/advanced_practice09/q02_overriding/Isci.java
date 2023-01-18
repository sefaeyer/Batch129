package advanced_practice.advanced_practice09.q02_overriding;

public class Isci extends Banka{

    @Override
    public double faizHesapla(double alinacakKredi) {
        return alinacakKredi*0.15;
    }
}
