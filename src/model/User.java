package model;

import enums.Gender;

import java.util.List;

public class User {
    private Long id;
    private String fullName;
    private String email;
    private int password;
    private Gender gender;
    private List<Post> posts;

    public User() {

    }

    public User(Long id, String fullName, String email, int password, Gender gender, List<Post> posts) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.gender = gender;
        this.posts = posts;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public Gender getGender(Gender male, Gender female) {
        return gender;
    }

    public void setGender(Gender gender, Gender male) {
        this.gender = gender;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", gender=" + gender +
                ", posts=" + posts +
                '}';
    }
}
