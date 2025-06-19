package inheritance;

public class Main {
    public static void main(String[] args) {

        Calisan c =new Calisan("mayk","mayk123,","34567");
        akademisyen a= new akademisyen("nursen", "nursennnn",  "345654","bilgMuh","ogrenci",   "mat");
        //memurlar m=new memurlar();
        //c.giris(); //giris calisan sınıfındaki değisken
        //a.giris(); // kalıtım yaparak altsınıflardan da ulastik
        //m.giris();
        //System.out.println(akademisyen.giris());
        //System.out.println(memurlar.giris());

       // asistan as=new asistan();
        //as.derseGir(); // birbiriyle baglantili olanlarla ulasilir

        //yukari dogru kalıtım olamaz !!

        System.out.println(c.getAdSoyad());
        System.out.println(a.getAdSoyad());

        ogretimUyesi o=new ogretimUyesi(   "nur","nurrr","55555","ceng","docent","all","doc");
        o.giris();




    }
    //calisan sınıfın icerisinde var olan nesneler vs diğer altsınıflarda da varmıs gibi
    //


}

