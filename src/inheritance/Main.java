package inheritance;

public class Main {
    public static void main(String[] args) {

        Calisan c =new Calisan();
        akademisyen a= new akademisyen();
        memurlar m=new memurlar();
        //c.giris(); //giris calisan sınıfındaki değisken
        //a.giris(); // kalıtım yaparak altsınıflardan da ulastik
        //m.giris();
        System.out.println(akademisyen.giris());
        System.out.println(memurlar.giris());

    }
    //calisan sınıfın icerisinde var olan nesneler vs diğer altsınıflarda da varmıs gibi
    //


}

