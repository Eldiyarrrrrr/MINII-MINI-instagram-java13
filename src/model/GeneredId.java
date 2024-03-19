package model;

public class GeneredId {
    public static long userId = 0L;
    public static long postId = 0L;

    public static long genPostId() {
        return postId++;

    }

    public static long genUserId() {
        return userId++;

    }
}
