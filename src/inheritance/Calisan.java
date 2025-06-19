package inheritance;
// surekli kod yazımından kurtarmak icin kalıtım yapılır
//atadan cocuklara aktarım
public class Calisan {
        String adSoyad, eposta;
        int tel;
       static int girisSayisi=0;

        protected static int giris(){
           // System.out.println("calisan giris yaptı !");

            return ++Calisan.girisSayisi;
    }

}
