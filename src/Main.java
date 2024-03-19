import model.DataBase;
import model.Post;


import service.UserService;
import service.serviceImpl.PostServiceImpl;
import service.serviceImpl.UserServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        UserService userService = new UserServiceImpl();
        PostServiceImpl postService = new PostServiceImpl();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("""
                    1.register
                    2.login
                    3.getUserByEmail
                    4.getAllUsers
                    5.addPostToUser;
                    6.deletePostByID
                    7.getPostsByUserID\s
                                
                            """);

            switch (sc.nextInt()) {
                case 1 -> {
                    System.out.println(userService.register());
                }
                case 2 -> {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("напиши email");
                    String email = scanner.nextLine();
                    System.out.println("напиши password");
                    int password = scanner.nextInt();
                    System.out.println(userService.login(email, password));

                }
                case 3 -> {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println(userService.getUserByEmail(scanner.nextLine()));
                }
                case 4 -> {
                    System.out.println(userService.getAllUsers());
                }

                case 5 -> {
                    if (!DataBase.users.isEmpty()) {
                        System.out.println("Add post");
                        postService.addPostToUser(new Post());
                    }
                }
                case 6 -> {
                    if (!DataBase.posts.isEmpty()) {
                        System.out.println("Delete post");
                        postService.deletePostByID(new Scanner(System.in).nextLong());
                    } else {
                        System.out.println("post удалено");
                    }
                }
                case 7 -> {
                    if (!DataBase.posts.isEmpty()) {
                        System.out.println("ID");
                        postService.getPostsByUserID(new Scanner(System.in).nextLong());
                    } else {
                        System.out.println("create a post");
                    }

                }
            }

        }
    }
}