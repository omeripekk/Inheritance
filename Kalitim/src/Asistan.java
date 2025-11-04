public class Asistan extends Akademisyen {
    protected String yuksekLisans;

    public Asistan(String adSoyad, String eposta, String telefon, String bolum, String gorevler, String dersler, String yuksekLisans) {
        super(adSoyad, eposta, telefon, bolum, gorevler, dersler);
        this.yuksekLisans = yuksekLisans;
    }

    @Override
    public String giris() {
        return "Asistan " + super.giris();
    }
    public String getYuksekLisans() {
        return yuksekLisans;
    }
    public void setYuksekLisans(String yuksekLisans){
        this.yuksekLisans = yuksekLisans;
    }
    public void derseGir(int dersSaati) {
        System.out.println( getAdSoyad()+ " " + getDers() + dersSaati +" Derse Asistan Olarak Girdi"
        );
    }

}
