 public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated


        //Akademisyen a = new Akademisyen("Ahmet", "a@gmail.com", "05050550000", "CENG", " Hoca", "CENG 101");
        //System.out.ptrintln(a.getAdSoyad());

        OgretimUyesi o = new OgretimUyesi("Mehmet", "m@gmail.com", "000", "CENG", "Hoca", "CENG102", "Yard. Doç.");
        //System.out.println(o.giris());

        Memurlar m = new Memurlar("Veli", "a@gmail.com", "05050550000", "Bilgi İslem", "Tam Zamanlı");
        //System.out.println(m.giris());

       // Calisan c = new Akademisyen("Ahmet", "a@gmail.com", "05050550000", "CENG", " Hoca", "CENG 101");
       // Calisan[] girisListesi = {a,o,m};
        //Calisan.listele(girisListesi);

        o.derseGir(10);
    }
 }