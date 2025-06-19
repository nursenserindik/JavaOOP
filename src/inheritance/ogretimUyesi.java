package inheritance;

public class ogretimUyesi extends akademisyen{


    String unvan;

    public ogretimUyesi(String adSoyad, String eposta, String tel, String bolum, String gorevler, String dersler, String unvan) {
        super(adSoyad, eposta, tel, bolum, gorevler, dersler);
        this.unvan = unvan;
    }
}
