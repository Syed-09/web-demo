package com.example.webdemo.model;


import lombok.*;

@Getter // Generates Getters in the backend
@Setter // Generates Setters in the backend
//@Data // Generates Getter + Setters
@NoArgsConstructor // Generates Constructor with no Args
@AllArgsConstructor // Generates Constructor with all Args
//@ToString // Generates the toString() methods
public class User {
    private String userName;
    private String password;

}
