package com.uabc.database.example.examplejpa.model;

import com.uabc.database.example.examplejpa.entity.UserRole;
import lombok.Data;

import java.util.Set;

@Data
public class UserModel {
    private String username;
    private String password;
    private boolean enabled;

    public UserModel(){}

    public UserModel(String username, String password, boolean enabled) {
        this.username = username;
        this.password = password;
        this.enabled = enabled;
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", enabled=" + enabled +
                '}';
    }
}
