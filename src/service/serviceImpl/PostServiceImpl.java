package service.serviceImpl;

import model.DataBase;
import model.GeneredId;
import model.Post;
import model.User;
import service.PostService;

import java.util.List;
import java.util.Scanner;

public class PostServiceImpl implements PostService {
    @Override
    public String addPostToUser(Post post) {
        Scanner scanner = new Scanner(System.in);
        post.setId(GeneredId.genPostId());
        System.out.println("imarge  поста");
        post.setImageUrl(scanner.nextLine());
        System.out.println("Description поста");
        post.setDescription(scanner.nextLine());
        DataBase.posts.add(post);
        return "Успешьно добавлено";
    }

    @Override
    public String deletePostByID(Long postId) {
        for (Post post : DataBase.posts) {
            if (post.getId().equals(postId)) {
                DataBase.posts.remove(post);
                System.out.println("Post удалено");

            }
        }
        return "post " + postId + "не  удалено";
    }

    @Override
    public List<Post> getPostsByUserID(Long userID) {
        for (User user : DataBase.users) {
            if (user.getId().equals(userID)) {
                System.out.println("Post user Id удалено" + userID);
                return user.getPosts();
            } else {
                System.out.println("Post  с такими id" + userID + "не существуеть");
            }
        }
        return null;
    }
}
