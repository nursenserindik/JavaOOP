package inheritance;
// surekli kod yazımından kurtarmak icin kalıtım yapılır
//atadan cocuklara aktarım
public class Calisan {
       protected String adSoyad, eposta, tel;
       //static int girisSayisi=0;


    public Calisan(String adSoyad, String eposta, String tel)
    {
        this.adSoyad=adSoyad;
        this.eposta=eposta;
        this.tel=tel;
    }
        protected  void  giris(){
            System.out.println( this.adSoyad + " giris yaptı !"); //cok iyi kullanıs bicimi

           // return ++Calisan.girisSayisi;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getEposta() {
        return eposta;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
