public class Main {
    public static void main(String[] args) {

        OgretimUyesi o = new OgretimUyesi(
                "Mehmet",
                "m@gmail.com",
                "000",
                "CENG",
                "Hoca",
                "CENG102",
                "Yard. Doç."
        );

        Memurlar m = new Memurlar(
                "Veli",
                "a@gmail.com",
                "05050550000",
                "Bilgi İşlem",
                "Tam Zamanlı"
        );

        System.out.println(o.giris());
        System.out.println(m.giris());

        o.derseGir(10);

        Calisan[] girisListesi = {o, m};
        Calisan.listele(girisListesi);
    }
}
