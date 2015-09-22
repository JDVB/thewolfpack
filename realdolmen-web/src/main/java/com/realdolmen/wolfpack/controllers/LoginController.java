package com.realdolmen.wolfpack.controllers;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@RequestScoped
public class LoginController implements Serializable {

    private String username;

    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String login() {

        if (username.equals("test")&& password.equals("password"))
        {
            //todo
            return "beercounter";

        }
        else
        {
            //error
            return "index";

        }


    }
}
