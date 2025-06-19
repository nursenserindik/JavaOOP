package inheritance;

public class asistan extends akademisyen{
    protected String yuksekLisans;

    public asistan(String adSoyad, String eposta, String tel, String bolum, String gorevler, String dersler, String yuksekLisans) {
        super(adSoyad, eposta, tel, bolum, gorevler, dersler);
        this.yuksekLisans = yuksekLisans;
    }

    public String getYuksekLisans() {
        return yuksekLisans;
    }

    public void setYuksekLisans(String yuksekLisans) {
        this.yuksekLisans = yuksekLisans;
    }
}
