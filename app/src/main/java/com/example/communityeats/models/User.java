package com.example.communityeats.models;

/*

Register:
    User:
        email,pass,username,address,


*/

public class User {
    public String email, password, username, address, profilePictureUrl;

    public User() {

    }

    public User(String email, String password, String username, String address, String profilePictureUrl) {
        this.email = email;
        this.password = password;
        this.address = address;
        this.username = username;
        this.profilePictureUrl = profilePictureUrl;
    }




    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }

    public String getAddress() {
        return this.address;
    }

    public String getUsername() {
        return this.username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getProfilePicUrl() {
        return profilePictureUrl;
    }

    public void setProfilePictureUrl(String url) {
        this.profilePictureUrl = url;
    }


}
