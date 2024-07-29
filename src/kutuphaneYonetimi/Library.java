package kutuphaneYonetimi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Library {

    Map<Integer,Book> bookList = new HashMap<>();

    Scanner scanner = new Scanner(System.in);

    public void add(Book book){
        bookList.put(book.getId(), book);
        System.out.println("Kitap başarıyla eklenmiştir.");
    }

    public void delete(int id){
        bookList.remove(id);
        System.out.println("Kitap başarıyla silinmiştir.");
    }

    public void updateQuantity(int id){
        if (bookList.containsKey(id)){
            System.out.println("Güncelleyeceğiniz miktarı giriniz");
            int kitapSayisi = scanner.nextInt();
            bookList.get(id).setQuantity(kitapSayisi);
            System.out.println("Miktar başarıyla güncellenmiştir.");
        }else {
            System.out.println("Böyle bir kitap bulunamadı");
        }


}


    public void updateShelf(int id){
        if (bookList.containsKey(id)){
            System.out.println("Rafı giriniz");
            String yeniRaf = scanner.nextLine();
            bookList.get(id).setShelf(yeniRaf);
            System.out.println("Raf başarıyla güncellenmiştir.");
        }else {
            System.out.println("Böyle bir kitap bulunamadı");
        }
    }

    public void get(){
        for (Book book : bookList.values()){
            System.out.println(book);
        }

    }

    public void getBookByTitle(String title){
        Set<Map.Entry<Integer,Book>> mySet = bookList.entrySet();
        boolean bulundu=false;
        for (Map.Entry<Integer,Book> w : mySet){
            if (w.getValue().getTitle().equals(title)){
                System.out.println(w);
                bulundu=true;
            }

        }

        if (!bulundu){
            System.out.println("Böyle bir kitap bulunamadı");
        }
    }

    public void getBookByAuthor(String author){
        Set<Map.Entry<Integer,Book>> mySet = bookList.entrySet();
        boolean bulundu=false;
        for (Map.Entry<Integer,Book> w : mySet){
            if (w.getValue().getAuthor().equals(author)){
                System.out.println(w);
                bulundu=true;
            }

        }

        if (!bulundu){
            System.out.println("Böyle bir kitap bulunamadı");
        }
    }

    public void getBookByGenre(String genre){
        Set<Map.Entry<Integer,Book>> mySet = bookList.entrySet();
        boolean bulundu=false;
        for (Map.Entry<Integer,Book> w : mySet){
            if (w.getValue().getGenre().equals(genre)){
                System.out.println(w);
                bulundu=true;
            }

        }

        if (!bulundu){
            System.out.println("Böyle bir kitap bulunamadı");
        }
    }

    public void getBookByPublisher(String publisher){
        Set<Map.Entry<Integer,Book>> mySet = bookList.entrySet();
        boolean bulundu=false;
        for (Map.Entry<Integer,Book> w : mySet){
            if (w.getValue().getPublisher().equals(publisher)){
                System.out.println(w);
                bulundu=true;
            }

        }

        if (!bulundu){
            System.out.println("Böyle bir kitap bulunamadı");
        }
    }

    public void getBookByShelf(String shelf){
        Set<Map.Entry<Integer,Book>> mySet = bookList.entrySet();
        boolean bulundu=false;
        for (Map.Entry<Integer,Book> w : mySet){
            if (w.getValue().getShelf().equals(shelf)){
                System.out.println(w);
                bulundu=true;
            }

        }

        if (!bulundu){
            System.out.println("Bu rafta bir kitap bulunamadı");
        }
    }

    public void borrowBook(int id){
        Set<Map.Entry<Integer,Book>> mySet = bookList.entrySet();
        boolean bulundu=false;
        for (Map.Entry<Integer,Book> w : mySet){
            if (w.getValue().getId()==id){
                if (w.getValue().getQuantity()>0 ){
                    w.getValue().setQuantity(w.getValue().getQuantity()-1);
                    System.out.println("İyi okumalar");
                    bulundu=true;
                } else {
                    System.out.println("Kitap kalmamıştır.");

                }

            }

        }
        if (!bulundu){
            System.out.println("Böyle bir kitap bulunamadı");
        }

    }

    public void returnBook(int id){
    Set<Map.Entry<Integer,Book>> mySet = bookList.entrySet();
    boolean bulundu=false;
        for (Map.Entry<Integer,Book> w : mySet){
        if (w.getValue().getId()==id){
                w.getValue().setQuantity(w.getValue().getQuantity()+1);
            System.out.println("Kitap başarıyla iade edilmiştir");
            bulundu=true;
            }
        }

        if (!bulundu){
        System.out.println("Böyle bir kitap bulunamadı");
    }

        }
}
