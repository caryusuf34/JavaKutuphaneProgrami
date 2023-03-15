import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Lütfen Kütüphane İsmini Giriniz :");
        String KutuphaneAdi=input.nextLine();
        System.out.println("Lütfen kütüphane adresi giriniz :");
        String KutuphaneAdresi=input.nextLine();

        ArrayList<Book> bookArrayList = new ArrayList<Book>();
        Library newLibrary = new Library(KutuphaneAdi,KutuphaneAdresi, bookArrayList);


    while (true){
        System.out.println("( l ) Kitapların listesi \n( a ) kitap ekleme   \n( r ) kitap silme \n( exit ) çıkış");
        Scanner input1=new Scanner(System.in);
        String secim=input1.next();
        if (secim.equals("exit")){
            System.out.println("programdan çıkış yaptınız");
            break;
        }
        else switch (secim) {
            case "a":
                Scanner input2 = new Scanner(System.in);
                System.out.print("ISBN giriniz :");
                String ISBN = input2.nextLine();
                System.out.print("kitap adı giriniz :");
                String KitapAdi = input2.nextLine();
                System.out.print("Yazar adı giriniz :");
                String YazarAdi = input2.nextLine();
                System.out.print("Basım yılı giriniz :");
                int BasimYili = input2.nextInt();
                System.out.print("Kitap çeşidi giriniz :");
                String KitapCesidi = input2.next();
                Book book = new Book(ISBN, KitapAdi, YazarAdi, BasimYili, KitapCesidi);
                newLibrary.addBook(book);
                break;
            case "r":
                Scanner input3 = new Scanner(System.in);

                System.out.print("Lütfen silmek istediğiniz kitabın ISBN'sini giriniz :");

                String ISBN2 = input3.nextLine();

                newLibrary.removeBook(ISBN2);
                break;
            case "l":
                newLibrary.showLibrary();
                break;
        }
        }
    }
}
