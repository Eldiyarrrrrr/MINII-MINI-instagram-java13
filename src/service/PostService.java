package service;

import model.Post;

import java.util.List;

public interface PostService {
    String addPostToUser(Post post);

    String deletePostByID(Long postId);

    List<Post> getPostsByUserID(Long userID);
}
