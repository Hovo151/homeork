package Homework9;

import java.awt.print.Book;
import java.util.Scanner;

public class AuthorStorage {

    private Author[] authors = new Author[10];
    private int size = 0;

    public void add(Author author) {
        if (size == authors.length) {
            extend();
        }
        authors[size] = author;
        size++;
    }

    private void extend() {
        Author[] tmp = new Author[authors.length + 10];
        System.arraycopy(authors, 0, tmp, 0, authors.length);
        authors = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(authors[i]);
        }
    }
}













