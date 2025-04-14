public class Calisan {
  protected String adSoyad, eposta, telefon;
  static int girisSayisi;

  public Calisan(String adSoyad, String eposta, String telefon) {
    this.adSoyad = adSoyad;
    this.eposta = eposta;
    this.telefon = telefon;
  }

  public Calisan(String adSoyad) {
    this(adSoyad, "", "");
  }

  public String giris() {
    return this.adSoyad + " giriş yaptı";
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

  public String getTelefon() {
    return telefon;
  }

  public void setTelefon(String telefon) {
    this.telefon = telefon;
  }
  public static void listele(Calisan[] girisYapanlar) {
    for(Calisan c : girisYapanlar) {
      System.out.println(c.giris());
    }
  }
}
