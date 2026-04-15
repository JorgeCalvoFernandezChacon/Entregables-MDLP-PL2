package org.example;

public class AuthorC2 {
    private String name;
    private String email;
    public AuthorC2(String name, String email) {
        this.name = name;
        this.email = email;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String toString() {
        return "Author[name=" + name + ",email=" + email + "]";
    }
}
