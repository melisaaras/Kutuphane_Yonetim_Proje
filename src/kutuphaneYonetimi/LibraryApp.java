package kutuphaneYonetimi;

import java.util.Scanner;

public class LibraryApp {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

       // Book book1 = new Book(1232,"Harry Potter:Felsefe Taşı","J.K.Rowling","Fantastik","Yapı Kredi",5,null);
//
       // Book book2 = new Book(1233, "The Hobbit", "J.R.R. Tolkien", "HarperCollins", "Fantasy", 3, null);
       // Book book3 = new Book(1234, "1984", "George Orwell", "Secker & Warburg", "Dystopian", 4, null);
       // Book book4 = new Book(1235, "To Kill a Mockingbird", "Harper Lee", "J.B. Lippincott & Co.", "Fiction", 6, null);
       // Book book5 = new Book(1236, "The Great Gatsby", "F. Scott Fitzgerald", "Charles Scribner's Sons", "Fiction", 2, null);
       // Book book6 = new Book(1237, "Moby Dick", "Herman Melville", "Harper & Brothers", "Adventure", 7, null);
       // Book book7 = new Book(1238, "Pride and Prejudice", "Jane Austen", "T. Egerton", "Romance", 5, null);
       // Book book8 = new Book(1239, "War and Peace", "Leo Tolstoy", "The Russian Messenger", "Historical", 8, null);
       // Book book9 = new Book(1240, "The Catcher in the Rye", "J.D. Salinger", "Little, Brown and Company", "Fiction", 4, null);
       // Book book10 = new Book(1241, "The Alchemist", "Paulo Coelho", "HarperTorch", "Adventure", 10, null);

        Library library = new Library();

      //  library.add(book1);
      //  library.add(book2);
      //  library.add(book3);
      //  library.add(book4);
      //  library.add(book5);
      //  library.add(book6);
      //  library.add(book7);
      //  library.add(book8);
      //  library.add(book9);
      //  library.add(book10);

        library.get();

        while (true){
            System.out.println("Kütüphanemize hoşgeldiniz");
            System.out.println("1-Kitap ekleme");
            System.out.println("2-Kitap silme");
            System.out.println("3-Kitapları listeleme");
            System.out.println("4-Kitap ödünç alma");
            System.out.println("5-Kitap iade etme");
            System.out.println("6-Kitap ismine göre filtreleme");
            System.out.println("7-Kitap yazarına göre filtreleme");
            System.out.println("8-Kitap türüne göre filtreleme");
            System.out.println("9-Kitap rafına göre filtreleme");
            System.out.println("10-Kitap yayınevine göre filtreleme");
            System.out.println("11-Kitap miktarını güncelle");
            System.out.println("12-Kitap rafını güncelle");
            System.out.println("13-Çıkış yap");

            System.out.println("--------");

            System.out.println("Seçiminizi giriniz");
            int select = scan.nextInt();
            switch (select){
                case 1:
                    System.out.println("Kitabın idsini giriniz");
                    int id = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Kitabın adını giriniz");
                    String title=scan.nextLine();
                    System.out.println("Kitabın yazarını giriniz");
                    String author = scan.nextLine();
                    System.out.println("Kitabın türünü giriniz");
                    String genre = scan.nextLine();
                    System.out.println("Kitabın yayınevini giriniz : ");
                    String publisher = scan.nextLine();
                    System.out.println("Kitabın miktarini giriniz : ");
                    int quantity = scan.nextInt();

                    String shelf = null;

                    Book newBook = new Book(id, title, author, genre, publisher, quantity, shelf);

                    library.add(newBook);

                    break;

                case 2:
                    System.out.println("Kitabın idsini giriniz");
                    int silinecekId = scan.nextInt();
                    scan.nextLine();

                    library.delete(silinecekId);
                    break;

                case 3:
                    library.get();
                    break;

                case 4:
                    System.out.println("Ödünç almak istediğiniz kitabın idsini giriniz");
                    int oduncId= scan.nextInt();
                    library.borrowBook(oduncId);
                    break;

                case 5:
                    System.out.println("İade etmek istediğiniz kitabın idsini giriniz");
                    int iadeId= scan.nextInt();
                    library.returnBook(iadeId);
                    break;

                case 6:
                    System.out.println("Kitap ismini giriniz");
                    String ismeGore=scan.nextLine();
                    library.getBookByTitle(ismeGore);
                    break;

                case 7:
                    System.out.println("Yazar ismini giriniz");
                    String yazaraGore=scan.nextLine();
                    library.getBookByAuthor(yazaraGore);
                    break;

                case 8:
                    System.out.println("Tür ismini giriniz");
                    String tureGore=scan.nextLine();
                    library.getBookByGenre(tureGore);
                    break;

                case 9:
                    System.out.println("Raf ismini giriniz");
                    String rafaGore=scan.nextLine();
                    library.getBookByShelf(rafaGore);
                    break;

                case 10:
                    System.out.println("Yayınevi ismini giriniz");
                    String yayınevineGore=scan.nextLine();
                    library.getBookByPublisher(yayınevineGore);
                    break;

                case 11:
                    System.out.println("Miktarını güncellemek istediğiniz kitabın idsini giriniz");
                    int miktarGuncelleme = scan.nextInt();
                    library.updateQuantity(miktarGuncelleme);

                case 12:
                    System.out.println("Rafa eklemek istediğiniz kitabın idsini giriniz");
                    int rafGuncelleme = scan.nextInt();
                    library.updateShelf(rafGuncelleme);

                case 13:
                    System.out.println("Çıkış yapılıyor");
                    break;

                default:
                    System.out.println("Geçerli seçim yapınız");

            break;
            }


        }



















    }
}
