import java.util.ArrayList;

public class Library {
    private String KutuphaneAdi;
    private String KutuphaneAdresi;
    private ArrayList<Book> bookArrayList;

    public Library(String kutuphaneAdi, String kutuphaneAdresi, ArrayList<Book> bookArrayList) {
        KutuphaneAdi = kutuphaneAdi;
        KutuphaneAdresi = kutuphaneAdresi;
        this.bookArrayList = bookArrayList;
    }
    public void addBook(Book book){
    bookArrayList.add(book);

    }
    public  void removeBook(String isbn ){
        for (int i=0; i<bookArrayList.size();++i){
            if (bookArrayList.get(i).getISBN().equals(isbn)){
                bookArrayList.remove(bookArrayList.get(i));
            }
        }

    }
    public void showLibrary(){
        System.out.println("kutuphane adı:"+getKutuphaneAdi());
        System.out.println("Kutuphane adresi :"+getKutuphaneAdresi());
        if (bookArrayList.isEmpty()){
            System.out.println("Lütfen kitap listesine önce bir kitap ekleyiniz...");
        }
        else {
            int i=1;
            for (Book book:bookArrayList){
                System.out.println(i+". kitap");
                book.showBook();
                i++;
            }

        }

    }

    public String getKutuphaneAdi() {
        return KutuphaneAdi;
    }

    public void setKutuphaneAdi(String kutuphaneAdi) {
        KutuphaneAdi = kutuphaneAdi;
    }

    public String getKutuphaneAdresi() {
        return KutuphaneAdresi;
    }

    public void setKutuphaneAdresi(String kutuphaneAdresi) {
        KutuphaneAdresi = kutuphaneAdresi;
    }

    public ArrayList<Book> getBookArrayList() {
        return bookArrayList;
    }

    public void setBookArrayList(ArrayList<Book> bookArrayList) {
        this.bookArrayList = bookArrayList;
    }
}
