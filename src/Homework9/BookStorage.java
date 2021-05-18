package Homework9;

public class BookStorage {

    private Book[] books = new Book[5];

    //   Add Book (տալու ենք բոլոր դաշտերը, պետք է ավելացնի հատուկ իրա համար սարքած BookStorage-ում)

    private int size = 0;

    public void add(Book book) {
        if (size == books.length) {
            extend();
        }
        books[size] = book;
        size++;
    }

    private void extend() {
        Book[] tmp = new Book[books.length + 10];
        System.arraycopy(books, 0, tmp, 0, books.length);
        books = tmp;
    }
//  Pring all books (պետք է տպի բոլոր գրքերը)

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(books[i]);
        }
    }

    // 7 - Print Books by price range (պետք է տանք 2 թիվ, այդ թվերի սահմաններում գրքերը պտի տեսնենք)
    public void bookprise(int min, int max) {
        for (int i = 0; i < size; i++) {
            if (books[i].getPrice() >= min && books[i].getPrice() <= max) {
                System.out.println(books[i]);

            }
        }
    }
//   8 - is book Exists (պետք է գրքի title-ը և հեղինակի իմեյլը ներմուծենք, ու տպենք true եթե ունենք նման գիրք, եթե չէ false)

    boolean isBookExists(String title, String authorEmail) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getTitle().equals(title) && books[i].getAuthorEmail().equals(authorEmail)) {
                return true;
            }

        }
        return false;

    }


}






