package inheritance;

public class bilgisIslem extends memurlar{

    String gorev;

    public bilgisIslem(String adSoyad, String eposta, String tel, String departman, String gorev) {
        super(adSoyad, eposta, tel, departman);
        this.gorev = gorev;
    }
}
