package inheritance;

public class akademisyen extends Calisan { //extends ... diyerek kalıtım sağlanır
    // akademisyen calisanın bir altsınıfı olur


    String bolum, gorevler;
    String dersler;

    //akademisyen const yazıldıgında hata veriyor
    // ust sınıfta da const var ver oradaki degiskenleride burdaki consta eklemelisin
    // bunun icin super() kullanılır

    public akademisyen(String adSoyad, String eposta, String tel, String bolum,String gorevler,String dersler)
    {
        super(adSoyad,eposta,tel);
        this.bolum=bolum;
        this.gorevler=gorevler;
        this.dersler=dersler;

    }

    public void derseGir(){
        System.out.println("derse girildi");
    }

}
