package inheritance;

public class memurlar extends Calisan{ String departman, mesai;

    public memurlar(String adSoyad, String eposta, String tel, String departman) {
        super(adSoyad, eposta, tel);
        this.departman = departman;
    }
}
