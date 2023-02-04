package advanced_practice.advanced_practice13;

public enum BeslenmeEgzersiz {

    Ocak("Havuc","Nar",17),
    Subat("Lahana","Ayva",16),
    Mart("Roka","Cagla",19),
    Nisan("Enginar","Cagla",20),
    Mayis("Patlican","Erik",22),
    Haziran("Domates","Kayisi",27),
    Temmuz("Misir","Karpuz",30),
    Agustos("Borulce","Incir",29),
    Eylul("Mantar","Uzum",26),
    Ekim("Lahana","Armut",24),
    Kasim("Karnabahar","Hurma",21),
    Aralik("Pirasa","Portakal",19);

    final String ayinSebzesi;
    String ayinMeyvesi;
    int toplamEgzersizSaati;

    BeslenmeEgzersiz(String ayinSebzesi, String ayinMeyvesi, int toplamEgzersizSaati) {
        this.ayinSebzesi = ayinSebzesi;
        this.ayinMeyvesi = ayinMeyvesi;
        this.toplamEgzersizSaati = toplamEgzersizSaati;
    }
}
