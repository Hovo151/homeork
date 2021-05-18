package Homework9;


import java.util.Scanner;

public class AuthorTest {
    static Scanner scanner = new Scanner(System.in);
    static AuthorStorage authorStorage = new AuthorStorage();
    static BookStorage bookStorage = new BookStorage();

    public static void main(String[] args) {
        boolean run = true;
        while (run) {

            System.out.println("input 0 Add Book");
            System.out.println("input 1 Prind all books");
            System.out.println("input 2 Print Books by price range");
            System.out.println("input 3 is book Exists");
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    addbook();
                    break;
                case "1":
                    bookStorage.print();
                    break;
                case "2":
                    BooksPrice();
                    break;
                case "3":
                    bookExsist();
                    break;


                default:
            }
        }

    }

    private static void BooksPrice() {
        System.out.println("print book min prise");
        int min = Integer.parseInt(scanner.nextLine());
        System.out.println("print book max prise");
        int max = Integer.parseInt(scanner.nextLine());
        bookStorage.bookprise(min, max);
    }

    private static void bookExsist() {
        System.out.println("print book title");
        String title = scanner.nextLine();
        System.out.println("print book emeil");
        String email = scanner.nextLine();
        bookStorage.isBookExists(title, email);
    }

    public static void addAuthor() {

        System.out.println("how meny autors you have");
        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < num; i++) {
            System.out.println("please input autors data" + i + 1);
            Author author = new Author();

            System.out.println(" please input autors name");
            author.setName(scanner.nextLine());

            System.out.println(" please input autors surname");
            author.setSurname(scanner.nextLine());

            System.out.println("please input autors email");
            author.setEmail(scanner.nextLine());

            System.out.println("please input autors age");
            author.setAge(Integer.parseInt(scanner.nextLine()));

            System.out.println("please input autors gender");
            String gender = scanner.nextLine();
            if (!"male".equalsIgnoreCase(gender) &&
                    !"femail".equalsIgnoreCase(gender)) {
                System.err.println("wrong gender");
                return;
            }
            author.setGander(gender);
            authorStorage.add(author);
        }

        authorStorage.print();
        System.out.println("wrong command");
    }


    public static void addbook() {
        Book book = new Book();


        System.out.println("pliz input book title");
        book.setTitle(scanner.nextLine());

        System.out.println("pliz input book description");
        book.setDescription(scanner.nextLine());

        System.out.println("pliz input book price");
        book.setPrice(Integer.parseInt(scanner.nextLine()));

        System.out.println("pliz input book count");
        book.setCount(scanner.nextLine());

        System.out.println("pliz input book authorEmail");
        book.setAuthorEmail(scanner.nextLine());

        bookStorage.add(book);
    }
}





