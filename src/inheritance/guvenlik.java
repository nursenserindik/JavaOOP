package inheritance;

public class guvenlik extends memurlar{

    String belge;

    public guvenlik(String adSoyad, String eposta, String tel, String departman, String belge) {
        super(adSoyad, eposta, tel, departman);
        this.belge = belge;
    }
}
