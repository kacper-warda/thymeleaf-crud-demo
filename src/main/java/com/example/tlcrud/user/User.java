package com.example.tlcrud.user;

public class User {
    public Long id;
    public String username;
    public String email;
    public Boolean enabled;

    public User(Long id) {
        this.id = id;
        this.enabled = true;
    }

    public User(Long id, String username, String email, Boolean enabled) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.enabled = enabled;
    }
}
