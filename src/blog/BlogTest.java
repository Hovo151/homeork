package blog;

import java.util.Date;
import java.util.Scanner;

public class BlogTest {


    static Scanner scanner = new Scanner(System.in);
    static PostStorage postStorageImpl = new PostStorageImpl();

    public static void main(String[] args) {


        boolean run = true;
        while (run) {
            System.out.println("Please input " + PostStorage.EXIT + " for exit");
            System.out.println("Please input " + PostStorage.ADD_POST + " for ADD_POST");
            System.out.println("Please input " + PostStorage.SEARCH_POST + " for SEARCH_POST");
            System.out.println("Please input " + PostStorage.POSTS_BY_CATEGORY + " for POSTS_BY_CATEGORY");
            System.out.println("Please input " + PostStorage.ALL_POSTS + " for ALL_POSTS");
            System.out.println("Please input " + PostStorage.GET_BY_TITLE + " for GET_BY_TITLE");
            System.out.println("Please input " + PostStorage.DELETE_POST + " DELETE_POST");
            System.out.println("Please input " + PostStorage.CHANGE_POST + " CHANGE_POST");
            System.out.println("Please input " + PostStorage.DELETE_BY_CATEGORY + " DELETE_BY_CATEGORY");

            int command = Integer.parseInt(scanner.nextLine());
            switch (command) {
                case PostStorage.EXIT:
                    run = false;
                    break;
                case PostStorage.ADD_POST:
                    add();
                    break;
                case PostStorage.SEARCH_POST:
                    searchPost();
                    break;
                case PostStorage.POSTS_BY_CATEGORY:
                    postsByCategory();
                    break;
                case PostStorage.ALL_POSTS:
                    postStorageImpl.printAllPosts();
                    break;
                case PostStorage.GET_BY_TITLE:
                    getByTitle();
                    break;
                case PostStorage.DELETE_POST:
                    deletePost();
                    break;
                case PostStorage.CHANGE_POST:
                    changePost();
                    break;
                case PostStorage.DELETE_BY_CATEGORY:
                    deleteByCategory();
                    break;
                default:

                    System.out.println("Wrong command");

            }
        }


    }


    private static void deletePost() {
        System.out.println("please input deletePos");
        String deletePos = scanner.nextLine();
        postStorageImpl.deletePostBytitle(deletePos);

    }

    private static void changePost() {
        System.out.println("please input changePost");
        String changePost = scanner.nextLine();
        postStorageImpl.changePostBytitle(changePost);
    }


    private static void deleteByCategory() {
    }


    private static void getByTitle() {
        System.out.println("please input title");
        String title = scanner.nextLine();
        Post post = postStorageImpl.getPostByTitle(title);
        System.out.println(post);
    }


    private static void postsByCategory() {
        System.out.println("please input category");
        String category = scanner.nextLine();
        postStorageImpl.printPostsByCategory(category);
    }

    private static void searchPost() {
        System.out.println("please input keyword");
        String keyword = scanner.nextLine();
        postStorageImpl.searchPostsByKeyword(keyword);

    }

    private static void add() {
        Post post = new Post();
        Date date = new Date();
        System.out.println("Please input title");
        post.setTitle(scanner.nextLine());
        System.out.println("Please input text");
        post.setText(scanner.nextLine());
        System.out.println("Please input category");
        categoryPrint();
        post.setCategory(Category.valueOf(scanner.nextLine()));
        post.setCreatedDate(date);
        postStorageImpl.add(post);

    }

    private static void categoryPrint() {
        for (int i = 0; i < Category.values().length; i++) {
            System.out.println(Category.values()[i]);

        }
    }

}