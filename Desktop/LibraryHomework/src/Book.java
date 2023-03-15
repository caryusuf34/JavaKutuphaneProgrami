public class Book {

    private String ISBN ;
    private String KitapAdi;
    private String YazarAdi;
    private int  BasimYili;
    private String KitapTuru;

    public Book(String ISBN, String kitapAdi, String yazarAdi, int basimYili, String kitapTuru) {
        this.ISBN = ISBN;
        KitapAdi = kitapAdi;
        YazarAdi = yazarAdi;
        BasimYili = basimYili;
        KitapTuru = kitapTuru;
    }
    public void showBook(){
        System.out.println("ısbn no :"+getISBN());
        System.out.println("Kitap adı :"+getKitapAdi());
        System.out.println("Yazar adı  :"+getYazarAdi());
        System.out.println("Basım yılı :"+getBasimYili());
        System.out.println("kitap turu "+getKitapTuru());
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getKitapAdi() {
        return KitapAdi;
    }

    public void setKitapAdi(String kitapAdi) {
        KitapAdi = kitapAdi;
    }

    public String getYazarAdi() {
        return YazarAdi;
    }

    public void setYazarAdi(String yazarAdi) {
        YazarAdi = yazarAdi;
    }

    public int getBasimYili() {
        return BasimYili;
    }

    public void setBasimYili(int basimYili) {
        BasimYili = basimYili;
    }

    public String getKitapTuru() {
        return KitapTuru;
    }

    public void setKitapTuru(String kitapTuru) {
        KitapTuru = kitapTuru;
    }
}
