public class OgretimUyesi extends Akademisyen {
    String unvan;

    public OgretimUyesi(String adSoyad, String eposta, String telefon, String bolum, String gorevler, String ders, String unvan) {
        super(adSoyad, eposta, telefon, bolum, gorevler, ders);
        this.unvan = unvan;
    }

    @Override
    public String giris() {
        return this.unvan + " " + super.giris();
    }

    public void derseGir(int dersSaati) {
        System.out.println(getUnvan() + " " + getAdSoyad() + " " + dersSaati + " saatlik katılım sağladı");
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }
}
