package Homwork9;

import java.util.Scanner;

public class AuthorTest {
    public static void main(String[] args) {
        AuthorStorage authorStorage=new AuthorStorage();
        Scanner scanner = new Scanner(System.in);
        System.out.println("qani hat hexinak uninq");
        int num = scanner.nextInt();
        for (int i = 0; i < num; i++) {

            authorStorage.add(authorStorage.createAuthor());
        }
    authorStorage.print();
    }
    }


