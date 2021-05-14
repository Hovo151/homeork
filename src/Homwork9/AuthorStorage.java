package Homwork9;

import java.sql.Array;
import java.util.Scanner;

public class AuthorStorage {

    Author[] array = new Author[10];
    int size = 0;

    void add(Author author) {
        if (size == array.length) {
            extend();
        }
        array[size] = author;
        size++;
    }

    private void extend() {
        Author newArray[] = new Author[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    void print() {
        for (int i = 0; i < size; i++) {
            System.out.print( array[i]);
        }
    }

    Author createAuthor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("name");
        String name = scanner.nextLine();
        System.out.println("surneim");
        String surname = scanner.nextLine();
        System.out.println("email");
        String email = scanner.nextLine();
        System.out.println("age");
        int age = scanner.nextInt();
        System.out.println(" gender");
        String gender = scanner.nextLine();
        Author author = new Author();
        author.setName(name);
        author.setSurname(surname);
        author.setEmail(email);
        author.setAge(age);
        author.setGender(gender);
        return author;

    }
}
